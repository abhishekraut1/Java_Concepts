package com.company;
//Time complexity = O(log(n)) , n = length of string
public class reverse_a_string_using_iteration {
    public static void main(String[] args) {
        //Using Binary search and StringBuilder class
        StringBuilder sb = new StringBuilder("Abhishek");
        int mid = sb.length()/2;
        for (int i = 0; i < mid;i++) {
            int front = i;
            int back = sb.length()-1-i;
            char backChar = sb.charAt(back);
            char frontChar = sb.charAt(front);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);

        //Also we can use predefined method
        sb.reverse();
        System.out.println(sb);
    }
}