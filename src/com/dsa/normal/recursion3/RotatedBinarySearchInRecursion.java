package com.dsa.normal.recursion3;

public class RotatedBinarySearchInRecursion {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,1,2,3,4};
        int target=4;
        System.out.println(rotatedBinarySearchInRecursion(arr,target,0, arr.length-1));
    }
    static int rotatedBinarySearchInRecursion(int arr[],int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (target==arr[mid]){
            return mid;
        }

        if (arr[start]<=arr[mid]){
            if (target>=arr[start] && target<=arr[mid]){
                return rotatedBinarySearchInRecursion(arr,target,start,mid-1);
            }
            else {
                return rotatedBinarySearchInRecursion(arr,target,mid+1,end);
            }
        }
        if (target>=arr[mid] && target<=arr[end]){
            return rotatedBinarySearchInRecursion(arr, target, mid+1, end);
        }
        else {
            return rotatedBinarySearchInRecursion(arr,target,start,mid-1);
        }
    }
}
