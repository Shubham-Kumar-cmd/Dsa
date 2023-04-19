package com.dsa.normal.linear;

public class SearchInRange {

    public static void main(String[] args) {
        int arr[]={2,56,-1,78,90,1456,67,3,4,4,445,77,8888,2345,8762,5656};
        int target=90;
        System.out.println(searchInRange(arr,1,5,target));
    }
    static int searchInRange(int [] arr,int index1,int index2,int target){
        if (arr.length==0){
            System.out.println("array is empty");
            return -1;
        }

        for (int i = index1; i <= index2; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
