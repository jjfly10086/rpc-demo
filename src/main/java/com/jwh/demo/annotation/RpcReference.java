package com.jwh.demo.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/10/11 0011.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RpcReference {

}
