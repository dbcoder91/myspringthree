package com.dbcoder.arrays;

public class TestArrays {
    public static void main(String[] args) {
        /*int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        System.out.println("a.length = " + a.length);
        System.out.println(Arrays.toString(a));*/
        printArray();
        printArray(new Integer(1), new Integer(2));
    }

    static void printArray(Object... args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
