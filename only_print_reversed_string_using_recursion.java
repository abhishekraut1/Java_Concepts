package com.company;

public class only_print_reversed_string_using_recursion {
    //Time complexity = O(n) , n = length of string
    public static void printRev1(String str, int index) {
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev1(str,index-1);
    }
    public static void main(String[] args) {
        String str1 = "Abhishek";
        printRev1(str1,str1.length()-1);
    }
}
