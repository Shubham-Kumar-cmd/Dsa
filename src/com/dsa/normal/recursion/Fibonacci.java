package com.dsa.normal.recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        int number=fibonacci(50);
//        System.out.println(number);

        for (int i = 0; i < 11; i++) {
            System.out.println(fibonacciFormula(i));
        }
    }

    static int fibonacciFormula(int n){
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2),n)-(Math.pow(((1 - Math.sqrt(5)) / 2),n))) / Math.sqrt(5));//exact formula
//        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2),n) / Math.sqrt(5));//approx formula
    }

    static int fibonacci(int n){
        //base condition
        if (n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
