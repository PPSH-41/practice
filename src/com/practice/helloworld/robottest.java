package com.practice.helloworld;

import java.awt.*;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class robottest {

    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        for(int i=0;i<1;i++) {
            robottest.clickMouse(robot, 1920, 1080, 1000);
        }
        /*robot.mouseMove(1920,1080);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(500);*/


    }
    public static void clickMouse(Robot robot,int x,int y,int delay){
        robot.mouseMove(x, y);
        //robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(delay);
    }
}
/*public static void main(String[] args){
15         try {
16             Robot robot = new Robot();
17             //鼠标移动到坐标(635,454)
18             RobotTest.clickMouse(robot, 635, 454, 500);
19
20             int[] keys = {
21                     KeyEvent.VK_W,KeyEvent.VK_A,
22                     KeyEvent.VK_N,KeyEvent.VK_G,
23                     KeyEvent.VK_T,KeyEvent.VK_I,
24                     KeyEvent.VK_A,KeyEvent.VK_N,
25                     KeyEvent.VK_Z,KeyEvent.VK_E};
26             robot.delay(500);
27             RobotTest.pressKey(robot,keys,500);
28         } catch (AWTException e) {
29             // TODO Auto-generated catch block
30             e.printStackTrace();
31         }
32     }
33
34     public static void pressKey(Robot robot,int[] keys,int delay){
35         for(int i=0;i<keys.length;i++){
36             robot.keyPress(keys[i]);
37             robot.keyRelease(keys[i]);
38             robot.delay(500);
39         }
40         //处理完需要延迟
41         robot.delay(delay);
42     }
43
44     public static void clickMouse(Robot robot,int x,int y,int delay){
45         robot.mouseMove(x, y);
46         robot.delay(500);
47         robot.mousePress(InputEvent.BUTTON1_MASK);
48         robot.mouseRelease(InputEvent.BUTTON1_MASK);
49         robot.delay(delay);
50     }
51 }*/