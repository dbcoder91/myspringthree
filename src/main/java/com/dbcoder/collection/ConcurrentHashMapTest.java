package com.dbcoder.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
* @Description:ConcurrentHashMap测试类
* @author: bo.dong
* @Date: 2019-07-09 10:53:43
*/
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        a();
        System.out.println(args);
    }

   static String a () {
        return "包保护";
    }
}
