package com.dsa.normal.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        Scanner sc=new Scanner(System.in);
        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        */
        //int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};

        int [][]arr=new int[3][4];
        System.out.println(arr.length);//no of rows
        System.out.println("Enter 2D array element: ");
        for (int row=0;row< arr.length;row++){
            //for each column in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
                //arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        //output
        for (int row=0;row< arr.length;row++){
            //for each column in every row
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //output alter
        System.out.println("-------------------------------------------------");
        for(int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        
        //output alter
        System.out.println("-------------------------------------------------");
        for (int []a:arr) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("-------------------------------------------------");
        int [][]matrix={{1,2,3},{4,5,6,7},{8,9}};
        for (int row=0;row< matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

    }
}
