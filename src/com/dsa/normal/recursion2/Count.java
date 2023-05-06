package com.dsa.normal.recursion2;

public class Count {
    public static void main(String[] args) {
        int n=124070509;
        System.out.println(count(n));
    }
    static int count(int n){
        return helper(n,0);
    }
    static int helper(int n,int counts){
        if (n==0){
            return counts;
        }
        int rem=n%10;
        if (rem==0){
            return helper(n/10,counts+1);
        }
        else {
            return helper(n/10,counts);
        }
    }
}
