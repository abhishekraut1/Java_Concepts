package com.company;
//Time Complexity = O(n)
//condition = SORTED + UNSORTED
public class DSA_Linear_Search {
    static int LSearch(int[] arr,int size,int element){
        for(int i=0;i<size;i++){
            if(element==arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {45,9,22,19,32,999,10};
        int size = arr.length;
        int element = 10;
        System.out.println(element + " is found at location " +LSearch(arr,size,element));
    }
}
