package com.dbcoder.singleton;

/**
* @Description: 线程安全的
* @author 董博
* @date 2018/7/11
*/
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){

    }
    public static synchronized Singleton2 getInstance(){    //对获取实例的方法进行同步
        if (instance == null)
            instance = new Singleton2();
        return instance;
    }
}
