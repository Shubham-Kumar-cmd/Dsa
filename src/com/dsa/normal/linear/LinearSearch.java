package com.dsa.normal.linear;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[]={25,5,67,45,-1,23,100};
        int target=23;
        int answer=linearSearch(arr,target);
        System.out.println("Required number found at index: "+answer);
        //System.out.println("Required number is: "+answer);
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length==0)
            return -1;

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check the element at every index if is equal to target
            int element=arr[index];
            if(element==target){
                return index;
                //return element;
            }
        }

        //this line will execute if none of the above statement have executed
        //hence the target not found
        return -1;
    }
}
