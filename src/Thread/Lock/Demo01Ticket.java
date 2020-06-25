package Thread.Lock;

public class Demo01Ticket {
    public static void main(String[] args) {
//        long time1 = System.currentTimeMillis();
        RunnableImpl run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
//        调用start方法实现多线程
        t0.start();
        t1.start();
        t2.start();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        long time2 = System.currentTimeMillis();
//        System.out.println(time1);
//        System.out.println(time2);
//        System.out.println(time2-time1);
    }
}
