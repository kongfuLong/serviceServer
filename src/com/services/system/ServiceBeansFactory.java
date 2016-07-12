package com.services.system;

import com.annotations.RmiReference;
import com.annotations.RmiService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;


/**
 * Created by rcl on 2016/1/7.
 * 自动化引用服务 与注册服务  生产中心
 */
@Component
public class ServiceBeansFactory extends InstantiationAwareBeanPostProcessorAdapter {

    @Autowired
    private ServicesRegisterCenter servicesRegisterCenter;


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        RmiService rmiService = bean.getClass().getAnnotation(RmiService.class);

        if(rmiService!=null){
            //去注册中心进行注册接口
            //1.发布服务接口rmi 2.接口注册到zookeeper注册中心
            servicesRegisterCenter.registerRemote(rmiService,bean);
        }
        //查找是否有远程调用
            Field[] fields = bean.getClass().getDeclaredFields();
            for(Field field : fields){
                RmiReference rmiReference = field.getAnnotation(RmiReference.class);
                if(rmiReference!=null){
                    Class<?> interfaceInfo = field.getType();
                    //去注册中心获取接口rmi地址 初始化接口
                    servicesRegisterCenter.initRemote(rmiReference,interfaceInfo);
                    //使用动态代理，用来自动切换rmi服务器
                    Enhancer enhancer = new Enhancer();
                    enhancer.setSuperclass(interfaceInfo);
                    enhancer.setCallback(new RmixReferenceMethodInterceptor(servicesRegisterCenter,interfaceInfo,rmiReference.serverType()));
                    Object referenceServiceProxy = enhancer.create();
                    try {
                        field.set(bean, referenceServiceProxy);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        return bean;
    }
}
