package com.dsa.normal.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[]={1,90,7,8,13,45};
        System.out.println("Original array: "+Arrays.toString(arr));

        swap(arr,1,3);
        System.out.println("Array after swapping two no.: "+Arrays.toString(arr));

        reverseArray(arr);
        System.out.println("New array after reversing the array: "+Arrays.toString(arr));
    }

    //swapping the two no. in an array
    static void swap(int[] arr,int index1,int index2){
        //swapping two no. using third variable
//        int temp=arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;

        //swapping two no. without using third variable
        arr[index1]=arr[index1]+arr[index2];
        arr[index2]=arr[index1]-arr[index2];
        arr[index1]=arr[index1]-arr[index2];
    }

    //reversing the array
    static  void reverseArray(int [] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end) {
            //swap method called
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
