package Thread.InnerClassThread;

import Thread.Runnable.RunnableImpl2;

public class InnerClassThread {
    public static void main(String[] args) {
        new Thread(){
//            重写run方法，设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();

        Runnable r = new Runnable(){
            @Override
            public void run() {
                    for (int i = 0; i < 20; i++) {
                        System.out.println(Thread.currentThread().getName() + "小白");
                    }
                }
        };
        new Thread(r).start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "小黑");
                }
            }
            }).start();
    }
}
