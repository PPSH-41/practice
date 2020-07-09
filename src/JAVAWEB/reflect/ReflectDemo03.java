package JAVAWEB.reflect;

import JAVAWEB.domian.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo03 {
    //构造方法
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object person = constructor.newInstance("tom", 24);
        System.out.println(person);
    }
}
