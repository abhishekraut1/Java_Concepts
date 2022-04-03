package com.company;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechefgg
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- >0) {
            int n = input.nextInt();
            int min = n, max = 1, count = 1;
         //   int bestCase = INT_MIN;
            System.out.println(n);
            int [] Arr = new int[n];
            for(int i = 0; i<n; i++){
                Arr[i] = input.nextInt();
            }
            for(int i = 0 ,j =1; i<n && j <n; i++,j++ ){
                if(Arr[j] - Arr[i] <= 2){
                    count++;
                }else{
                    if(count >= max){
                        max = count;
                    }
                    if(count < min){
                        min = count;
                    }
                    count = 1;
                }
            }
            if(count >= max){
                max = count;
            }
            if(count < min){
                min = count;
            }
            System.out.println(min + " " + max);
        }
    }
}