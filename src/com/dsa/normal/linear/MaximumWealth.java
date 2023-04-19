package com.dsa.normal.linear;

public class MaximumWealth {

    public static void main(String[] args) {
        int [][]accounts={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int [][]accounts){
        if(accounts==null)
            return -1;

//        int max=Integer.MIN_VALUE;//int max=0;
//        for (int person = 0; person < accounts.length; person++) {
//            int sum=0;
//            for (int bank = 0; bank < accounts[person].length; bank++) {
//                int currentValue=accounts[person][bank];
//                sum=sum+currentValue;
//            }
//            if (sum>max){
//                max=sum;
//            }
//        }

        int max=Integer.MIN_VALUE;//int max=0;
        for (int[] person:accounts) {
            //when we start a new col, take a new sum for that row
            int sum=0;
            for (int bank:person) {
                sum+=bank;
            }
            //now we have to sum of accounts of person
            //check with overall max
            if (sum>max){
                max=sum;
            }
        }
        return max;
    }
}
