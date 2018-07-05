package com.dbcoder.staticproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @Description: 使用动态代理
* @author 董博
* @date 2018/7/5
*/
public class DynamicProxyHandler implements InvocationHandler {
    private Object realObject;

    public DynamicProxyHandler(Object realObject){
        this.realObject=realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理扩展逻辑
        System.out.println("proxy do");

        return method.invoke(realObject,args);
    }
}
