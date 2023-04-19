package com.dsa.normal.linear;

public class FindMinNumber {
    public static void main(String[] args) {
        int arr[]={2,56,78,90,1456,67,3,4,4,445,77,8888,-1,2345,8762,5656};
        System.out.println(minNumber(arr));
    }
    static int minNumber(int[] arr){
//        if (arr.length==0)
//            return -1;
//
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
