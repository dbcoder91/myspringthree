package com.dbcoder.dto;

/**
* @Description:测试 notnull注解
* @author: bo.dong
* @Date: 2018-11-15 14:56:54
*/
public class testNotNullMain {
    public static void main(String[] args) {
        int a=1;
        Integer b=2;
        Integer c=1;
        System.out.println(a==b.intValue());
        System.out.println(a==c.intValue());
    }
}
