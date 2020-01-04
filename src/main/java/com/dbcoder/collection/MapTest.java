package com.dbcoder.collection;


import com.dbcoder.dto.PersonDto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {
    public static void main(String[] args) {
      /*  Map<String,String> map=new HashMap<>();
        System.out.println(map.get("a"));*/
     /*   BigDecimal a=new BigDecimal(12.126);


        System.out.println("本地默认格式输出货币值：" + currencyFormatValue(a));
        System.out.println("本地默认格式输出货币值2：" + formatValue(a, "￥", "", "0.00"));
        System.out.println(a);
*/
       /* List<PersonDto> personDtoList=new ArrayList<>();
        PersonDto personDto=new PersonDto();
        personDto.setAge(1);
        personDtoList.add(personDto);
        personDto.setAge(2);
        personDtoList.add(personDto);
        personDto=new PersonDto();
        personDto.setAge(3);
        personDtoList.add(personDto);

        for(PersonDto personDto1:personDtoList){
            System.out.println(personDto1.getAge());
        }*/

       /*Integer a=0;
        System.out.println(a);
        Integer b=new Integer(0);
        System.out.println(b);*/

        List<PersonDto> personDtos = new ArrayList<>();
        PersonDto p = new PersonDto();
        p.setAge(1);
        p.setName("小一");
        personDtos.add(p);

        p = new PersonDto();
        p.setAge(2);
        p.setName("小二");
        personDtos.add(p);

        p = new PersonDto();
        p.setAge(1);
        p.setName("小五");
        personDtos.add(p);

        Map<Integer, PersonDto> personDtoMap = personDtos
                .stream()
                .collect(Collectors.toMap(PersonDto::getAge, personDto -> personDto,(k1,k2)->k2));
        Boolean isContainsKey = personDtoMap.containsKey(3);
        Map<Integer, List<PersonDto>> integerListMap = personDtos
                .stream()
                .collect(Collectors.groupingBy(PersonDto::getAge));
        Boolean isContainsKeyMaplist = integerListMap.containsKey(1);
        System.out.println("1");
    }

    public static void testListString(List<String> list){
        list.add("从来不纠结");
    }

    public static String currencyFormatValue(BigDecimal num){
        if(num!=null){
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
            return currencyFormat.format(num);
        }else{
            return "";
        }
    }

    public static String formatValue(Object value, String prefix, String sufFix, String replace) {

        if (prefix == null) {
            value = "";
        }

        if (sufFix == null) {
            sufFix = "";
        }

        if (replace == null) {
            replace = "";
        }

        if (value == null) {
            value = replace;
        } else if (value instanceof BigDecimal) {
            if (value.equals(BigDecimal.ZERO)) {
                value = replace;
            }
        }

        return new StringBuilder(prefix).append(value).append(sufFix).toString();
    }
}
