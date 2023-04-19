package com.dsa.normal.binary.competition;

//Ceiling of a Number
//smallest element in an array which are just greater or equal to target number
public class CeilingNumber {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8,45,67,69,83,86};
        int target=84;
        System.out.println(ceilingOfNumber(arr,target,0,10));
    }
    static int ceilingOfNumber(int[] arr,int target,int start,int end){

        //but what if target no.is greater than the greatest number in array
        if(target > arr[arr.length-1]){
            return  -1;
        }

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
        return start;//return ceilingOfNumber
//        return end;//return FloorOfNumber
    }
}
