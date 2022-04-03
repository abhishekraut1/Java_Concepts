package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-- >0)
     //   for (int i = 0; i < t; i++)
        {
            String s1=s.next();
            String s2=s.next();
            if((s1.charAt(0)=='b'||s2.charAt(0)=='b')&&(s1.charAt(1)=='o' || s2.charAt(1)=='o')&&(s1.charAt(2)=='b' || s2.charAt(2)=='b'))
                System.out.println("yes");
            else if((s1.charAt(0)=='b'||s2.charAt(0)=='b')&&(s1.charAt(1)=='b' || s2.charAt(1)=='b')&&(s1.charAt(2)=='o' || s2.charAt(2)=='o'))
                System.out.println("yes");
            else if((s1.charAt(0)=='o'||s2.charAt(0)=='o')&&(s1.charAt(1)=='b' || s2.charAt(1)=='b')&&(s1.charAt(2)=='b' || s2.charAt(2)=='b'))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
