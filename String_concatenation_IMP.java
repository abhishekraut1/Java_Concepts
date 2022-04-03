package com.company;

// que. WAP to Print table of 19
public class String_concatenation_IMP {
    public static void main(String[] args) {
        int j=19;
        String str = "";
        for (int i=1;i<=10;i++){
            str += j+" X "+i+" = "+i*j;
            str += "\n";
        }
        System.out.println(str);
    }
}
