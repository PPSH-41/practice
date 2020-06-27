package Thread.WaitAndNotify.baozi;

public class test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaoZiPu(bz).start();//生产
        new customer(bz).start();//吃
    }
}
