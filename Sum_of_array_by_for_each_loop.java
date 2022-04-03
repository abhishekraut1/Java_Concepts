package com.company;

public class Sum_of_array_by_for_each_loop {
    public static void main(String[] args) {
        float []marks = {92.4f,89.2f,75.2f,88.0f};
        float sum = 0;
        for(float element : marks){
            sum = sum + element;
        }
        System.out.println("SUM = "+sum);
    }
}