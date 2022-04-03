package com.company;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMassage";
    }
}
public class Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<99){
            try {
//              throw new ArrayIndexOutOfBoundsException("Exception is occurred."); // Default Exceptions
                throw new MyException(); // User Defined Exception
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e); //It will run toString() method OR we can also explicitly call
                                       // System.out.println(e.toString());
            }
        }
    }
}
