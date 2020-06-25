package Thread.multiThread;

public class Demo01MainThread {
    public static void main(String[] args) {
    MyThread mt = new MyThread();
//    调用thread类中的start方法，开启新线程，执行run方法
    mt.start();

    for (int i = 0; i < 20; i++) {
        System.out.println("main"+i);
    }
}
}