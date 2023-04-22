package com.dsa.normal.algorithm.cyclic;

import java.util.Arrays;

public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
//        int []arr={7,8,9,11,12};
//        int []arr={1,2,4,5};
//        int []arr={3,4,-1,1};
        int []arr={1,2,0};
        int missedNumber=firstMissingPositiveNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missedNumber);
    }
    static int firstMissingPositiveNumber(int []arr) {
        int i = 0;
        while (i < arr.length) {
            //ignore the negative number(i.e, arr[i]>0)
            int correctIndex = arr[i]-1;
            if (arr[i]>0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
            //if (arr[i] != arr[correctIndex]) this is the first statement then it is not working
//            if (arr[i] != arr[correctIndex] && arr[i] < arr.length ) { //I do not know why it is throwing IndexOutOfBoundException
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        //search for first missing positive number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
