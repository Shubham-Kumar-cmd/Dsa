package com.dsa.normal.binary.competition;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
//        int arr[]={0,1,2,4,4,4,5,6,6,7};
        int target=6;
        System.out.println(findPivot(arr));
//        System.out.println(findPivotWithDublicates(arr));
        System.out.println(search(arr,target));
    }

    public static int search(int []arr ,int target){
        int pivot=findPivot(arr);
//        int pivot=findPivotWithDublicates(arr);

        //if you did not find a pivot, it means the arr is not rotated
        if(pivot == -1){
            //just do normal binary search
            return binarySearch(arr,target,0, arr.length-1);
        }

        //if pivot is found, you have found 2 ascending sorted array
        if (arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }else {
            return binarySearch(arr,target,pivot+1, arr.length-1);
        }
    }

    static int binarySearch(int[] arr,int target,int start,int end){

        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2; //might be possible that (start+end) exceeds the range of integer
            int mid = start + (end-start) / 2;

            if(target == arr[mid]){//checking that the target element is middle element or not
                return mid;
            }
            if (target > arr[mid]){
                start=mid+1;
            } else if (target < arr[mid]) {
                end=mid-1;
            }
        }
        //return -1 when target element not found in array
        return -1;
    }

    // this will not work in duplicate values
    static int findPivot(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            int mid=start+(end-start)/2;
            // 4 cases over here
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end=mid-1;
            }else {//if(arr[mid]>arr[start])
                start=mid+1;
            }
        }
        return -1;
    }

    // this will work with duplicate values
//    static int findPivotWithDublicates(int []arr){
//        int start=0;
//        int end=arr.length-1;
//        while (start <= end){
//            int mid=start+(end-start)/2;
//            // 4 cases over here
//            if (mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if (mid>start && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            //if elements at middle,start,end are equal then just skip the dublicates
//            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
//                //Skip the dublicates
//                //Note:what if these elements at start and end are pivot
//
//                //check if start is pivot
//                if (arr[start]>arr[start+1]){
//                    return start;
//                }
//                start++;
//
//                //check whether end is pivot
//                if (arr[end]<arr[end-1]){
//                    return end-1;
//                }
//                end--;
//            }
//            //left side is sorted, so pivot should be in right
//            else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]) {
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
//        }
//        return -1;
//    }
}
