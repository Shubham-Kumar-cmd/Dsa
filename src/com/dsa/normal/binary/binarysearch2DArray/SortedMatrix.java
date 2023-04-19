package com.dsa.normal.binary.binarysearch2DArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][]matrix={
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=16;
        int []targetIndex=search(matrix,target);
        System.out.println(Arrays.toString(targetIndex));
    }

    //search in the row provided between the col provided
    static int[] binarySearch(int [][]matrix,int row,int cStart,int cEnd,int target){
        while (cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if (target == matrix[row][mid]){
                return new int[]{row,mid};
            }
            if (target>matrix[row][mid]){
                cStart=mid+1;
            }else {//if (target<matrix[row][mid])
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }


    static int[] search(int[][] matrix,int target){
        int rows= matrix.length;
        int cols=matrix[0].length;//be cautious, matrix may be empty
        if (rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd= rows-1;
        int cMid=cols/2;
        //run the loop till the 2 rows are remaining
        while (rStart<(rEnd-1)){//while this is true it will have more than 2 rows
            int mid=rStart+(rEnd-rStart)/2;
            if (target==matrix[mid][cMid]){
                return new int[]{mid,cMid};
            }
            if (target>matrix[mid][cMid]){
                rStart=mid;
            }else {//if (target<matrix[mid][cMid])
                rEnd=mid;
            }
        }

        //now we have 2 rows
        //check whether the target is in the col of 2 rows
        if (target==matrix[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if (target==matrix[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }

        //otherwise
        //search in 1st half
        if (target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //search in 2nd half
        else if (target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        //search in 3rd half
        else if (target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //search in 4th half
        else if (target>=matrix[rStart+1][cMid+1] && target<=matrix[rStart+1][cols-1]){
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
        else {
            return new int[]{-1, -1};
        }
    }
}
