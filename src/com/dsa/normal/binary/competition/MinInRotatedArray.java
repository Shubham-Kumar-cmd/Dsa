package com.dsa.normal.binary.competition;

public class MinInRotatedArray {
    public static void main(String[] args) {
        int arr []={4,5,6,7,0,1,2};
        System.out.println("min value in the rotated array is just after the pivot element"+findMin(arr));
    }
    static int findMin(int arr[]){
        int pivotIndex=findPivot(arr);
        return arr[pivotIndex+1];
    }
    static int findPivot(int [] arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }
            else {//if(arr[mid]>arr[start])
                start=mid+1;
            }
        }
        return -1;
    }
}
