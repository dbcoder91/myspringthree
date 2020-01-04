package com.dbcoder.collection;

import com.dbcoder.dto.PersonDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
* @Description:hashmap测试类
* @author: bo.dong
* @Date: 2019-02-14 14:44:59
*/
public class HashMapTest {
    public static void main(String[] args) {
        Set<String> brokerNames = new HashSet<>();
        brokerNames.add("111");
        brokerNames.add("222");
        System.out.println("测试成功！");

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
