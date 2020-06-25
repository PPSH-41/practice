package com.practice.timing;

import java.util.Date;

public class Time {
    public static void main(String[] args) {
        System.out.println(new Date());
        //demo02();
        //demo01();
        demo03();
    }

    private static void demo03() {
        long s = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序运行时间"+(e-s)+"毫秒");
    }

    private static void demo02() {
        Date d2 = new Date();
        System.out.println(d2.toLocaleString());
    }

    private static void demo01() {
        Date d1 = new Date();
        System.out.println(d1);
    }
}
