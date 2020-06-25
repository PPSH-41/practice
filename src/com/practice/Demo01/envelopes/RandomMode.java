package com.practice.Demo01.envelopes;

import com.practice.Demo01.envelopes.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
//        范围：1+random.nextInt()+(leftMoney /leftCount *2)
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount-1; i++) {
            int money = r.nextInt(leftMoney /leftCount *2);
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }
        list.add(leftMoney);
        return null;
    }
}
