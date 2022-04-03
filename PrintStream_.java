package com.company;

import java.io.PrintStream;
public  class PrintStream_ {
    public static void main(String[] args){
        PrintStream ps = new PrintStream(System.out);
        float a = 88f;
        ps.println(77);
        ps.println("Hello Java");
        ps.close();
    }
}
