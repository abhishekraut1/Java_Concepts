package com.company;
// 'finally' block :
//Java finally block is always executed whether an exception is handled or not.
// Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

public class finally_block {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am Finally for b = "+b);
            }
            b--;
        }
        System.out.println();

        //try finally block
        int e=8,f=2;
        try{
            System.out.println(e/f);
        }
        finally {
            System.out.println("finally block is always executed");
        }

        int c=8,d=0;
        try{
            System.out.println(c/d);
        }
        finally {
            System.out.println("finally block is always executed");
        }
    }
}
