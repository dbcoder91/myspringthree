package com.dbcoder.staticproxy;

/**
* @Description: 代理对象
* @author 董博
* @date 2018/7/5
*/
public class Proxy implements Action {
    private Action realObject;

    public Proxy(Action realObject){
        this.realObject=realObject;
    }

    @Override
    public void doSomething() {
        System.out.println("proxy do");
        realObject.doSomething();
    }
}
