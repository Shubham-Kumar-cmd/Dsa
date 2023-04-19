package com.dsa.normal.binary.competition;

public class IndexOfElementInInfiniteArray {
    public static void main(String[] args) {
        int arr[]={2, 5, 7, 9, 10, 12, 15, 16, 18, 20, 24, 28, 32,35};
        int target=32;
//        System.out.println(indexOfTargetElementInInfiniteArray(arr,target,0,13));
        System.out.println(indexOfTargetElementInInfiniteArray(arr,target));
    }

    //one solution
//    static int indexOfTargetElementInInfiniteArray(int []nums,int target,int start,int end){
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (target == nums[mid]){
//                return mid;
//            }else if(target > nums[mid]){
//                return indexOfTargetElementInInfiniteArray(nums,target,mid+1,end);
//            }else {//target < nums[mid]
//                return indexOfTargetElementInInfiniteArray(nums,target,start,mid-1);
//            }
//        }
//        return -1;
//    }


    //alter
    static int indexOfTargetElementInInfiniteArray(int []nums,int target){
        //first find the range
        //first start with a box of size   2
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while (target > nums[end]){
            int newstart=end+1;

            //doublint the box value
            //end=previous end+sizeOfBox*2
            end=end+(end-start+1)*2;//doubling the size of array
            start=newstart;//otherwise start will update before using it
        }
        return ans(nums,target,start,end);
    }
    static int ans(int []nums,int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                start=mid+1;
            }else {//target < nums[mid]
                end=mid-1;
            }
        }
        return -1;
    }

}
