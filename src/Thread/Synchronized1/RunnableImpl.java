package Thread.Synchronized1;

public class RunnableImpl implements Runnable {
    private static int ticket = 100;

   // Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            payTicket();
        }
    }
    public synchronized void payTicket(){
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
