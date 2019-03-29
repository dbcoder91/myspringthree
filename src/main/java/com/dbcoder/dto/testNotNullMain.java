package com.dbcoder.dto;

import java.math.BigDecimal;

/**
* @Description:测试 notnull注解
* @author: bo.dong
* @Date: 2018-11-15 14:56:54
*/
public class testNotNullMain {
    public static void main(String[] args) {
       /* int a=1;
        Integer b=2;
        Integer c=1;
        System.out.println(a==b.intValue());
        System.out.println(a==c.intValue());*/
     /*  Cat1 cat1 = new Cat1();
       CatSub catSub = new CatSub();

       testInstance(cat1);
       testInstance(catSub);
        System.out.println();*/
        BigDecimal a =new BigDecimal(123);
        BigDecimal b = new BigDecimal(2);
        System.out.println(a.multiply(b));
    }

    public static void testInstance(Cat1 cat1) {
        if (cat1 instanceof CatSub) {
            ((CatSub) cat1).setTest("aaa");
        }
    }
}
