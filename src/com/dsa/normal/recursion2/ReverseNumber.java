package com.dsa.normal.recursion2;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=561;
        reverse(n);
        System.out.println(sum);
        System.out.println("-------------------------------------------");
        System.out.println(reverse2(n));
    }

    //2nd Way
    static int reverse2(int n){
        //sometimes we might need some additional variables in the argument
        //in that case, make another function
        int digits= (int) ((Math.log10(n))+1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10==n){
            return n;
        }
        int rem=n%10;
        return rem * (int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }




    //1st Way
    static int sum=0;
    static void reverse(int n){
        int rem=0;
        if (n==0){
            return;
        }
        rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
}
