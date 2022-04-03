package com.company;

import java.util.Scanner;
public class Codechef_DISTELE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int count;
        while (test-- > 0) {
            int n = sc.nextInt();
            count = n;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n;j++) {
                    if (a[i] == a[j]) {
                        System.out.println(n);
                    } else
                        System.out.println(n + 1);
                }
            }
        }
    }
}
/* if (a[i] == a[i + 1]) {
                    System.out.println(n);
                    break;
                } else if(i==n-2){
                    System.out.println(n + 1);
                }*/
