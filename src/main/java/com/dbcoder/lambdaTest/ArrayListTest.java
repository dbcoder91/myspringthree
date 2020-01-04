package com.dbcoder.lambdaTest;

import com.dbcoder.dto.PersonDto;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListTest {
    private static int a = 0;

    public static void main(String[] args) {
       /* List<PersonDto> personDtoList = new ArrayList<>();

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
        personDtoList.stream()
                .filter(personDto1 -> personDto1 != null)
                .forEach(personDto1 -> personDto1.setName("哈哈"));
        personDtoList.stream().forEach(System.out::println);
        personDtoList.forEach(System.out::println);
        Integer result = personDtoList.stream().map(PersonDto::getAge).reduce(0,ArrayListTest::integerAdd);
        System.out.println(result);
        System.out.println(age);
        System.out.println("ageStr:"+ageStr);
        System.out.println(age2);
        BigDecimal a = new BigDecimal(2);
        BigDecimal b = new BigDecimal(1);
        System.out.println(a.subtract(b));
        System.out.println("--------------------");

        List<Integer> aStr = new ArrayList<>();
        aStr.add(123);
        aStr.add(456);
        String JoinString = StringUtils.join(aStr);
        System.out.println("JoinString:" + JoinString.toString());
        List<PersonDto> personDtos = new  ArrayList();*/
//        int a;
//        System.out.println(a);
    }

    public static Integer integerAdd(Integer a, Integer b) {
        return a + b;
    }

    public static String StringJoinSeparator(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        if (StringUtils.isNotEmpty(stringBuilder.toString())) {
            stringBuilder.append(",");
        }
        return stringBuilder.append(a).toString();
    }

    public void testA() {
        a = 1;
    }
}
