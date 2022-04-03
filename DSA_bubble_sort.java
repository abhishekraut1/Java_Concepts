package com.company;
//LOGIC = Bada hai to pichhe bhejo
//Time Complexity = O(n^2)
public class DSA_bubble_sort {
    //print array
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr = { 8,3,20,1,5};
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) { //for descending array ->  if(arr[j]<arr[j+1])
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
