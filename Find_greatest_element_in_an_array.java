package com.company;

public class Find_greatest_element_in_an_array {
    public static void main(String[] args) {

        int [] arr = {2,4,3,9,7,56,33};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Greatest element in an given array is "+max);
    }
}
