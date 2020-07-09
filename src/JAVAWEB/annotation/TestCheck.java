package JAVAWEB.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Class cls = c.getClass();
        Method[] methods = cls.getMethods();
        int number = 0;
        for (Method method : methods
             ) {
            if (method.isAnnotationPresent(check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    number++;
                    System.out.println("异常");
                }
                }
            }
        }
    }
