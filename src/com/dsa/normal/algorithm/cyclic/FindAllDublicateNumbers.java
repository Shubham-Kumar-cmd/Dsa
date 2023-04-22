package com.dsa.normal.algorithm.cyclic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDublicateNumbers {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> allDublicates= findAllDublicate(arr);
        for (int num:allDublicates) {
            System.out.println(num);
        }
    }
    static List<Integer> findAllDublicate(int nums[]){
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
        //search for all dublicate number
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
