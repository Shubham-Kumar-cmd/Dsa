package com.dsa.normal.recursion2;

public class NoOfStepsToReduceToZero {
    public static void main(String[] args) {
        int n=14;
        int countTheSteps=noOfSteps(n);
        System.out.println(countTheSteps);
        System.out.println(noOfStepsUsingRecursion(n));
    }

    //1st Way
    static int noOfSteps(int num){
        int countEven=0;
        int countOdd=0;
        while (num>0){
            if (num%2==0){
                num=num/2;
                countEven+=1;
            }
            else {
                num=num-1;
                countOdd+=1;
            }
        }
        return countEven+countOdd;
    }



    //2nd Way (Using Recursion)
    static int noOfStepsUsingRecursion(int num){
        return helper(num,0);
    }

    private static int helper(int num, int steps) {
        if (num==0){
            return steps;
        }
        if (num%2==0){
            return helper(num/2,steps+1);
        }
        else {
            return helper(num-1,steps+1);
        }
    }
}
