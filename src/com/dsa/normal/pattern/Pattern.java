package com.dsa.normal.pattern;

public class Pattern {
    public static void main(String[] args) {
        int n=4;
        System.out.println("pattern1");
        pattern1(n);
        System.out.println("-------------------------------------------------------");
        System.out.println("pattern2");
        pattern2(n);
        System.out.println("-------------------------------------------------------");
        System.out.println("pattern3");
        pattern3(n);
        System.out.println("-------------------------------------------------------");
        System.out.println("pattern5");
        pattern5(n);
        System.out.println("-------------------------------------------------------");
        System.out.println("pattern28");
        pattern28(n);
        System.out.println("-------------------------------------------------------");
        System.out.println("pattern30");
        pattern30(n);
        System.out.println("-------------------------------------------------------");
        System.out.println("pattern31");
        pattern31(n);
        System.out.println("-------------------------------------------------------");
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0 ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1+i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 0; j--) {
//                System.out.print("*"+" ");
//                System.out.print(j);
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int targetColumnInRow= (row>n) ? 2*n-row : row;
            
            int noOfSpaces=n-targetColumnInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            
            for (int col = 0; col < targetColumnInRow; col++) {
                System.out.print("* ");
//                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int targetColumnInRow= (row>n) ? 2*n-row : row;
            for (int col = 0; col < targetColumnInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 0; row <= n; row++) {
//            int targetColumnInRow= (row>n) ? 2*n-row : row;
//
//            int noOfSpaces=n-targetColumnInRow;
//            for (int s = 0; s < noOfSpaces; s++) {
//                System.out.print(" ");
//            }
            //Alter for no. of spaces
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col > 1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN=n;
        n=2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
//                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
