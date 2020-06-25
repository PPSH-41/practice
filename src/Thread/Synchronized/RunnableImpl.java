package Thread.Synchronized;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
    //    创建锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
