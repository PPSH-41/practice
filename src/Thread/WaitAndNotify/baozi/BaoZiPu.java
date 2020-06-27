package Thread.WaitAndNotify.baozi;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while(true){
        synchronized (bz) {
            if (bz.flag = true) {
                try {
                    bz.wait();//有包子
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //被唤醒后执行，包子铺生产包子（交替生产两种包子）
            if (count % 2 == 0) {
                bz.pi = "薄皮";
                bz.xian = "牛肉馅";
            } else {
                bz.pi = "厚皮";
                bz.xian = "猪肉馅";
            }
            count++;
            System.out.println("生产" + bz.pi + bz.xian);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bz.flag = true;
            bz.notify();
            System.out.println("生产完成" + bz.pi + bz.xian + "可以吃了");
        }
        }
    }
}
