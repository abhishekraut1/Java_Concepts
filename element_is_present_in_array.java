package com.company;

public class element_is_present_in_array
{
    public static void main(String[] args) {
        float []marks = {92.4f,89.2f,75.2f,88.0f};
        float num = 89.2f;
        boolean isInArray = false;
        for(float element: marks) {
            if (num == element) {
                isInArray = true;
                break; //To find first location of num
            }
        }
            if(isInArray){
                System.out.println(num+" is present in given array.");
            }
            else{
                System.out.println(num+" is not present in given array.");
            }
    }
}
