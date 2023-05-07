package com.dsa.normal.sorting;

import java.util.Arrays;

public class QuickSortUsingRecursion {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,256,4,54};
        quickSortUsingRecursion(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortUsingRecursion(int arr[],int low,int high){
        if (low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];//here I am taking mid-element as pivot, but we can take any element

        while (start<=end){
            //also a reason why if its already sorted it will not swap
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }

            if (start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        //now my pivot is at correct index, please sort two halves now
        quickSortUsingRecursion(arr,low,end);
        quickSortUsingRecursion(arr,start,high);
    }
}
