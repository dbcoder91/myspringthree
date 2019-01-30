package com.dbcoder.collection;

import com.dbcoder.dto.PersonDto;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArraylistTest {
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

        List<PersonDto> personDtoList = new ArrayList<>();
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
        System.out.println(a);


    }

    public static List<Long> getListOne(List<Long> longList){
        longList.add(1L);
        longList.add(2L);
        longList.add(3L);
        return longList;
    }


    public static List<Long> getListTwo(List<Long> longList){
        longList.add(4L);
        longList.add(5L);
        longList.add(6L);
        return longList;
    }

    public static void initPersionDto(@Validated PersonDto personDto){
        System.out.println();
    }

    public static String testChangeArrayListValue ( List<PersonDto> personDtoList) {
        for (PersonDto personDto1:personDtoList) {
            personDto1.setName("12345");
        }
        return "1";
    }
}
