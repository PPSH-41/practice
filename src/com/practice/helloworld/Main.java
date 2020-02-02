package com.practice.helloworld;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(new Date());


        PrintStream ps = new PrintStream("f:/a.txt");
        System.setOut(ps);
        System.out.println(new Date());
        PrintStream out = System.out;
        System.out.println("reset");
        System.out.println("what happened");
    }
}
