package com.dbcoder.collection;

import com.dbcoder.dto.PersonDto;

import java.util.*;

/**
* @Description:hashmap测试类
* @author: bo.dong
* @Date: 2019-02-14 14:44:59
*/
public class HashMapTest {
    public static void main(String[] args) {
       /* HashMap<String*//* clusterName *//*, Set<String*//* brokerName *//*>> hashMap = new HashMap<String, Set<String>>(32);
        Set<String> brokerNames = new HashSet<>();
        brokerNames.add("111");
        hashMap.put("key1", brokerNames);
        brokerNames.add("222");
        System.out.println("测试成功！");*/

        Map<Integer,List<PersonDto>> listMap = new HashMap<>();

        List<PersonDto> personDtoList = new ArrayList<>();
        PersonDto personDto1 =new PersonDto();
        personDto1.setName("test1");
        personDtoList.add(personDto1);

        personDto1 = new PersonDto();
        personDto1.setName("test2");
        personDtoList.add(personDto1);


        List<PersonDto> personDtos = new ArrayList<>();
        PersonDto personDto2 = new PersonDto();
        personDto2.setName("test3");
        personDtos.add(personDto2);

        listMap.put(1,personDtos);
        System.out.println();
    }
}
