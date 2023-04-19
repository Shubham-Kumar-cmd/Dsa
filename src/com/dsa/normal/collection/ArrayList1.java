package com.dsa.normal.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        ArrayList list=new ArrayList();
        System.out.println("Enter the list of element: ");
        //input
        for (int i=0; i<5; i++){
            list.add(br.readLine());
        }

        //output
        System.out.println(list);

        System.out.println("-----------------------------------------------");
        //alter
        for (int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
