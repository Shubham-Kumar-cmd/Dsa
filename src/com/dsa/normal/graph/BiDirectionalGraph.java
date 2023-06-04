package com.dsa.normal.graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BiDirectionalGraph {
    public static void main(String[] args) {
        int vertex=5;
        int edge=10;

        int [][]arr=new int[vertex+1][vertex+1];

        ArrayList<LinkedList<Integer>> adj=new ArrayList<>();

        for (int i = 0; i < vertex; i++) {
            adj.add(new LinkedList<Integer>());
        }
    }
    static void addEdge(int arr[][],int source,int destination){
        arr[source][destination]=1;
        arr[destination][source]=1;
    }
    static void addEdge(ArrayList<LinkedList<Integer>> adj, int source, int destination){
        adj.get(source).add(destination);
        adj.get(destination).add(source);//due to bidirectional
    }
}
