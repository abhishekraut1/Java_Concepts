package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Codechef_RIFFLES2_ArrayList {
    public static void find(int n,int k,ArrayList<Integer> a,ArrayList<Integer> b) {
        for (int in = 0; in < k; in++) {
            int mid = n / 2;
            int j1 = n - 1;
            int j2 = 0;
            int j = mid;

            for (int i = 0; i < mid; i++) {
                a.set(i, b.get(n - 1 - j1));
                j1 -= 2;

                a.set(j,b.get(j2+1));
                j2 += 2;
                j++;
            }
            for (int i = 0; i < n; i+=2) {
                b.set(i,a.get(i));
                b.set(i+1,a.get(i+1));
            }
        }
        for (int i = 0; i < n; i+=2) {
            System.out.print(a.get(i) + " "+a.get(i+1)+" ");
        }
    }
    public static void solve(int n,int k,ArrayList<Integer> a,ArrayList<Integer> b) {
        int count2 = 0;
        for (int in = 0; in < k; in++) {
            int mid = n / 2;
            int j1 = n - 1;
            int j2 = 0;
            int j = mid;
            count2++;

            for (int i = 0; i < mid; i++) {
                a.set(i, b.get(n - 1 - j1));
                j1 -= 2;

                a.set(j,b.get(j2+1));
                j2 += 2;
                j++;
            }

            for (int i = 0; i < n; i+=2) {
                b.set(i,a.get(i));
                b.set(i+1,a.get(i+1));
            }
            if (a.get(1) == 2){
                k = k % count2;
                find(n, k, a,b);
                return;
            }
        }
        for (int i = 0; i < n; i+=2) {
            System.out.print(a.get(i) + " "+a.get(i+1)+" ");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);
            ArrayList<Integer> b = new ArrayList<>(n);
            for (int i = 0; i < n; i+=2) {
                a.add(i+1);
                a.add(i+2);

                b.add(i+1);
                b.add(i+2);
            }
            if(n%2==0) {
                solve(n,k,a,b);
            }
            System.out.println();
        }
    }
}