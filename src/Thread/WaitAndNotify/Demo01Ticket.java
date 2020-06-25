package Thread.WaitAndNotify;

public class Demo01Ticket {
    public static void main(String[] args) {
       Object obj = new Object();
       new Thread(){
           @Override
           public void run() {
               while (true) {
                   synchronized (obj) {
                       System.out.println("要几个");
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       } finally {
                           System.out.println("finished");
                       }
                   }
               }
           }
       }.start();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("5秒后完成");
                        obj.notify();
                    }
                }
            }
        }.start();

    }
}
