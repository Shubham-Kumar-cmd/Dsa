package com.dsa.normal.algorithm;

import java.util.Arrays;

public class CyclicSortImp {
    public static void main(String[] args) {
        int []arr={1,5,4,3,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int []arr){
        int i=0;
        while(i< arr.length){
            int correctIndex=arr[i]-1;
            if (arr[correctIndex] != arr[i]){
                swap(arr,correctIndex,i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
