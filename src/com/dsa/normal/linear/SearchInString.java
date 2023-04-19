package com.dsa.normal.linear;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str="Shubham Kumar";
        char target='K';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(searchChar(str,target));
    }
    //run a for loop
    static boolean searchChar(String str,char target){
        boolean flag=false;
        if (str.length()==0)
            return flag;
        
        //for loop
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                flag=true;
//                return flag;
//            }
//        }
        
        //foreach loop
        for (char ch:str.toCharArray()) {
            if (target == ch) {
                flag=true;
                return flag;
            }
        }

        //this line will execute if none of the above statement have executed
        //hence the target not found
        return flag;
    }
}
