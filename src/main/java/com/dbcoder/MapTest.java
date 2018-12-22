package com.dbcoder;

import com.dbcoder.dto.PersonDto;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * map 测试
 *
 * @param:
 * @return:
 * @author: bo.dong
 * @Date: 2018-08-20 14:03:12
 */
public class MapTest {
    public static void main(String[] args) {
        testArrayListToMap();
    }

    public static void testMap1() {
        for (int j = 10; j <= 20; j++) {
            Map<Integer, List<String>> listMap = new HashMap<>();
            for (int i = 1; i <= 10; i++) {
                if (CollectionUtils.isEmpty(listMap.get(i))) {
                    listMap.put(i, new ArrayList<String>());
                }
                listMap.get(i).add("test" + i);
            }
        }
    }

    public static void testArrayListToMap() {
        List<PersonDto> personDtoList = new ArrayList<>();
        PersonDto personDto = new PersonDto();
        personDto.setAge(1);
        personDto.setName("测试1");
        personDtoList.add(personDto);
        personDto = new PersonDto();
        personDto.setAge(1);
        personDto.setName("测试1");
        personDtoList.add(personDto);
        personDto = new PersonDto();
        personDto.setAge(2);
        personDto.setName("测试2");
        personDtoList.add(personDto);

        Map<Integer, List<PersonDto>> map = new HashMap<>();
        for (PersonDto item : personDtoList) {
            List<PersonDto> personDtos = map.get(item.getAge());
            if (CollectionUtils.isEmpty(personDtos)) {
                personDtos = new ArrayList<>();
                personDtos.add(item);
            } else {
                personDtos.add(item);
            }
            map.put(item.getAge(), personDtos);
        }

        System.out.println("测试成功");
    }
}
