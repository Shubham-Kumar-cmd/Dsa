package com.dsa.normal.binary.competition;

//floor of a Number
//largest element in an array which are just smaller or equal to target number
public class FloorNumber {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8,45,67,69,83,86};
        int target=84;
//        int target=0;//it will return -1
        System.out.println(floorNumber(arr,target,0,10));
    }
    static int floorNumber(int[] arr,int target,int start,int end){
        while (start <= end){
            int mid=start +(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }

            if (target > arr[mid]){
                start=mid+1;
            }
            else if (target < arr[mid]){
                end=mid-1;
            }
        }
//        return start;//return ceilingOfNumber
        return end;//return FloorOfNumber
    }
}
