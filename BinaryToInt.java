package com.company;

public class BinaryToInt {
    public static void main(String[] args) {

        String binaryString = "11";
        int number = Integer.parseInt(binaryString, 2);
        System.out.println(number); // 5
    }
}
