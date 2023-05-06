package com.dsa.normal.recursion2;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n=12345;
        int value=productOfDigits(n);
        System.out.println(value);
    }
    static int productOfDigits(int n){
        if (n%10==n){
            return n;
        }
        return productOfDigits(n/10)*(n%10);
    }
}
