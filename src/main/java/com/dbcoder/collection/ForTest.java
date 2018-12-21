package com.dbcoder.collection;

import com.dbcoder.dto.PersonDto;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:测试for循环
 * @author: bo.dong
 * @Date: 2018-12-08 15:45:42
 */
public class ForTest {
    public static void main(String[] args) {
        //测试for循环空对象
        List<PersonDto> personDtoList = new ArrayList<>();
        personDtoList = null;
        for (PersonDto personDto : personDtoList) {
            System.out.println("测试一下:for循环体内");
        }
        System.out.println("测试一下:for循环体外");
    }
}
