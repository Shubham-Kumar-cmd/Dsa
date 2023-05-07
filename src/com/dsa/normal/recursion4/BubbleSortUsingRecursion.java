package com.dsa.normal.recursion4;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int arr[]={22,3,4,5,6,1,2,3,8,45};
        bubbleSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int []arr,int noOfElementsInArray,int start){
        if (noOfElementsInArray==0){
            return;
        }
        if (noOfElementsInArray>start){
            if (arr[start]>arr[start+1]){
                //swap the element
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            bubbleSort(arr,noOfElementsInArray,start+1);
        }
        else {
            bubbleSort(arr,noOfElementsInArray-1,start);
        }
    }
}
