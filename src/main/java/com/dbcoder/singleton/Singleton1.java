package com.dbcoder.singleton;

/**
* @Description:
* @author 董博
* @date 2018/7/11
*/
public class Singleton1 {
    private static Singleton1 sin=new Singleton1();    ///直接初始化一个实例对象
    private Singleton1(){    ///private类型的构造函数，保证其他类对象不能直接new一个该对象的实例
    }
    public static Singleton1 getSin(){    ///该类唯一的一个public方法
        return sin;
    }
}
