package com.services.system;

import org.I0Itec.zkclient.IZkChildListener;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by rcl on 2016/1/7.
 */
public class NodeListener implements IZkChildListener{

    private static final Logger log = Logger.getLogger(NodeListener.class);


    private String interfaceName;

    private RemoteAddressRoute remoteAddressRoute;

    private String serverType;


    public NodeListener(String serverType,String interfaceName, RemoteAddressRoute remoteAddressRoute) {
        this.interfaceName = interfaceName;
        this.remoteAddressRoute = remoteAddressRoute;
        this.serverType = serverType;
    }

    @Override
    public void handleChildChange(String s, List<String> strings) throws Exception {
        log.info("检测到节点变化.....");
        remoteAddressRoute.reloadInterfaceAndBean(serverType,interfaceName);
    }
}
