package JAVAWEB.reflect;

import JAVAWEB.domian.Person;

import java.lang.reflect.Field;

public class ReflectDemo02 {
    //成员变量
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);//public类型
        }
        System.out.println("------");
        /*Field a = personClass.getField("a");
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);*/


        //获取所有成员变量
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields
             ) {
            System.out.println(declaredField);
        }


    }

}
