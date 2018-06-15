package com.dbcoder.controller;


import com.dbcoder.dto.PersonDto;
import com.dbcoder.dto.TestDto;
import org.aspectj.weaver.ast.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@Controller
@RequestMapping("/home")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    public static void main(String[] args) {
        /*List<String> a=new LinkedList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        ListIterator<String> iter=a.listIterator();
        String first= iter.next();
        String two=iter.next();
        String test= iter.previous();
        System.out.println(first);
        iter.remove();
        System.out.println(a.get(0));*/

        TestDto testDto=new TestDto();
        TestDto testDto1=new TestDto();
        System.out.println(testDto==testDto1);
        System.out.println(testDto.equals(testDto1));

        String a=new String();
        String b=new String();
        System.out.println(a==b);
        System.out.println(a.equals(b));

        Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
        try{
            demo1=Class.forName("com.dbcoder.dto.TestDto");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        demo2=new TestDto().getClass();
        demo3=TestDto.class;
        System.out.println("类名称 "+demo1.getName());
        System.out.println("类名称 "+demo2.getName());
        System.out.println("类名称 "+demo3.getName());

        Class<?> demo=null;
        try{
            demo=Class.forName("com.dbcoder.dto.PersonDto");
        }catch (Exception ex){
            ex.printStackTrace();
        }
        PersonDto per=null;
        try{
            per=(PersonDto)demo.newInstance();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
        per.setName("Rollen");
        per.setAge(20);
        System.out.println(per);
    }
}
