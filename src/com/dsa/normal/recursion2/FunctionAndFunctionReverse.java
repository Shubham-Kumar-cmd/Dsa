package com.dsa.normal.recursion2;

public class FunctionAndFunctionReverse {
    public static void main(String[] args) {
        function(5);
        System.out.println();
        functionReverse(5);
        System.out.println();
        functionBoth(5);
    }

    //function calling n to 1
    static void function(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        function(n-1);
    }

    //function calling 1 to n
    static void functionReverse(int n){
        if (n==0){
            return;
        }
        functionReverse(n-1);
        System.out.print(n+" ");
    }

    //function calling n to 1 then 1 to n
    static void functionBoth(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        functionBoth(n-1);
        System.out.print(n+" ");
    }
}
