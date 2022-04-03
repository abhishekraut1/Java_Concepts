package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef_ANDORUNI
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t -- > 0) {
            int n=sc.nextInt();

            int[] a=new int[n];
            int[] ans = new int[32];

            for(int i=0;i<n;i++) {
                a[i]=sc.nextInt();

                for (int j=0; j<32; j++) {
                    int num = a[i] >> j;

                    if((num & 1) != 0) {
                        ans[j]++;
                    }
                }
            }

            long res=0;

            for(int i=0; i<32; i++) {
                if (ans[i] > 1) {
                    res += Math.pow(2, i);
                }
            }

            System.out.println(res);
        }

    }
}