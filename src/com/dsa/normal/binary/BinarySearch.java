package com.dsa.normal.binary;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={43,76,45,23,12,56,78,90,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        int target=78;
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        System.out.println(searchTarget(arr,target));
    }

    static int searchTarget(int [] arr,int target){

        int start=0;
        int end= arr.length-1;
        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2; //might be possible that (start+end) exceeds the range of integer
            int mid = start + (end-start) / 2;
            if (target > arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        //return -1 when target element not found in array
        return -1;
    }
}
