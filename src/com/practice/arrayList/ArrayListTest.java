package com.practice.arrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String args[])
    {
        ArrayList<arrayList.Employee> staff = new ArrayList<>();

        staff.add(new arrayList.Employee("Carl Cracker",75000,1987,12,15));
        staff.add(new arrayList.Employee("Harry Hacker",50000,1989,10,1));
        staff.add(new arrayList.Employee("Tony Tester",40000,1990,3,15));

//        raise salary by 5%
        for (arrayList.Employee e: staff
             ) {
            e.raiseSalary(5);
        }

//        print out information about all Employee objects
        for (arrayList.Employee e :staff
             ) {
            System.out.println("name = "+e.getName()+",salary ="+e.getSalary() + ",hireDay="
            +e.getHireDay());
        }
    }
}
