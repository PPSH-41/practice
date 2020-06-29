package com.practice.helloworld;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class clickdown {
    public static void main(String[] args) throws AWTException {
        Demo03();

    }

    private static void Demo03() throws AWTException {
        Robot robot1 = new Robot();
        for (int i = 0; i < 100; i++) {
            robot1.delay(10);
            robot1.keyPress(KeyEvent.VK_UP);
            robot1.keyPress(KeyEvent.VK_HOME);
            //robot.keyPress(KeyEvent.VK_);
            robot1.delay(10);
        }
    }
}

  /*  private static void Demo02() throws AWTException {
        Robot robot = new Robot();
        robot.delay(1700);
        for (int i = 0; i < 100; i++) {
            robot.delay(200);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
        }
    }

    private static void Demo01() throws AWTException {
        Robot robot = new Robot();
        for(int i=0;i<100;i++) {
            robot.delay(10);
            robot.keyPress(KeyEvent.VK_DOWN);
            //robot.keyPress(KeyEvent.VK_TAB);
            //robot.keyPress(KeyEvent.VK_DELETE);
            robot.delay(10);
        }
    }
}
*/