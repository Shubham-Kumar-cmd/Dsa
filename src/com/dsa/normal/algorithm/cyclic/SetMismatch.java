package com.dsa.normal.algorithm.cyclic;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        int []ans=findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while (i < nums.length){
            int correctIndex=nums[i]-1;
            if (nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
        //return the number that occurs twice and the number that is missing
        for (int index = 0; index < nums.length; index++) {
            //not working
            if (nums[index]!=(index+1)){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{};
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
