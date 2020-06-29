package lambda.Demo02;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("做饭");
            }
        });

        invokeCook(()->{
            System.out.println("make foods");
        });

    }
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
