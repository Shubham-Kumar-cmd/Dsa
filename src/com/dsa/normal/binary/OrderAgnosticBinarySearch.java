package com.dsa.normal.binary;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int []arr={1, 12, 23, 40, 43, 45, 56, 76, 78, 90};
        int arr[] = { 40, 10, 5, 2, 1 };
        int target=2;
        System.out.println(orderAgnosticSearch(arr,target));
    }

    static int orderAgnosticSearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

        //here, we are finding whether the array is in ascending order or in descending order
//        boolean isAsc;
//        if(arr[start]<arr[end]){
//            //array is sorted in ascending order
//            isAsc=true;
//        }else {
//            //array is sorted in descending order
//            isAsc=false;
//        }
        boolean isAsc=arr[start]<arr[end];

        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2; //might be possible that (start+end) exceeds the range of integer
            int mid = start + (end-start) / 2;

            if(target == arr[mid]){//checking that the target element is middle element or not
                return mid;
            }

            if (isAsc){
                if (target > arr[mid]){
                    start=mid+1;
                } else if (target < arr[mid]) {
                    end=mid-1;
                }
            }else{
                if (target > arr[mid]){
                    end=mid-1;
                } else if (target < arr[mid]) {
                    start=mid+1;
                }
            }


        }
        //return -1 when target element not found in array
        return -1;
    }
}
