package com.practice.helloworld;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args)
    {
        int[][] magic=
                {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                };
        int[] magic2 = magic[2];
        magic[2] = magic[3];
        magic[3] = magic2;
        System.out.println(Arrays.deepToString(magic));
    }
}



