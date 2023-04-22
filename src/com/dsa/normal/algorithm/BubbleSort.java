package com.dsa.normal.algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int arr[]={5,4,3,2,1};
        int arr[]={5,4,0,-45,-190};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //here space complexity is constant because not returning anything(i.e, return type void)
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps (n-1)times
        for (int i = 0; i < arr.length; i++) {
            swapped =false;
            //for each step, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted.hence stop the program
            if (swapped==false){//(!swapped)
                break;
            }
        }
    }
}
