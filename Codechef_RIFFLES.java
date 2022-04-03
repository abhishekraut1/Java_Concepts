package com.company;

import java.io.IOException;
import java.util.Scanner;

class Codechef_RIFFLES {
public static void find(int n,int k,int[] a,int[] b) {
    for (int in = 0; in < k; in++) {
        int mid = n / 2;
//        int j1 = n - 1;
        int j2 = 0;
        int j = mid;

        for (int i = 0; i < mid; i++) {
//          a[i] =  b[n - 1 - j1];
//                j1 -= 2;
            a[i] = b[j2];

            a[j] = b[j2 + 1];
            j2 += 2;
            j++;
        }
        for (int i = 0; i < n; i+=2) {
            b[i] = a[i];
            b[i+1] =a[i+1];
        }
    }
    for (int i = 0; i < n; i+=2) {
        System.out.print(a[i] + " "+a[i+1]+" ");
    }
}
    public static void solve(int n,int k,int a[],int b[],int c[]) {
        int count2 = 0;
        for (int in = 0; in < k; in++) {
            int mid = n / 2;
//            int j1 = n - 1;
            int j2 = 0;
            int j = mid;
            count2++;

            for (int i = 0; i < mid; i++) {
//                a[i] = b[n - 1 - j1];
//                j1 -= 2;
                a[i] = b[j2];
                c[i] = a[j2];

                a[j] = b[j2 + 1];
                c[j] = c[j2 + 1];
                j2 += 2;
                j++;
            }
            for (int i = 0; i < n; i+=2) {
                    b[i] = a[i];
                    b[i+1] =a[i+1];
                }
                    if (a[1] == 2 ){
                        k = k % count2;
                        find(n, k, a,b);
                        return;
                    }
        }
        for (int i = 0; i < n; i+=2) {
            System.out.print(a[i] + " "+a[i+1]+" ");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for (int i = 0; i < n; i+=2) {
                a[i] = i+1;
                a[i+1] = i+2;
//                c[i] = i+1;
//                c[i+1] = i+2;

                b[i] = i+1;
                b[i+1] =i+2;
            }
            if(n%2==0) {
                solve(n,k,a,b,c);
            }
            System.out.println();

        }
    }
}