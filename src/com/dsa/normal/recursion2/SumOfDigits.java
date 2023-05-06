package com.dsa.normal.recursion2;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12346));
    }
    static int sumOfDigits(int n){
        if (n==0){
            return 0;
        }
        return sumOfDigits(n/10)+(n%10);
    }
}
