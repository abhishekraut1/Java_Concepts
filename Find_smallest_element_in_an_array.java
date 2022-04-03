package com.company;

public class Find_smallest_element_in_an_array {
    public static void main(String[] args) {
        int [] arr = {2,4,3,-9,7,56,33};
        int min = Integer.MAX_VALUE;  //Integer.MAX_VALUE gives the maximum value.
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Smallest element in an given array is "+min);
    }
}

