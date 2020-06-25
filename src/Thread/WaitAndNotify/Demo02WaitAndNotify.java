package Thread.WaitAndNotify;

public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("1号要几个");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                            System.out.println("1 finished");
                        System.out.println("-------------");

                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("2号要几个");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                            System.out.println("2 finished");
                        System.out.println("-------------");

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
//                        obj.notify();
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
