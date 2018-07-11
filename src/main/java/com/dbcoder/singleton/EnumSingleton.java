package com.dbcoder.singleton;

import java.io.Serializable;

/**
* @Description:  枚举实现单例的最佳实现（天生线程安全）
* @author 董博
* @date 2018/7/11
*/
public class EnumSingleton implements Serializable {

    private EnumSingleton(){}

    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton{//static 要不要无所谓
        INSTANCE;
        private EnumSingleton singleton;
        /**
         * JVM会保证此方法绝对只调用一次(枚举的构造方法是私有的，且枚举的构造方法只会加载一次)
         */
        Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}
