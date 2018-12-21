package com.dbcoder.json;

import com.alibaba.fastjson.JSON;
import com.dbcoder.dto.Cat1;

/**
* @Description:JSON转换测试类
* @author: bo.dong
* @Date: 2018-11-22 19:45:01
*/
public class JsonObjectTestMain {
    public static void main(String[] args) {
        Cat1 a=new Cat1();
        a.setA(1);
        Integer b=a.getA();

        Cat1 cat1=new Cat1();
        cat1.setA(b++);

        System.out.println(cat1.getA());


    }
}
