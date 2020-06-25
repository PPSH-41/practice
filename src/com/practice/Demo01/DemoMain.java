package com.practice.Demo01;

public class DemoMain {
    public static void main(String[] args) {
//        prepare an computer to use
        computer computer = new computer();
        computer.poweron();//open the computer
//      prepare an mouse to use
//        mouse mouse = new mouse();
//        首先向上转型
        USB usbMouse = new Mouse();//多态
//        参数是USB类型，我正好传递进去usb鼠标
        computer.useDevice(usbMouse);

//        创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//发生了向上转型

        computer.useDevice(new Keyboard());
//使用子类对象，匿名对象都可以

        computer.poweroff();//close the computer


    }
}
