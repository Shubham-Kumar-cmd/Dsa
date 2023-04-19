package com.dsa.normal.binary.binarysearch2DArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {17,27,39,47},
                {21,29,41,50},
                {23,31,43,55}
        };
        int target=55;
        int arr[]=search(matrix,target);
//        for (int ans:arr) {
//            System.out.println(ans);
//        }
        System.out.println(Arrays.toString(arr));
    }
    static int[] search(int [][] matrix, int target){
        int row=0;
        int col=matrix[row].length-1;
        int []ans={-1,-1};
        while (row<matrix.length && col>=0){
            if (matrix[row][col] == target){
                return ans=new int[]{row,col};
            }
            if (matrix[row][col] < target){
                row++;
            }else {//if (matrix[row][col] > target)
                col--;
            }
        }
        return ans;
    }
}
