package com.services.system;

import com.annotations.RmiReference;
import com.beans.GoodsInfo;
import com.interfaces.QshDbSuperInterface;
import com.services.tools.CheckTools;
import org.I0Itec.zkclient.ZkClient;
import org.apache.log4j.Logger;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by rcl on 2016/1/7.
 * 维护zookeeper里面地址引用
 *
 *
 */
@Component
public class RemoteAddressRoute {

    private final static Logger log = Logger.getLogger(RemoteAddressRoute.class);


    private String rmi_root;

    private ZkClient zk;

    private ConcurrentHashMap<Class,LinkedList<Object>> proxyBeans = new ConcurrentHashMap<>();//维护整个注册地址

    private ConcurrentHashMap<Class,List<RmiReference>> listener = new ConcurrentHashMap<>();//维护每一个引用bean

    private ConcurrentHashMap<String,ConcurrentHashMap<String,LinkedList<String>>> routeMap = new ConcurrentHashMap<>();//维护整个注册地址

    //zookeeper引用地址初始化
    public void init(String servicePath,ZkClient zk){
        this.rmi_root = servicePath;
        this.zk = zk;
        loadMap();
    }

    //接口监听  代理bean注册
    public void proxyBeanRegist(RmiReference rmiReference,Class clazz){
        String interfaceName = clazz.getSimpleName();
        if(listener.get(clazz)==null){
            //监听每个接口节点  每次会开启一个线程
            //用于及时更新节点状态  保证一个节点只有一个监听
            List<RmiReference> rmiReferences = new ArrayList<>();
            rmiReferences.add(rmiReference);
            listener.put(clazz,rmiReferences);
            zk.subscribeChildChanges(String.format("%s/%s/%s",rmi_root,rmiReference.serverType(),interfaceName),new NodeListener(rmiReference.serverType(),interfaceName,this));

        }else{
            listener.get(clazz).add(rmiReference);
        }
        proxyBean(rmiReference,clazz,interfaceName);
    }

    //代理bean初始化
    public void proxyBean(RmiReference rmiReference,Class clazz,String interfaceName){
        RmiProxyFactoryBean proxy = new RmiProxyFactoryBean();
        proxy.setServiceInterface(clazz);
        String url = rmiReference.url();
        if(CheckTools.isNull(url)){
            url = requestUrl(rmiReference.serverType(),interfaceName);
        }
        proxy.setServiceUrl(url);
        proxy.setRefreshStubOnConnectFailure(rmiReference.reloadOnFailure());
        proxy.setLookupStubOnStartup(rmiReference.lazyLoad());
        proxy.afterPropertiesSet();
        proxy.prepare();
        Object invokeObject = proxy.getObject();
        LinkedList<Object> linkedList = proxyBeans.get(clazz);
        if(linkedList!=null){
            linkedList.add(invokeObject);
        }else{
            linkedList = new LinkedList<>();
            linkedList.add(invokeObject);
            proxyBeans.put(clazz,linkedList);
        }
    }



    //代理bean分配  均衡
    public Object shareProxyBean(Class clazz){
        LinkedList<Object> linkedList = proxyBeans.get(clazz);
        if(linkedList==null){
            return null;
        }
        synchronized (linkedList) {
            Object o = linkedList.pollFirst();
            linkedList.offerLast(o);//放到最后面去
            linkedList.notifyAll();
            return o;
        }
    }

    //重载某个接口的所有代理bean
    private void reloadProxyBeans(String interfaceName){
        Iterator<Map.Entry<Class,List<RmiReference>>> iterator = listener.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Class,List<RmiReference>> entry = iterator.next();
            Class clazz = entry.getKey();
            String keyName = clazz.getSimpleName();
            if(interfaceName.equals(keyName)){
                List<RmiReference> rmiReferenceList = entry.getValue();
                for(RmiReference rmiReference : rmiReferenceList){
                    proxyBean(rmiReference,clazz,interfaceName);
                }
            }
        }


    }
    //单个接口地址重载
    private  void reloadInterface(String serverName,String interfaceName){
        String interfacePath = String.format("%s/%s/%s",rmi_root,serverName,interfaceName);
        if(!zk.exists(interfacePath)){
            log.info("注册中心没有: "+interfaceName+" 接口地址");
            return;
        }
        List<String> servers = zk.getChildren(interfacePath);
        if(servers==null || servers.size()==0){
            log.info("注册中心没有服务机提供: "+interfaceName+" 接口地址");
            return;
        }
        LinkedList<String> urls = new LinkedList<>();
        for(String server : servers){
            byte[] data  = zk.readData(String.format("%s/%s",interfacePath,server),true);
            if(data!=null){
                String url = new String(data);
                urls.add(url);
            }
        }
        ConcurrentHashMap<String,LinkedList<String>> map = new ConcurrentHashMap<>();
        if(routeMap.get(serverName)!=null){
            routeMap.get(serverName).put(interfaceName,urls);
        }else{
            map.put(interfaceName,urls);
            routeMap.put(serverName,map);
        }
    }
    //所有接口地址注册
    public void loadMap(){
        if(!zk.exists(rmi_root)){
            throw new NullPointerException("注册中心根目录不存在");
        }
        List<String> serversName = zk.getChildren(rmi_root);
        if(serversName==null || serversName.size()==0){
            throw new NullPointerException("注册中心没有任何服务地址");
        }
        for(String serverName : serversName){
            String serverPath = String.format("%s/%s",rmi_root,serverName);
            if(!zk.exists(serverPath)){
                throw new NullPointerException(serverName+":目录不存在");
            }
            List<String> interfaceNames = zk.getChildren(serverPath);
            if(interfaceNames==null || interfaceNames.size()==0){
                log.info(serverName+":目录下没有接口");
                continue;
            }
            for(String interfaceName : interfaceNames){
                reloadInterface(serverName,interfaceName);
            }
            
        }
    }

    //获取url
    public String requestUrl(String serverName,String interfaceName){
        LinkedList<String> urls = routeMap.get(serverName).get(interfaceName);
        if(urls==null || urls.size()==0)
        {
            return null;
        }
        synchronized (urls) {
            String url = urls.pollFirst();
            urls.offerLast(url);//放到最后面去
            urls.notifyAll();
           return url;
        }
    }

    public void reloadInterfaceAndBean(String serverName,String simpleName) {
        reloadInterface(serverName,simpleName);
        reloadProxyBeans(simpleName);
    }
}
