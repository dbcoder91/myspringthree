package com.dbcoder.dto;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.*;

public class testObjectMain {
    private static CatSub catSub;

    public static void main(String[] args) {
     /*   Cat1 cat1 = new Cat1();
        cat1.setA(1);

        Cat1 cat11 = new Cat1();
        cat11.setA(cat1.getA());

        cat1.setA(2);

        System.out.println("cat1:" + cat1.getA() + ",cat11:" + cat11.getA());*/
        /*Map<Integer, Cat1> map = new HashMap<>();
        List<Cat1> cat1List = new ArrayList<>();
        Cat1 cat1 = new Cat1();
        cat1.setA(1);
        cat1.setB(2L);
        cat1.setC(true);
        cat1.setD(new Date());
        cat1List.add(cat1);
        cat1 = new Cat1();
        cat1.setA(11);
        cat1.setB(22L);
        cat1.setC(false);
        cat1.setD(new Date());
        cat1List.add(cat1);

        for (Cat1 item:cat1List) {
            map.put(item.getA(),item);
        }

        List<Cat2> cat2List = new ArrayList<>();
        Cat2 cat2 = new Cat2();
        cat2.setA(1);
        cat2.setB(2L);
        cat2.setC(false);
        cat2List.add(cat2);

        for (Cat2 item:cat2List) {
            if (map.containsKey(item.getA())) {
                System.out.println();
            }
        }
        //copyPropertiesList(cat1List,cat2List,Cat2.class);
       *//* for (Cat1 cat11:cat1List) {
            Cat1 cat111 = new Cat1();
            BeanUtils.copyProperties(cat11,cat111);
            cat2List.add(cat111);
        }*//*
        System.out.println();*/
        /*testA(cat1);*/
       /* testRefType();
        CatSub catSub1 = catSub;
        System.out.println();*/


        /*Cat1 cat1 =testCat1();
        if (cat1 instanceof CatSub) {

            CatSub catSub1 = (CatSub)cat1;
            catSub1.setTest("a");
        }
        System.out.println();*/

        int a = 1;
        List<Integer> integers = new ArrayList<>();
        integers.add(a);
        System.out.println();
    }

    public static Cat1 testCat1() {
        Cat1 cat1 = new CatSub();
        cat1.setA(1);
        return cat1;
    }

    public static <T> void testA(T cat) {
        Class<?> tClass = cat.getClass();
        System.out.println("");
    }

    public static <T, V> void copyPropertiesList(List<T> sourceList, List<V> targetList, Class<V> cls) {
        try {
            for (T source : sourceList) {
                V target = cls.newInstance();
                BeanUtils.copyProperties(source, target);
                targetList.add(target);
            }
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static <T> List copyList(List<T> list) {
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList();
        }
        return JSON.parseArray(JSON.toJSONString(list), list.get(0).getClass());
    }

    public static void testRefType() {
        String a = "{\"test\":\"test引用类型\"}";
        catSub = JSON.parseObject(a, CatSub.class);
        System.out.println();
    }

}
