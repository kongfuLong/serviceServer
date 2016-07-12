package com.test;

import com.beans.GoodsInfo;
import com.interfaces.GoodsServiceIf;
import com.interfaces.QshDbSuperInterface;
import com.services.impls.DbHelper;
import com.services.impls.GoodsService;
import com.services.system.BeanPropertyRowMap;
import com.services.system.SpringApplication;
import com.services.tools.CheckTools;
import org.codehaus.jackson.map.deser.impl.BeanPropertyMap;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rcl on 2016/1/6.
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.getInstance().getApplicationContext();
        //context.start();
        //SpringDbHelper qshDbSuperInterface = context.getBean(SpringDbHelper.class);
       // Annotation[] an = SpringDbHelper.class.getAnnotations();

        String goods=
                context.getBean(GoodsService.class).qeuryGoods("2014121000000064");
       System.out.print(goods);
       /* Map<String,Object> map = new HashMap<>();
        map.put("goods_name","asdasdasd");
        BeanPropertyRowMap beanPropertyMap = new BeanPropertyRowMap(GoodsInfo.class);
        beanPropertyMap.mapRow(map);*/

    }




}
