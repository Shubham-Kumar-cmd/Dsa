package com.dsa.normal;

import com.dsa.normal.collection.ArrayList1;

import java.util.ArrayList;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int n=20;
        factor1(n);
        System.out.print("\n");
        factor2(n);
        System.out.print("\n");
        factor3(n);
    }

    //O(n)
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
    }


    //O(sqrt(n))
    static void factor2(int n){
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                if (n/i==i) {
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " "+n/i+" ");
                }
            }
        }
    }

    //both time and space will be O(sqrt(n))
    static void factor3(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                if (n/i==i) {
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
