package com.dbcoder.staticproxy;

/**
* @Description: 真实对象
* @author 董博
* @date 2018/7/5
*/
public class RealObject  implements Action{
    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}
