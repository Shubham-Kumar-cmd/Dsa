package com.dsa.normal.binary.competition;

public class NextGreatestCharacter {
    public static void main(String[] args) {
        char[] ch={'b','d','e','s','u','v','w','z'};
        char target='z';
        System.out.println(nextGreatestCharacter(ch,target));
    }
    static char nextGreatestCharacter(char[] ch,char target){
        int start=0;
        int end=ch.length-1;
        while (start <= end){
            int mid=start +(end-start)/2;
            if (target >= ch[mid]){
                start=mid+1;
            }else if(target < ch[mid]){
                end=mid-1;
            }
        }
        if (start == ch.length){
            return ch[0];
        }
//        return ch[start % ch.length];
        return ch[start];


        //Alter
//        int left = 0, right = ch.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (ch[mid] <= target) {
//                left ++;
//            }
//            else {
//                right --;
//            }
//        }
//        if (left == ch.length) {
//            return ch[0];
//        }
//        return ch[left];
    }
}
