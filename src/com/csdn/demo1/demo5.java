package com.csdn.demo1;

public class demo5 {
    static void TestStr1()
    {
        String name ="tom";
        System.out.println(name);
        //实例化  构造方法
        String name2 = new String("Kite");
        System.out.println(name2);
        System.out.println(name.length());
        System.out.println(name2.length());

    }
    static void  TestStr2()
    {
        String s1 = "hello";
        String s2 = "world!";
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

    }
    static void TestStr3(){
        String name = "tom";
        int age = 20;
        double salary = 3000.5;
        String msg = String.format("姓名：%s,年龄:%d,薪水:%.2f",name,age,salary);
        System.out.println(msg);
    }
    static void TestStr4(){
//        charAt
//                length
//                substring
//                        trim
//                        indexof

        String s = "hello world!";
//        System.out.println(s.charAt(0));
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(s.charAt(i)+" ");
//        }
//        System.out.println(s.substring(3,6));//包含前面不包含后面
//        String s2 = "   hello world  ";
////        System.out.println(s2.length());//长度
////        System.out.println(s2.trim().length());//去掉两边空格长度
////        System.out.println(s2.trim());
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("World!"));

    }
    public static void main(String[] args) {
//        TestStr1();
//        TestStr2();
//        TestStr3();
        TestStr4();
    }
}
