package com.company;

interface  Operation {
    int add(int a, int b);
    int sub(int c, int d);
}
class Operate implements Operation{
     public int add(int a, int b){
        return a+b;
    }
    public int sub(int c, int d){
        return c-d;
    }

    public static void main(String[] args) {
        Operate ob = new Operate();
        System.out.println("Addition is "+ob.add(4,5));
        System.out.println("Subtraction is "+ob.sub(4,5));
    }
}
