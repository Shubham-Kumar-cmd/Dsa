package com.dsa.normal.recursion2;

public class Palindrome {
    public static void main(String[] args) {
        int n=565;
        if (isPalindrome(n)){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }

    static boolean isPalindrome(int n){
        return n==reverse2(n);
    }
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
