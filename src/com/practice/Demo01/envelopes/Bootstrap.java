package com.practice.Demo01.envelopes;

import com.practice.Demo01.envelopes.red.OpenMode;
import com.practice.Demo01.envelopes.red.RedPacketFrame;
/*
* 红包分发
* 普通红包：totalMoney / totalCount,余数在最后一个中
* 手气红包：最少1分，最多不超过平均数2倍，越发越少
* */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("发红包了");
        red.setOwnerName("丁一");//群主名称
//        普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);
//        手气红包
        OpenMode Random = new RandomMode();
        red.setOpenWay(Random);
    }

}
