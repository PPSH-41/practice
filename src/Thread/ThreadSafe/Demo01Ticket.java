package Thread.ThreadSafe;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
//        调用start方法实现多线程
        t0.start();
        t1.start();
        t2.start();

    }
}
