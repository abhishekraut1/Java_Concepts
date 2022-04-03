package com.company;
import java.io.*;
import java.util.Scanner;
class Codechef_COVID19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i=0;i<test;i++) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            int left,right;
            int max = Integer.MIN_VALUE;  //Worstcase
            int min = Integer.MAX_VALUE; //Bestcase
            for ( i = 0; i < n; i++) {
                //assume that arr[i] is only one infected at start
               // long infected = arr[i];
                //go left and see till which position person is infected
                left = i;
                while (left > 0 && (arr[left] - arr[left - 1]) <= 2) {
                    left--;
                }
                right = i;
                while (right < n-1 && (arr[right] - arr[right + 1] <= 2)) {  //right < n-1
                    right++;
                }
                int infectedCount = (right - left + 1);
                min = Math.min(infectedCount, min);
                max = Math.max(infectedCount, max);
            }
            System.out.println(min + "  " + max);
        }
    }
}