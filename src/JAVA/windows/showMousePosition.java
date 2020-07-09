package JAVA.windows;

import java.awt.*;

public class showMousePosition{
    public  static void main(String[] args) throws InterruptedException{
        while (true){
            Point point = MouseInfo.getPointerInfo().getLocation();
            System.out.println("x="+point.x+",y="+point.y);
            Thread.sleep(1000);
        }
    }
}
/*
public class showMousePostion {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            Point point=MouseInfo.getPointerInfo().getLocation();
            System.out.println("x="+point.x+",y="+point.y);
            Thread.sleep(1000);
        }
    }
}
 */