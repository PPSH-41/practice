package Thread.getName;
//1.创建一个Thread类的子类
public class MyThread extends Thread{
    @Override
    public void run() {
//        String name = getName();
//        System.out.println(name);
        Thread t = Thread.currentThread();
//        System.out.println(t);
        System.out.println(Thread.currentThread().getName());
    }
}

