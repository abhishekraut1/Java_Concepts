package com.company;

public class StringBuilder_ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Abhishek");
        //char at index 2
        System.out.println(sb.charAt(2));

        //set char at index 2
        sb.setCharAt(2,'H');
        System.out.println(sb);

        //insert character at index 1
        sb.insert(1,'E');
        System.out.println(sb);

        //delete character at index at 1
        sb.delete(1,2);
        System.out.println(sb);

        //append string
        sb.append(" ");
        sb.append("R");
        sb.append("A");
        sb.append("U");
        sb.append("T");
        System.out.println(sb);

        //reverse a string
        sb.reverse();
        System.out.println(sb);
    }
}
