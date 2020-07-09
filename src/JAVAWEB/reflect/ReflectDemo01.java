package JAVAWEB.reflect;

import JAVAWEB.domian.Person;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        /** 获取Class对象的方式：
         1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
         * 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
         2. 类名.class：通过类名的属性class获取
         * 多用于参数的传递
         3. 对象.getClass()：getClass()方法在Object类中定义着。
         * 多用于对象的获取字节码的方式
         */
        Class<?> cl1 = Class.forName("JAVAWEB.domian.Person");
        System.out.println(cl1);

        Class cl2 = Person.class;
        System.out.println(cl2);

        Person p = new Person();
        Class cl3 = p.getClass();
        System.out.println(cl3);
    }
}
