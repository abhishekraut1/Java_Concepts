package com.company;

interface MyInter{
    int add(int a,int b);
    int multiply(int a,int b);
}
public class Anonymous_class {
    public static void main(String[] args) {
        MyInter obj = new MyInter() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int multiply(int a, int b) {
                return a*b;
            }
        };
        System.out.println(obj.add(2,3));
        System.out.println(obj.multiply(9,2));
    }
}
