package com.services.system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by rcl on 2015/12/30.
 */
public class SpringApplication {

    private ApplicationContext applicationContext;

    private static SpringApplication ourInstance = new SpringApplication();

    public static SpringApplication getInstance() {
        return ourInstance;
    }

    private SpringApplication() {
        applicationContext = new ClassPathXmlApplicationContext("server.xml");
    }

    public ApplicationContext getApplicationContext(){
        if(applicationContext==null){
            return new FileSystemXmlApplicationContext("server.xml");
        }else{
            return applicationContext;
        }
    }


}
