package com.practice.helloworld;

import java.awt.*;
import java.awt.event.KeyEvent;

public class gloryadventure {
    public static void main(String[] args) throws AWTException{
        Robot robot = new Robot();
        int i;
        //for (i=0;i<=10;i++) {
            robot.delay(17000);
            robot.keyPress(KeyEvent.VK_R);
            robot.delay(1700);
            robot.keyPress(KeyEvent.BUTTON1_MASK);
            robot.delay(60000);
            robot.keyPress(KeyEvent.VK_F);
            robot.delay(60000);
            robot.keyPress(KeyEvent.VK_F);
            robot.delay(60000);
            robot.keyPress(KeyEvent.VK_B);
        //}
        }
}
