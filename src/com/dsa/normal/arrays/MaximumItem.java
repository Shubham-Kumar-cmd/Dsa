package com.dsa.normal.arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int [] arr={1100,7,9,45,1,67,900};
        System.out.println("Getting maximum value in the given array: "+max(arr));
        System.out.println("Getting the maximum value within the given range of array: "+maxRange(arr,3,5));
    }

    //imagine that arr is not empty and getting maximum value
    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxVal<arr[i]){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    //getting the maximum value in a given range
    static int maxRange(int[] arr,int start,int end){
        if (start>end)
            return -1;
        if (arr==null)
            return -1;
        int maxVal=arr[start];
        for (int i = start; i <= end; i++) {
            if(maxVal<arr[i]){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
