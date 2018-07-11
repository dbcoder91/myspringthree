package com.dbcoder.singleton;

/**
* @Description: 多线程安全单例模式实例三(使用双重同步锁)
* @author 董博
* @date 2018/7/11
*/
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3 (){
    }
    public static Singleton3 getInstance(){    //对获取实例的方法进行同步
        if (instance == null){
            synchronized(Singleton3.class){
                if (instance == null)
                    instance = new Singleton3();
            }
        }
        return instance;
    }
}
