package com.dsa.normal.recursion4;

public class PatternUsingRecursion {
    public static void main(String[] args) {
        int row=5;
        pattern1(row,0);
        pattern2(row,0);
    }
    static void pattern1(int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
//            System.out.print("*");
            System.out.print(col+1);
//            System.out.print(row-col);
            pattern1(row,col+1);
        }
        else {
            System.out.println();
            pattern1(row-1,0);
        }
    }

    static void pattern2(int row,int col){
        if (row==0){
            return;
        }
        if (row>col){
            pattern2(row,col+1);
            System.out.print("*");
        }
        else {
            pattern2(row-1,0);
            System.out.println();
        }
    }
}
