package com.csdn.pol;

public class demo12 {
    public static void main(String[] args) {
//向上类型转换
        Animal cat = new Cat();
//        cat.eat();
//        cat.sleep();
        Animal dog = new Dog();
//        dog.eat();
//        dog.sleep();

        Bird b = new Bird();

        Person p = new Person();
        p.care(dog);
        p.care(cat);
        p.care(b);
    }
}

//java多态
//向上类型转换
//方法的动态绑定

class Person{
//    public void care(Dog dog){
//        dog.eat();
//        dog.sleep();
//    }
//    public void care(Cat cat){
//        cat.eat();
//        cat.sleep();
//    }
    public void care(Animal a){
        a.sleep();
        a.eat();
    }

}
interface Animal{
    public void eat();
    public void sleep();

}

class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("cat eat......");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep......");

    }
}

class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("dog eat......");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep......");

    }
}

class Bird implements Animal{

    @Override
    public void eat() {
        System.out.println("Bird eat......");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleep......");

    }
}