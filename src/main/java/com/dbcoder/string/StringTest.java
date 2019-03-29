package com.dbcoder.string;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dbcoder.dto.PersonDto;
import com.dbcoder.dto.TestDto;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String[] args) {
      /*  String a="/pages/goods/detail";

        int index=a.indexOf("?");
        System.out.println("index:"+index);
        String b=a.substring(0,index);
        System.out.println(b);
        int indexa=b.indexOf("/pages");
        System.out.println(indexa);
        String target="/pages";
        if (indexa == 0) {
            target="/pages";
        }else{
            target="pages";
        }
        String b2 = b.replace(target, "");
        System.out.println(b2);*/
      /*  List<PersonDto> personDtoList=new ArrayList<>();
        PersonDto personDto1=new PersonDto();
        personDto1.setAge(1);
        personDto1.setName("1");
        List<TestDto> testDtos=new ArrayList<>();
        TestDto testDto1=new TestDto();
        testDto1.setName("testDto1");
        testDtos.add(testDto1);
        TestDto testDto2=new TestDto();
        testDto2.setName("testDto2");
        testDtos.add(testDto2);
        personDto1.setTestDtos(testDtos);

        Iterator<TestDto> iterator=personDto1.getTestDtos().iterator();

        while (iterator.hasNext()){
            TestDto testDto=iterator.next();
            if(testDto.getName().equals("testDto1")){
                testDto.setName("testDto1-1");
            }
        }*/
        /*for(TestDto testDto:personDto1.getTestDtos()){
            if(testDto.getName().equals("testDto1")){
                testDto.setName("testDto1-1");
            }
        }*/

      /*  for(TestDto testDto:personDto1.getTestDtos()){
            System.out.println(testDto.getName());
        }

        System.out.println(personDto1.getTestDtos().get(0).getName());*/
        /*List<PersonDto> personDtoList=new ArrayList<>();
        PersonDto personDto1=new PersonDto();
        personDto1.setAge(1);
        personDto1.setName("1");
        List<TestDto> testDtos=new ArrayList<>();
        TestDto testDto1=new TestDto();
        testDto1.setName("testDto1");
        testDtos.add(testDto1);
        TestDto testDto2=new TestDto();
        testDto2.setName("testDto2");
        testDtos.add(testDto2);
        personDto1.setTestDtos(testDtos);
        personDtoList.add(personDto1);

        PersonDto personDto2=new PersonDto();
        personDto2.setAge(2);
        personDto2.setName("2");
        personDtoList.add(personDto2);

        for (PersonDto personDto:personDtoList){
            if (personDto.getName().equals("1")){
                personDto.setName("11");
            }

            if(personDto.getAge()==1){
                personDto.setAge(11);
            }

            System.out.println("1-----"+personDto.getName()+":"+personDto.getAge());
        }

        for (PersonDto personDto:personDtoList){
            System.out.println("2-----"+personDto.getName()+":"+personDto.getAge());
        }*/

      /*  String a = "a";
        String b = a;
        a = "aa";
        System.out.println(a);
        System.out.println(b);*/

        /*PersonDto personDto=new PersonDto();
        List<TestDto> testDtoList=new ArrayList<>();
        TestDto testDto=new TestDto();
        testDto.setName("test1");
        testDtoList.add(testDto);
        testDto=new TestDto();
        testDto.setName("test2");
        testDtoList.add(testDto);
        personDto.setTestDtos(testDtoList);

        for (TestDto testDto1:personDto.getTestDtos()){
            testDto1.setName("test");
        }

        for (TestDto testDto1:personDto.getTestDtos()){
            System.out.println(testDto1.getName());
        }*/

        /*Integer a=0;
        for(int i=0;i<10;i++){
            a+=1;
            System.out.println("subI:"+i+"subA:"+a);
        }
        System.out.println(a);*/

        //System.out.println(isMobileNO("大哥"));
        //System.out.println(convertStringToBigDecimal("12.233"));
       /* Long a=1L;
        System.out.println(new BigDecimal(a));*/
       /*Integer a=0;
        System.out.println(a==0);
        System.out.println(a.equals(0));*/
        /*System.out.println(isMobileNO("11111111111"));*/
        /*System.out.println(BigDecimal.ZERO.compareTo(BigDecimal.ONE));*/
        /*System.out.println(isMobileNO("19999999999"));*/
        /*System.out.println(new Date());*/
        /*PersonDto personDto=new PersonDto();
        personDto.setName("test");
        personDto.setAge(10);
        String jsonString= JSON.toJSONString(personDto);
        System.out.println(jsonString);*/

        /*String test = "12";
        String[] testArray = test.split(",");
        BigDecimal a = new BigDecimal(testArray[0]);
        BigDecimal b = new BigDecimal(testArray[1]);
        System.out.println("a:" + a + ",b:" + b);*/

    /*    String a = "aaa";
        String[] aArrayList = a.split(",");
        System.out.println();*/

/*    Integer a = new Integer(1);
    Integer b = new Integer(1);
        int hashA = a.hashCode();
        int hashB = b.hashCode();
        System.out.println();*/

String a = "409820190219000000020012";
        System.out.println(Long.parseLong(a));

    }

    public static boolean isMobileNO(String mobiles) {
        String mach = "^1[345789]\\d{9}$";
        Pattern p = Pattern.compile(mach);
        Matcher m = p.matcher(mobiles);
        return m.matches();
    }

    public static BigDecimal convertStringToBigDecimal(String str) {

        if (StringUtils.isNotEmpty(str) && isNumeric(str)) {
            BigDecimal bigDecimal = new BigDecimal(str);
            return bigDecimal;
        } else {
            return new BigDecimal(0);
        }
    }

    /**
     * 判断字符串是否为数字或小数
     *
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+.?[0-9]+");
        Matcher isNum = pattern.matcher(str);
        if (isNum.matches() || StringUtils.isNumeric(str)) {
            return true;
        }
        return false;
    }


    private void testNotNull(PersonDto personDto) {
        personDto.setAge(1);
    }

}
