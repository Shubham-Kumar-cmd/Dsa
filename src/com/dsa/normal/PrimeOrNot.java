package com.dsa.normal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeOrNot {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter a number to check whether the number is prime or not: ");
        int num = Integer.parseInt(bufferedReader.readLine());
        //int num=7;
        for (int i = 1; i < num; i++) {
            System.out.println(i+" =>"+isPrime(i));
        }
    }
    static String isPrime(int num){
        int c=2;
        if(num<=1){
//            System.out.println("number is neither prime nor composite");
            return "number is neither prime nor composite";
        }
        //while(c<num){
        while(c*c <= num){ //no. of steps reduced to half to check whether the no. is prime or not
            if(num%c==0){
//                System.out.println("number is not prime");
//                System.exit(0);
                return "number is not prime";
            }
            c++;//c=c+1
        }
//        System.out.println("number is prime");
        return "number is prime";
    }
}
