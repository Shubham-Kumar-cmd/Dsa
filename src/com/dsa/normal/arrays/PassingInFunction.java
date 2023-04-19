package com.dsa.normal.arrays;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int []nums={3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(nums));

        //calling change method
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int [] arr){
        arr[3]=55;
    }
}
