package com.practice.helloworld;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        int i;
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        for(i=2;i<=n;i++) {
            int flag = 0;
            for (int j = 2; j < n; j++) {
                if (i % j == 0) {
                    flag = 1;
                }
                break;
            }
            if (flag == 0)
                System.out.println(i);
        }
    }
}
