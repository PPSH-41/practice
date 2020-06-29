package lambda;

public class Demo01lambda {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(()->{//->参数传给方法体
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}
