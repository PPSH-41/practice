package Thread.Runnable;

public class Demo01Runnable {
    public static void main(String[] args) {
//           3 创建runnable接口的实现类对象
            RunnableImpl run = new RunnableImpl();
            Thread t = new Thread(new RunnableImpl2());
            t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);

        }
    }
}
