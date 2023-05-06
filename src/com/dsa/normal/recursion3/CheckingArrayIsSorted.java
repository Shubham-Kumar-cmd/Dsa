package com.dsa.normal.recursion3;

public class CheckingArrayIsSorted {
    public static void main(String[] args) {
//        int []arr={1,3,5,6,7,8,9};
        int []arr={1,3,5,16,7,8,9};
        System.out.println(isArraySorted(arr,0));
    }
    static boolean isArraySorted(int [] arr,int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isArraySorted(arr,index+1);
    }
}
