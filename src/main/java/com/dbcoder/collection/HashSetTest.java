package com.dbcoder.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
* @Description:测试HashSet去重
* @author: bo.dong
* @Date: 2018-11-20 18:15:42
*/
public class HashSetTest {
    public static void main(String[] args) {
        List<Long> IdList=new ArrayList<>();
        IdList.add(2L);
        IdList.add(2L);
        IdList.add(2L);
        IdList.add(2L);

        List<Long> IdList1=new ArrayList<>();
        IdList1.add(1L);
        IdList1.add(2L);
        IdList1.add(3L);
        IdList1.add(1L);

        HashSet h=new HashSet(IdList);
        IdList.clear();
        IdList.addAll(h);
        if (IdList.size()==IdList1.size()){
            System.out.println("测试成功");
        }
    }
}
