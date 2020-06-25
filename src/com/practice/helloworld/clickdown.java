package com.practice.helloworld;

import java.awt.*;
import java.awt.event.KeyEvent;

public class clickdown {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        for(int i=0;i<1;i++) {
            robot.delay(1700);
            robot.keyPress(KeyEvent.VK_DOWN);
        }
    }
}
