package Thread.WaitAndNotify.baozi;

import java.util.jar.JarOutputStream;

public class customer extends Thread {
    private BaoZi bz;

    public customer(BaoZi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag = false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("正在吃"+bz.pi+bz.xian);

                //吃完后
                bz.flag=false;
                //唤醒生产线
                bz.notify();
                System.out.println("吃完了"+bz.pi+bz.xian+"再生产");
                System.out.println("----------------------------");
            }
        }
    }
}
