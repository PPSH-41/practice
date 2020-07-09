package leetcode.Two;

public class Test {
    public static void main(String[] args) {
        int x =567; int n = 0;
        while(x!=0){
            n = n*10+x%10;
            x = x/10;
        }
        System.out.println(n);
    }
}
