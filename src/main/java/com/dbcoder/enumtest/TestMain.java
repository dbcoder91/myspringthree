package com.dbcoder.enumtest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class TestMain {
    public static AtomicLong stressDataCursor = new AtomicLong(0);

    public static void main(String[] args) {
        List<Long> stressDataList=new ArrayList<>();
        /*stressDataList.add(1L);*/
        /*String name = TestTypeEnum.GetTestName("test");*/

      /*  String a="1";
        Long b=1L;
        System.out.println(a.equals(b));*/
      //原子性的操作,线程安全的
       /* Long tempCursor = stressDataCursor.getAndIncrement();
        if (tempCursor > stressDataList.size()) {
            stressDataCursor = new AtomicLong(0);
        }
        System.out.println(tempCursor);*/

        /*BigDecimal a=new BigDecimal(9);
        BigDecimal b=new BigDecimal(2);
        System.out.println(a.divide(b,0));*/

        String jsonStr = "{\"name\":\"三班\",\"students\":[{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"露西\",\"score\":{\"网络协议\":98,\"JavaEE\":92,\"计算机基础\":93},\"weight\":51.3},{\"age\":26,\"gender\":\"male\",\"grades\":\"三班\",\"name\":\"杰克\",\"score\":{\"网络安全\":75,\"Linux操作系统\":81,\"计算机基础\":92},\"weight\":66.5},{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"莉莉\",\"score\":{\"网络安全\":95,\"Linux操作系统\":98,\"SQL数据库\":88,\"数据结构\":89},\"weight\":55}]}";

      /*  JSONObject jsonObject = JSONObject.fromObject(jsonStr);

        Grades grades = (Grades) JSONObject.toBean(jsonObject, Grades.class);*/
    }
}



