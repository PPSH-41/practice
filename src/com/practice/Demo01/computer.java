package com.practice.Demo01;

public class computer {
    public void poweron(){
        System.out.println("打开笔记本电脑");
    }
    public void poweroff(){
        System.out.println("关闭笔记本电脑");
    }

//    使用USB设备方法，使用方法作为接口的参数
    public void useDevice(USB usb){
        usb.open();//打开设备
        if(usb instanceof Mouse){
            Mouse mouse = (com.practice.Demo01.Mouse) usb;//向下转型
            mouse.click();
        }else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }

        usb.close();//关闭设备
    }
}
