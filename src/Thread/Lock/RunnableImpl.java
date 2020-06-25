package Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    private static int ticket = 100;
    Lock l = new ReentrantLock();
   // Object obj = new Object();

//    public void run() {
//        while (true) {
//            l.lock();
//            payTicket();
//            l.unlock();
//        }
//    }

    @Override
    public void run() {
        while (true){
            l.lock();
            payTicket();
        }
    }

    public void payTicket(){
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();
                }


        }
    }
}
