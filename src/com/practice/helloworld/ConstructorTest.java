package com.practice.helloworld;

import com.sun.jnlp.JNLPRandomAccessFileNSBImpl;

import java.util.*;

public class ConstructorTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];
//重载构造器
        staff[0]=new Employee("Harry",40000);
        staff[1]=new Employee(60000);
        staff[2]=new Employee();

        //print out information about all Employee objects
        for (Employee e : staff
             ) {
            System.out.println("name=" + e.getName()+",id="+e.getId() + ",salary=" +e.getSalary());
        }
    }

static class Employee
{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary;

//    static initialization block静态初始化块
    static
    {
        Random generator = new Random();
    //    set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //object initialization block对象初始化块
    {
        id = nextId;
        nextId++;
    }

    //three overload constructors三个重载构造器
        public Employee(String n,double s)
        {
            name=n;
            salary=s;
        }

        public Employee(double s)
        {
        // calls the Employee(String,double) constructor
            this("Employee #"+nextId,s);
//            this调用另一个构造器
        }
    //    the default constructor
    public Employee()
//    无参数构造器
    {
    //    name initialized to "" --see above
//        salary not explicitly set --initialized to 0 实力域初始化
//    id     initialized in initialization block
    }
        public String getName()
    {
        return name;
    }
        public double getSalary()
        {
        return salary;
    }

        public int getId()
{
            return id;
    }

    }




}
