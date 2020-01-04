package com.dbcoder.integer;

import java.util.Objects;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 1;
        int b = 1;
        System.out.println("Integer equals int: " + Objects.equals(a, b));
        System.out.println(a == b);

        Integer c = new Integer(2);
        int d = 2;
        System.out.println("Integer equals int v2: " + Objects.equals(c, d));
        System.out.println(c == d);

        Integer e = 1;
        System.out.println("Integer equals Integer : " + Objects.equals(a, e));

        Integer f = new Integer(1);
        System.out.println("Integer equals new Integer : " + Objects.equals(a, f));

        Integer g = new Integer(1);
        System.out.println("Integer equals new Integer v2 : " + Objects.equals(f, g));
    }
}
