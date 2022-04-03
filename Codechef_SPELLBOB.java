package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef2 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test-- > 0){    //for (int i = 0; i < t; i++)
            String s1 = sc.next();
            String s2 = sc.next();
            if        ((s1.charAt(0) == 'b' || s2.charAt(0) == 'b') && (s1.charAt(1) == 'o' || s2.charAt(1) == 'o') && (s1.charAt(2) == 'b' || s2.charAt(2) == 'b')) {
                System.out.println("yes");
            } else if ((s1.charAt(0) == 'b' || s2.charAt(0) == 'b') && (s1.charAt(1) == 'b' || s2.charAt(1) == 'b') && (s1.charAt(2) == 'o' || s2.charAt(2) == 'o')) {
                System.out.println("yes");
            } else if ((s1.charAt(0) == 'o' || s2.charAt(0) == 'o') && (s1.charAt(1) == 'b' || s2.charAt(1) == 'b') && (s1.charAt(2) == 'b' || s2.charAt(2) == 'b')) {
                System.out.println("yes");
            } else
                System.out.println("no");
        }
    }
}