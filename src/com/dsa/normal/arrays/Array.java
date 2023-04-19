package com.dsa.normal.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Array for primitive datatype
        int [] arr=new int[5];
        System.out.println("Enter array input: ");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i=0;i< arr.length;i++){ //for loop
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
        for (int a: arr){ //for each loop
            System.out.print(a+" ");
        }

        //Array for String
        System.out.println("");
        String []str=new String[5];
        System.out.println("Enter Array String: ");
        for (int i=0;i<str.length;i++){
            str[i]=sc.next();
        }

        System.out.println(Arrays.toString(str));
        str[1]="Shubham";//because String is immutable

        for (String name: str) {
            System.out.print(name+" ");
        }
    }
}
