package com.dsa.normal.bitwiseoperator;

public class NumberIsPowerOfTwo {
    public static void main(String[] args) {
        int n=16;
        boolean ans=(n & (n-1))==0;
        if (ans){
            System.out.println("number is power of two");//(2^(i))
        }
        else {
            System.out.println("number is not power of two");
        }
    }
}
