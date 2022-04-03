package com.company;

public class Reverse_an_array{
    public static void main(String[] args) {
        int []array = {4,6,2,5,8,2,5 };
        int mid = Math.floorDiv(array.length, 2);
        int temp;
        for(int i=0;i<mid;i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.printf("array is ");
        for(int i=0;i<array.length;i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
