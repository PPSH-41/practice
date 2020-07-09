package leetcode.Two;

public class Solution {
    public static void main(String[] args) {
        boolean a = isPalindrome(12321);
        System.out.println(a);
    }

    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        else {
            int n = 0;int m = x;
            while (m != 0) {
                n = n * 10 + m % 10;
                m = m / 10;
            }
            return n==x;
        }
        /*if(x<0)
            return false;
        int rem=0,y=0;
        int quo=x;
        while(quo!=0){
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
        return y==x;*/
    }
}