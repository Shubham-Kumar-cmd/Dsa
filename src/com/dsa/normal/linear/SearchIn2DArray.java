package com.dsa.normal.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr={{4,6,23,45,6,7},{23,67,889,455,12},{788,90,45,56,123},{234,567,87,23}};
        int target=234;
        for (int []a:arr) {
            System.out.println(Arrays.toString(a));
        }
        int []ans=search(arr,target);
        System.out.println("target value found at [row,col]: "+Arrays.toString(ans));
    }
    static int[] search(int [][]arr,int target){
        if (arr.length==0)
            return new int[]{-1};

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }
}
