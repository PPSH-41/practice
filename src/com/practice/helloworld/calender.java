package com.practice.helloworld;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class calender {
    public static void main(String[] args) throws FileNotFoundException {
//        LocalDate date = LocalDate.now(); //当今时间
        LocalDate date = LocalDate.of(2019,12,31);
//        设定时间
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println(month);

        date = date.minusDays(today-1);
        DayOfWeek weekday= date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for(int i=1;i<value;i++)
            System.out.print("	");

        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print("	");
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue()!=1)
            System.out.println();
        PrintStream ps;
        ps = new PrintStream("f:/a.txt");
        System.setOut(ps);//把创建的打印输出流赋给系统。即系统下次向 ps输出
        System.out.println("这行语句将被输出到txt");
        PrintStream out = System.out; // 先把系统默认的打印输出流缓存
        System.out.println("重新定位到屏幕");
    }
}


