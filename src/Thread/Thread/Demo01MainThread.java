package Thread.Thread;

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小强");
        p1.run();

        Person p2 = new Person("小白");
        p2.run();
    }
}
