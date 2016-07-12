package com.services.system;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.remoting.RemoteLookupFailureException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by rcl on 2016/1/9.
 *
 */
public class RmixReferenceMethodInterceptor implements MethodInterceptor {

    private ServicesRegisterCenter servicesRegisterCenter;

    private Class interfaceInfo;

    private String serverType;

    public RmixReferenceMethodInterceptor(ServicesRegisterCenter servicesRegisterCenter, Class clazz,String serverType) {
        this.servicesRegisterCenter = servicesRegisterCenter;
        this.interfaceInfo = clazz;
        this.serverType = serverType;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        Object rmiProxy = servicesRegisterCenter.getRemoteAddressRoute().shareProxyBean(interfaceInfo);
        // 在接口实际方法调用之前 使用远程对象执行
        Object result = null;
        try {
            result = method.invoke(rmiProxy, args); //method.invoke(provider.getRmi(), args);
        } catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof RemoteLookupFailureException) {
                servicesRegisterCenter.getRemoteAddressRoute().reloadInterfaceAndBean(serverType,interfaceInfo.getSimpleName());
            } else {
                throw e;
            }
        }
        return result;
    }
}
