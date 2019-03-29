package com.dbcoder.lambdaTest;

import com.dbcoder.dto.PersonDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<PersonDto> personDtoList = new ArrayList<>();

        PersonDto personDto = new PersonDto();
        personDto.setAge(1);
        personDto.setName("test1");
        personDtoList.add(personDto);


        personDto = new PersonDto();
        personDto.setAge(2);
        personDto.setName("test2");
        personDtoList.add(personDto);

        personDto = new PersonDto();
        personDto.setAge(3);
        personDto.setName("test3");
        personDtoList.add(personDto);

        Integer age = personDtoList.stream().filter(personDto1 -> personDto1.getName() == "test3").findFirst().get().getAge();
        Integer age2 = personDtoList.stream()
                .filter(personDto1 -> personDto1.getName() == "test3")
                .map(PersonDto::getAge)
                .findAny()
                .orElse(0);
        String ageStr = personDtoList.stream().map(personDto1 -> personDto1.getAge().toString()).reduce("",String::concat);

        personDtoList.stream().forEach(personDto1 -> {
            Integer abc = 123;
            System.out.println(abc);
            abc = 456;
            System.out.println(abc);
        });
        Integer result = personDtoList.stream().map(PersonDto::getAge).reduce(0,ArrayListTest::integerAdd);
        System.out.println(result);
        System.out.println(age);
        System.out.println(ageStr);
        System.out.println(age2);
        BigDecimal a = new BigDecimal(2);
        BigDecimal b = new BigDecimal(1);
        System.out.println(a.subtract(b));
    }

    public static Integer integerAdd(Integer a, Integer b) {
        return a + b;
    }
}
