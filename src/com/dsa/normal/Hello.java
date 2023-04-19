package com.dsa.normal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world");


        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter a number to check whether the number is prime or not: ");
        int num=Integer.parseInt(br.readLine());
        int count = 0;
        int i = 1;
        if(num<=1) {
            System.out.println("number is not prime");
        }
        while (i <= num / 2) {
            if (num % i == 0) {
                count++;
            }
            i++;
        }

        if (count > 1) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is prime");
        }
    }
}
