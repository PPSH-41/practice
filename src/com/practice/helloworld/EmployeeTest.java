package com.practice.helloworld;

public class EmployeeTest {
    public static void main(String[] args)
    {
        //fill staff array with three employee objects
        Employee[] staff = new Employee[3];

        staff[0]= new Employee("Carl Craker", 75000,1987,12,15);
        staff[1]= new Employee("Harry Hacker", 50000,1989,10,1);
        staff[2]= new Employee("Tony Tester", 40000,1990,3,15);

        //raise salary for 5%
       for (Employee e: staff
             ) {e.raiseSalary(5);
        }

        for (Employee e : staff
             ) {
            System.out.println("名字 = "+ e.getName()+",工资="+e.getSalary()+",第一天="
                    +e.getHireDay());
        }
    }
}
