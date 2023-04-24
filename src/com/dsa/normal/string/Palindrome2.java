package com.dsa.normal.string;

public class Palindrome2 {
    public static void main(String[] args) {
//        String str="abccba";
//        String str="abcdcba";
        String str="12345654321";
        boolean isPalindrome=palindrome(str);
        if (isPalindrome){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
    static boolean palindrome(String str){
        boolean flag=true;
        if (str==null || str.length()==0){
            return flag;
        }
        str=str.toLowerCase();
        for (int i = 0; i <= str.length()/2 ; i++) {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if (start!=end){
                flag=false;
                return flag;
            }
        }
        return flag;
    }
}
