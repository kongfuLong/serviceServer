package com.annotations;


import java.lang.annotation.*;

/**
 * Created by rcl on 2015/10/9.
 * client端  用于引用服务
 * 接口调用
 * 字段注解
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RmiReference {
    String url() default "";        // 服务直连地址
    String serverType();
    boolean lazyLoad() default true;
    boolean reloadOnFailure() default true;
}
