package com.dbcoder.dto;

public class testObjectMain {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        cat1.setA(1);

        Cat1 cat11 = new Cat1();
        cat11.setA(cat1.getA());

        cat1.setA(2);

        System.out.println("cat1:" + cat1.getA() + ",cat11:" + cat11.getA());
    }
}
