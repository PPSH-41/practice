package JAVA.staticTest;

public class ChangeTest {
    public static void main(String[] args)
    {
        int a=3;
        int b=4;
        swap(a,b);
        System.out.print(a);
        System.out.print("\n");
        System.out.print(b);
//        结果证明java对对象采用的不是引用调用，而是对象应用（按值传递），交换的是两个的拷贝

    }
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=a;
//        System.out.print(a);
//        System.out.print(a);
//        System.out.print(b);
    }
}
