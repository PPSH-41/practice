package com.csdn.demo1;

public class demo6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.play();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.play();

        FlyFish ff = new FlyFish();
        ff.swim();
        ff.fly();

        Mobile m = new Mobile();
        m.play();
        m.playerVideo();
    }

}

interface Player{
    public void play();
}

interface VideoPlayer extends Player{
    public void playerVideo();
}


class Mobile implements VideoPlayer{

    @Override
    public void play() {
        System.out.println("play......");
    }

    @Override
    public void playerVideo() {
        System.out.println("play video......");

    }
}

class FlyFish implements Bird, Fish{

    @Override
    public void fly() {
        System.out.println("fly......");

    }

    @Override
    public void swim() {
        System.out.println("swim......");
    }
}
interface Bird{
    public void fly();

}

interface Fish{
    public void swim();

}
//接口 更好的实现程序的抽象过程
interface animal {
    public void eat();
    public void sleep();
    public void play();
}

class Dog implements animal{

    @Override
    public void eat() {
        System.out.println("dog eat......");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep......");
    }

    @Override
    public void play() {
        System.out.println("dog play......");
    }
}

class Cat implements animal{

    @Override
    public void eat() {
        System.out.println("cat eat......");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep......");
    }

    @Override
    public void play() {
        System.out.println("cat play......");
    }
}
