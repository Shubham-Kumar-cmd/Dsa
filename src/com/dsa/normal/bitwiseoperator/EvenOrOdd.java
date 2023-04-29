package com.dsa.normal.bitwiseoperator;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num=5;
        System.out.println(isEven(num));
    }
    static String isEven(int num){
        if ((num & 1)==1){
            return "number is odd";
        }
        else{
            return "number is even";
        }
    }
}
