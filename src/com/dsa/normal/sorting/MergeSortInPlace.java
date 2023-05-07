package com.dsa.normal.sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,1,2,89,56};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int arr[],int start,int end){
        if (end-start==1){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);
        mergeInPlace(arr,start,mid,end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        int []mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while (i<mid && j<end){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else {//(arr[i]>arr[j])
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not complete
        //copy the remaining arrays element
        while (i< mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j< end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix,0,arr,start+0,mix.length);
//        for (int l = 0; l < mix.length; l++) {
//            arr[start+l]=mix[l];
//        }
    }
}
