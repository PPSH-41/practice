package com.csdn.extend;
// 继承可以继承除private的一切
//object是Java顶级类
public class demo11 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.age);
        System.out.println(dog.color);
        System.out.println(dog.name);
//        System.out.println(dog.privateStr);
        dog.eat();
        dog.m2();
        dog.m3();
//        dog.m1();
    }
}

//方法重载  方法名称相同 参数的个数或者类型不同    一个类里面
class Person{
    String name;
    int age;
//    构造方法重载 方法名称相同，参数的个数或者类型不同
    public Person()
    {

    }
    public Person(String name)
    {
        this.name = name;
    }

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat......");
    }
    public void eat(String food){
        System.out.println("eat......"+food);
    }
}

class Animal{
    private String privateStr = "privateStr";
    String name="huahua";
    protected int age = 18;
    public String color= "black";

    public void eat(){
        System.out.println("eat......");
    }
    private void m1(){
        System.out.println("m1");
    }
    protected void m2(){
        System.out.println("m2");
    }
    void m3(){
        System.out.println("m3");
    }
}
//方法覆盖是在继承关系里面   子类覆盖父类同名方法
//super 父类的引用
//this 引用当前对象
class Dog extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eat......");
    }
}
