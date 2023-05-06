package com.dsa.normal;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean []primes=new boolean[n+1];//bcz index starting from 1 to n
        Arrays.fill(primes, true);//it will fill all default value as true
//        System.out.println(primes[7]);
        sieveOfEratosthenes(n,primes);
    }

    //true in array means number is prime
    private static void sieveOfEratosthenes(int n, boolean[] primes) {
        for (int i = 2; i*i<=n ; i++) {
            if (primes[i]==true) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <= n ; i++) {
            if (primes[i]==true){
                System.out.print(i+" ");
            }
        }
    }

}
