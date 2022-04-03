package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef_Atm_Problem
{
    // your code goes here
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        float bal = sc.nextFloat();
        float amt = 0;
        if (bal >= withdraw + 0.5 && withdraw % 5 == 0) {
            amt = (float) (bal - withdraw - 0.50);
            System.out.printf("%.2f",amt);
        } else {
            amt = (float) (bal);
            System.out.printf("%.2f",amt);
        }
    }
}