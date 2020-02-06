package staticTest;

import java.util.Date;

public class ChangeTest {
    public static void main(String[] args)
    {
        int a=3;
        int b=4;
        swap(a,b);
        System.out.print(a);
        System.out.print(a);
        System.out.print(b);

    }
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=a;
    }
}
