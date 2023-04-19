package com.dsa.normal.binary.competition;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []nums={5,7,7,7,7,8,8,10};
        int target=7;
        int []ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }

    //if leftBiased is true then it will move left of the array before mid
    //else if leftBiased is false then it will move right of the array after mid
    static  int search(int []nums,int target,boolean leftBiased){
        int findingIndex=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                findingIndex=mid;
                if(leftBiased){
                    end=mid-1;
                }else{//rightBiased
                    start=mid+1;
                }
            }
            else if(target>nums[mid]){
                start=mid+1;
            }else{//target < nums[mid]
                end=mid-1;
            }
        }
        return findingIndex;
    }
}
