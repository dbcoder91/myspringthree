package com.dbcoder.dynamicproxy;

import com.dbcoder.dto.PersonDto;

public interface Subject {
    public void rent();

    public void hello(String str);

    /*public static void main(String[] args)  {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));
        System.out.println(c);
        System.out.println(e);
        System.out.println(a.equals(c));
        System.out.println(a.equals(e));
        PersonDto personDto1=new PersonDto();
        PersonDto personDto2=new PersonDto();
        System.out.println(personDto1==personDto2);
        System.out.println(personDto1.equals(personDto2));

        try {
            PersonDto personDto=new PersonDto();
            personDto=null;
            Integer age=personDto.getAge();
        }catch (Exception e1){
            e1.printStackTrace();
        }catch (ExceptionInInitializerError e2){
            e2.getCause();
        }
    }*/
}
