package com.dsa.normal.bitwiseoperator;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static void main(String[] args) {
        int [][]image={
                {1,1,0},
                {1,0,1},
                {0,0,1}
        };
        int [][]output=flipAndInvertImage(image);
        for (int[] arr:output) {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int[][] flipAndInvertImage(int[][]image){
        for (int []row:image) {
            //reverse the array
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                //swap and flip
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }
        }
        return image;
    }
}
