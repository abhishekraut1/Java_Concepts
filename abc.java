package com.company;

import java.util.Scanner;
import java.io.*;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int []b = new int[m];
            for(int i=0;i<m;i++){
                b[i] = sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if((a[i]^b[j])<p && (a[i]*((a[i]^b[j]))-1)%p==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}