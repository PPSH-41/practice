package com.practice.timing;

public class fifteen {
    public static void main(String args[]) throws InterruptedException {
        int i = 0;
        while(i<15)
        {
            i++;
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
