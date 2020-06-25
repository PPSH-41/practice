package com.csdn.demo1;

public class demo2 {
    public static void main(String[] args) {
//        System.out.println("hello");
        Boy Tom = new Boy();
        Tom.getMsg();
        Tom.eat();
        Tom.sleep();
//一个类创建了两个对象（Tom Jerry）
        Boy Jerry = new Boy();
        Jerry.age=19;
        Jerry.name = "Jerry";
        Jerry.getMsg();
        Jerry.eat();
        Jerry.sleep();
    }
}
class Boy
{
//    属性
    String name = "Tom";
    int age = 18;

//    方法
    public void getMsg()
    {
        System.out.println(name+","+age);
    }
    public void eat()
    {
        System.out.println("吃饭");
    }
    public void sleep()
    {
        System.out.println("睡觉");
    }
}