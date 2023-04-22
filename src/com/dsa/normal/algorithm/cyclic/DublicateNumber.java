package com.dsa.normal.algorithm.cyclic;

import java.util.ArrayList;
import java.util.List;

public class DublicateNumber {
    public static void main(String[] args) {
        int []arr={1,3,4,2,2};
        List<Integer> dublicateNumbers= findDublicate(arr);
//        System.out.println(Arrays.toString(missingNumbers));
        for (int num:dublicateNumbers) {
            System.out.println(num);
        }
    }
    static List<Integer> findDublicate(int nums[]){
        int i=0;
        while (i < nums.length){
            int correctIndex=nums[i]-1;
            if (nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }
        //search for dublicate number
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=(index+1)){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
