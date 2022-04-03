package com.company;

import java.util.Scanner;
class Codechefk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,g=1000;;
        int test = sc.nextInt();
        while(test> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char []arr = new char[n+m+2];
         /*   if(arr.length<g)
            {
                g=arr.length;
            } */

            for (i = 1; i <arr.length ; i++) {
                if (n > m) {
                    arr[0] = '0';
                    if (i % 2 != 0) {
                        arr[i] = '1';
                    } else {
                        arr[i] = '0';
                    }
                } else {
                    arr[0] = '1';
                    if (i % 2 != 0) {
                        arr[i] = '0';
                    } else {
                        arr[i] = '1';
                    }
                }
            }
            System.out.println(arr.length);
            for (i = 0; i < arr.length; i++)
                System.out.print(arr[i]);
            test--;
        }
    }
}