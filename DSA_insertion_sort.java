package com.company;
//LOGIC = Chhota hai to element ko 1 index se aage khiskao
//Time Complexity = O(n^2)
public class DSA_insertion_sort {
    //print array
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[] arr = { 8,3,20,1,5};
        //insertion sort
        for(int i=1;i<arr.length;i++){// for 1st condition arr[0] is sorted part and rest is unsorted
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            System.out.println(j);
            //placement
            arr[j+1]=current;  //because j becomes -1
        }
        printArray(arr);
    }
}
