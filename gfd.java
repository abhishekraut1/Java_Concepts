package com.company;
import java.util.Scanner;
public class gfd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int count=0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] a = new char[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.next().charAt(0);
            }
            for (int i = 0; i < n; i++) {
                if(a[i]==1)
                    count++;
            }
            System.out.println(count);
        }
    }
}