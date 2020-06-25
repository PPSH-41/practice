package com.csdn.demo1;

public class demo7 {
    static void m1()
    {
        int[] a = {1,2,3,4};
        for (int i:
             a) {
            System.out.println(i);
        }
    }

    static void testFor()
    {
        int[] a = {1,2,3,4};
        for (int i = 0; i <a.length ; i++) {

        System.out.println(a[i]);
        }

    }
    public static void main(String[] args) {
        testFor();
//        System.out.println("start...");
//        m1();
//        System.out.println("end...");
    }
}
