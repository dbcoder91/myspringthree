package com.dbcoder;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* map 测试
* @param:
* @return:
* @author: bo.dong
* @Date: 2018-08-20 14:03:12
*/
public class MapTest {
    public static void main(String[] args) {
        for (int j=10;j<=20;j++){
            Map<Integer,List<String>> listMap=new HashMap<>();
            for(int i=1;i<=10;i++){
                if(CollectionUtils.isEmpty(listMap.get(i))){
                    listMap.put(i,new ArrayList<String>());
                }
                listMap.get(i).add("test"+i);
            }
        }
    }
}
