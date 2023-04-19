package com.dsa.normal.linear;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int nums[]={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(1234567));
    }
    static int findNumbers(int nums[]){
        int ans=0;
        for (int num:nums) {
            if (even(num)){
                ans++;
            }
        }
        return ans;
    }

    //function to check whether the no. contain even no. of digits or not
    static boolean even(int num) {
        int x=digits(num);
//        if(x%2==0){
//            return true;
//        }
//        return false;
        return x%2==0;
    }


    //checking the number of digit in number
//    static int digits(int num){
//        if(num<0){
//            num=num*-1;
//        }
//        if(num==0){
//            return 1;
//        }
//        int count=0;
//        while (num>0){
//            count++;
//            num=num/10;
//        }
//        return count;
//    }

    //checking the number of digit in number
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        return (int)Math.log10(num)+1;
    }


    //checking the number of digit in number
    //by converting into String then count the digits
//    static int digits(int num){
//        if(num<0){
//            num=num*-1;
//        }
//        if(num==0){
//            return 1;
//        }
//        String str= String.valueOf(num);
//        int x=str.length();
//        return x;
//    }
}
