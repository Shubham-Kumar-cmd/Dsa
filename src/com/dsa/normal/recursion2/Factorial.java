package com.dsa.normal.recursion2;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int value=factorial1(n);
        System.out.println(value);
        System.out.println(factorial2(n));
    }

    //normal method
    static int factorial1(int n){
        int temp=1;
        while (n>0){
            temp=temp*n;
            n--;
        }
        return temp;
    }

    //using recursion
    static int factorial2(int n){
        int temp=1;
        if (n<0){
            return -1;
        }
        if (n==1 || n==0){
            return 1;
        }
        temp=n*factorial2(n-1);
        return temp;
    }
}
