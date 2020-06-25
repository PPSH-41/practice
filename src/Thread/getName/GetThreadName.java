package Thread.getName;
/*主线程main
    新线程Thread-0 ……
 */
public class GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
//调用start方法，开启新线程
        mt.setName("小白");
        mt.start();
        new MyThread().start();
        System.out.println(Thread.currentThread().getName());
    }


}
