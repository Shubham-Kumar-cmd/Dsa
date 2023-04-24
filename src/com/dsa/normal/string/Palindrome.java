package com.dsa.normal.string;

public class Palindrome {
    public static void main(String[] args) {
        String [] arr={"a","b","c","b","a",};
//        String [] arr={"a","b","c","c","b","a",};
//        String []arr={"1","2","3","2","1"};
        boolean isPalindrome=palindrome(arr);
        if (isPalindrome){
            System.out.println("array is palindrome");
        }
        else {
            System.out.println("array is not palindrome");
        }
    }
    static boolean palindrome(String []arr){
        boolean flag=true;
        if (arr.length==0){
            return flag;
        }
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            if (arr[start]!=arr[end]){
                flag=false;
                return flag;
            }
            else {
                start++;
                end--;
            }
        }
        return flag;
    }
}
