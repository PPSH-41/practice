package Thread.multiThread;
//1.创建一个Thread类的子类
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run"+i);
        }
    }
}
