package com.company;
import java.util.Scanner;
public class Codeforces_F_ATM_and_Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int sum=0;
        int var=0,j;
        while (test-- > 0) {
            int n = sc.nextInt();
            int bal = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (j = 0;j < n; j++) {
                    if (i!=j) {
                        sum=0;
                        sum = a[i] + a[j];
                        if (sum >= 0) {
                            System.out.println((i+1)+ " " +(j+1));

                            break;
                        }
                            var++;
                    }
                }
                if(sum>=0)
                    break;
                if(var==n*n-n)
                    System.out.println("-1");
            }

        }
    }
}