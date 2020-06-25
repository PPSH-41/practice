package com.csdn.demo1;

import java.time.LocalDate;

public class demo3 {
    public static void main(String[] args) {
        boolean flag = true;
        flag = false;
        byte b =127;
//        byte不能128
        short s = 1000;
        int i = 1000000;
        long l = 232323232;
        float f =3.14f;
        double d =3.14;
        char c = 'A';
        System.out.println((int)c);
//        基本数据类型的封装类
        System.out.println(Byte.MIN_VALUE+","+Byte.MAX_VALUE+Byte.SIZE);
        System.out.println(Long.MAX_VALUE+","+ Long.MIN_VALUE+","+Long.SIZE);
    }
}
