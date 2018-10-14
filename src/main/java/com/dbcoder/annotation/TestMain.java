package com.dbcoder.annotation;

import com.dbcoder.dto.Cat1;
import com.dbcoder.dto.Cat2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) {
//无法使用，应为main没有加载applicationContext上下文，
// 如果使用 ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext();
// 配合使用 applicationContext.getBean()，获取bean

        /*TestB testB = new TestB();
        testB.TestMethod();*/

        /*Cat1 cat1=new Cat1();*/
       /* cat1.setA(1);
        *//*cat1.setD(new Date());*//*
        Cat2 cat2=new Cat2();
        BeanUtils.copyProperties(cat1,cat2);
        System.out.println(cat2.getA());*/

       /* List<Cat1> cat1List=new ArrayList<>();
        cat1List.add(cat1);
        if(IsNotEmpty(cat1List)){
            System.out.println(1);
        }else {
            System.out.println(2);
        }*/

       /* if(CollectionUtil(cat1List)){
            System.out.println(1);
        }else {
            System.out.println(2);
        }*/

        /*List<Cat1> cat1s=null;
        if(IsNotEmpty(cat1s)){
            System.out.println(1);
        }else {
            System.out.println(2);
        }*/

        /*List<Cat1> cat1s=new ArrayList<>();
        Cat1 cat1=new Cat1();
        cat1.setA(1);
        cat1s.add(cat1);

        cat1=new Cat1();
        cat1.setA(2);
        cat1s.add(cat1);

        for (Cat1 cat11:cat1s){
            System.out.println(cat1.getA());
        }*/
       /* BigDecimal a=new BigDecimal(10);
        BigDecimal b=new BigDecimal(20);
        System.out.println(a.multiply(b));*/
        /*System.out.println(isNumeric("123"));*/

        //Date a=1537408800000;

        System.out.println(stampToDate("1537440639000"));
        try{
            System.out.println(dateToStamp("2018-09-20 10:00:00"));
        }catch (Exception e){

        }
    }

    public static <T> Boolean IsNotEmpty(Collection<T> list) {
        if (list != null && list.size() > 0) {
            return true;
        } else {
            return false;
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
        if (isNum.matches()|| StringUtils.isNumeric(str)) {
            return true;
        }
        return false;
    }

    /**
    * 将时间戳转换为时间
    * @param:
    * @return:
    * @author: bo.dong
    * @Date: 2018-09-20 21:18:46
    */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    /**
    * 将时间转换为时间戳
    * @param:
    * @return:
    * @author: bo.dong
    * @Date: 2018-09-20 21:18:36
    */
    public static Date dateToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        return date;
    }
}
