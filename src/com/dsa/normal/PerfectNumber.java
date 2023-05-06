package com.dsa.normal;

public class PerfectNumber {
    public static void main(String[] args) {
//        int n=28;
//        int n=6;
        int n=496;
        System.out.println(isPerfectNumber(n));
    }
    static boolean isPerfectNumber(int n){
        boolean flag=false;
        int sum=0;
        for (int i = 1; i <= n/2; i++) {
            if (n%i==0) {
                sum+=i;
            }
        }
        if (sum==n){
            flag=true;
            return flag;
        }
        else{
            return flag;
        }
    }
}
