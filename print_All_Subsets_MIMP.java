package com.company;

import java.util.ArrayList;

public class print_All_Subsets_MIMP {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubset(n-1,subset);

        //add nahi hoga
        subset.remove(subset.size()-1); //to blank last index
        findSubset(n-1,subset);
    }
    public static void main(String[] args) {
        int n=10;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n,subset);
    }
}
