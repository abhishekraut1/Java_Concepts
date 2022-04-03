package com.company;
//Time Complexity = O(log n)
public class DSA_Binary_Search {
       static int BSearch(int[] arr,int size,int element){
         int low=0,high=size-1;
         int mid;
         //Start searching
         while(low<=high){ //It executes until the condition becomes FALSE
             mid = (low+high)/2;
             if(arr[mid]==element) {
                 return mid;
             }
             if(arr[mid]<element) {
                 low = mid + 1;
             }
             else {
                 high = mid - 1;
             }
         }
         //Searching ends
         return -1;
     }
    public static void main(String[] args) {
        int[] arr = {4,9,22,50,109,333};
        int size = arr.length;
        int element = 333;
        System.out.println(element + " is found at location " +BSearch(arr,size,element));
    }
}