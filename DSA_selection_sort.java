package com.company;
//LOGIC = Chhota hai to aage bhejo
//Time Complexity = O(n^2)
public class DSA_selection_sort {
    //print array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr = { 8,3,20,1,5};
        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]) { //for descending array -> if(arr[smallest]<arr[j])
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
