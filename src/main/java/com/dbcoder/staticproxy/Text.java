package com.dbcoder.staticproxy;

/**
* @Description: 测试代码
* @author 董博
* @date 2018/7/5
*/
public class Text {
    public static void main(String[] args) {
        //静态代理测试
       /* Proxy proxy=new Proxy(new RealObject());
        proxy.doSomething();*/

        //动态代理测试
        RealObject realObject=new RealObject();
        Action proxyDynamic=(Action) java.lang.reflect.Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Action.class},new DynamicProxyHandler(realObject));
        proxyDynamic.doSomething();
    }
}
