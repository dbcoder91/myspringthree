package com.dbcoder.collection;

import com.dbcoder.dto.PersonDto;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

public class ArraylistTest {
    public static void main(String[] args) {
       /* List<PersonDto> personDtoList = new ArrayList<>();
        PersonDto personDto = new PersonDto();
        personDto.setAge(1);
        personDto.setName("test1");
        personDtoList.add(personDto);
        personDto = new PersonDto();
        personDto.setName("test2");
        personDto.setAge(2);
        personDtoList.add(personDto);

        personDtoList.add(null);

        personDto = new PersonDto();
        personDto.setAge(3);
        personDto.setName("test3");

        personDtoList.add(personDto);
        System.out.println();*/
/*
        if (personDtoList.contains(personDto)){

        }

        personDtoList.indexOf(1);*/

        /*PersonDto personDto = new PersonDto();
        personDto.setName(null);
        initPersionDto(personDto);*/

        List<Long> longList=new ArrayList<>();
        longList.add(1L);
        longList.add(2L);
        longList.add(3L);

      /*  throw new Exception("抛一个错",longList.toString());*/

    }

    public static void initPersionDto(@Validated PersonDto personDto){
        System.out.println();
    }
}
