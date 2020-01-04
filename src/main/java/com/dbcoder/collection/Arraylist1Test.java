package com.dbcoder.collection;

import com.alibaba.fastjson.JSON;
import com.dbcoder.dto.PersonDto;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Arraylist1Test {
    public static void main(String[] args) {
/*
        if (personDtoList.contains(personDto)){

        }

        personDtoList.indexOf(1);*/

        /*PersonDto personDto = new PersonDto();
        personDto.setName(null);
        initPersionDto(personDto);*/
/*
        List<Long> longList=new ArrayList<>();
        longList = getListOne(longList);

        longList = getListTwo(longList);

        System.out.println();*/

        /*List<String> aList =new ArrayList<>();

        List<String> bList = new ArrayList<>();
        bList.add("4");
        bList.add("5");
        bList.add("6");
        for (String item:aList) {

        }

        System.out.println(bList.containsAll(aList));*/

     /*   BigDecimal a = new BigDecimal(1);
       a= a.add(new BigDecimal(2));
        System.out.println(a);*/

/*        List<PersonDto> personDtoList = new ArrayList<>();
        PersonDto personDto = new PersonDto();
        personDto.setAge(1);
        personDto.setName("test1");
        personDtoList.add(personDto);
        personDto = new PersonDto();
        personDto.setName("test2");
        personDto.setAge(2);
        personDtoList.add(personDto);


        personDto = new PersonDto();
        personDto.setAge(3);
        personDto.setName("test3");

        personDtoList.add(personDto);
       String a = testChangeArrayListValue(personDtoList);
        System.out.println(a);*/
 /*       List<String> testListString = Arrays.asList("a","b");
        List<String> testListStrings = Arrays.asList(new String[]{"1","2"});
        System.out.println();*/
      /*  testAAA("a","b","c");
        testAAA(new String[] {"1","2"});*/
//      BigDecimal b = null;
//      testReturn(b);
//        System.out.println(b);

        List<PersonDto> personDtoList = new ArrayList<>();
        PersonDto p = new PersonDto();
        p.setName("test1");
        p.setAge(10);
        p.setAmount(new BigDecimal(10));
        personDtoList.add(p);
        p = new PersonDto();
        p.setName("test2");
        p.setAge(9);
        p.setAmount(new BigDecimal(9));
        personDtoList.add(p);

//
//        List<PersonDto> personDtoList1 = new ArrayList<>();
//        p = new PersonDto();
//        p.setName("test2");
//        personDtoList1.add(p);
//
//        p = new PersonDto();
//        p.setName("test1");
//        personDtoList1.add(p);
//
//
//        if (personDtoList.containsAll(personDtoList1)) {
//
//        }

        /*for (PersonDto personDto : personDtoList) {
            if (personDto != null) {
                personDto.setName(personDto.getName().trim());
                personDto.setAge(2);
                personDto.setTestAge(null);
            }
        }*/
//        List<PersonDto> personDtoList2 = new ArrayList<>();
//        if (CollectionUtils.isEmpty(personDtoList2)) {
//            System.out.println();
//        }
//
//        System.out.println();

     /*  List<String> stringList = new ArrayList<>();
       stringList.add("test1 ");
       for (String s : stringList) {
           s = s.trim();
       }
        System.out.println();*/

//    final String a = "Y";
//     String b = "Y";
//        System.out.println(a == b);
//        BigDecimal a = new BigDecimal(100);
//        BigDecimal b = new BigDecimal(50);
//        BigDecimal c = a.subtract(b);
//        System.out.println(c);
       /* for (PersonDto personDto : personDtoList) {
            if (personDto.getAge().equals(9)) {
                personDto.setAmount(BigDecimal.ZERO);
            }
        }
        personDtoList = personDtoList.stream().sorted(Comparator.comparing(PersonDto::getAge)).collect(Collectors.toList());
        for (PersonDto personDto : personDtoList) {
            System.out.println(personDto.getAmount());
        }

        Long a = 100L;
        String b = a.toString();*/
      /* List<PersonDto> personDtos = new ArrayList<>();
        personDtos.add(null);
        PersonDto personDto = new PersonDto();
        personDto.setAmount(BigDecimal.ZERO);
        personDtos.add(personDto);
       personDtos.stream().forEach(personDto1 -> {
           System.out.println(personDto1.getAmount());
       });*/
        String personDtoStr = "";
        List<PersonDto> personDtos = JSON.parseArray(personDtoStr, PersonDto.class);
        System.out.println();
    }

    public void testString(String a) {
        System.out.println();
    }

    public static void testReturn(BigDecimal a) {
        a = BigDecimal.ZERO;
    }

    public static List<Long> getListOne(List<Long> longList) {
        longList.add(1L);
        longList.add(2L);
        longList.add(3L);
        return longList;
    }


    public static List<Long> getListTwo(List<Long> longList) {
        longList.add(4L);
        longList.add(5L);
        longList.add(6L);
        return longList;
    }

    public static void initPersionDto(@Validated PersonDto personDto) {
        System.out.println();
    }

    public static String testChangeArrayListValue(List<PersonDto> personDtoList) {
        for (PersonDto personDto1 : personDtoList) {
            personDto1.setName("12345");
        }
        return "1";
    }


    public static <T> void testAAA(T... a) {
        System.out.println("abc");
    }
}
