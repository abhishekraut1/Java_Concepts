package com.company;

@FunctionalInterface
interface LInterface{
    long divide(int a,int b);
}

public class Lambda_Expression {
    public static void main(String[] args) {
        LInterface obj = (a,b)->{
            return a/b;
        };
        System.out.println(obj.divide(8,2));
    }
}
