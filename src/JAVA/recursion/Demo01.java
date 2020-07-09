package JAVA.recursion;

public class Demo01 {

    public static void main(String[] args) {
        int m = factorial(5);
        System.out.println(m);
    }

    private static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
