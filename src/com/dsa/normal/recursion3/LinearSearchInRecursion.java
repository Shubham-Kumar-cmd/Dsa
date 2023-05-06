package com.dsa.normal.recursion3;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchInRecursion {
    public static void main(String[] args) {
        int arr[]={1,4,6,7,2,45,12,56,57,57};
        System.out.println(linearSearchInRecursion(arr,57,0));
        System.out.println(linearSearchInRecursion2(arr,57,0));
        System.out.println(linearSearchInRecursionFindIndexFromLastIndex(arr,57, arr.length-1));

        linearSearchInRecursionAndTakeThatIndexInList(arr,57,0);
        System.out.println(list);

        ArrayList<Integer> list1=new ArrayList<>();
//        System.out.println(linearSearchInRecursionAndTakeAllIndexInList(arr,57,0,new ArrayList<Integer>()));
        System.out.println(linearSearchInRecursionAndTakeAllIndexInList(arr,57,0,list1));


        System.out.println(linearSearchInRecursionAndTakeAllIndexInList2(arr,57,0));
    }
    static boolean linearSearchInRecursion(int arr[],int target,int index){
        if (index== arr.length){
            return false;
        }
        return ((arr[index]==target) || linearSearchInRecursion(arr,target,index+1));
    }

    static int linearSearchInRecursion2(int arr[],int target,int index){
        if (index== arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return linearSearchInRecursion2(arr,target,index+1);
    }

    static int linearSearchInRecursionFindIndexFromLastIndex(int arr[],int target,int index){
        if (index== -1){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return linearSearchInRecursion2(arr,target,index-1);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void linearSearchInRecursionAndTakeThatIndexInList(int arr[],int target,int index){
        if (index== arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        linearSearchInRecursionAndTakeThatIndexInList(arr,target,index+1);
    }

    static ArrayList<Integer> linearSearchInRecursionAndTakeAllIndexInList(int arr[],int target,int index,ArrayList<Integer> list){
        if (index== arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return linearSearchInRecursionAndTakeAllIndexInList(arr,target,index+1,list);
    }


    static ArrayList<Integer> linearSearchInRecursionAndTakeAllIndexInList2(int arr[],int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if (index== arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=linearSearchInRecursionAndTakeAllIndexInList2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}
