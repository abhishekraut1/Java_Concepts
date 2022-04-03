package com.company;

import java.util.Scanner;

public class Codechef_COVID_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a,b;
            if(n==1)
                System.out.println( (m%2) == 0 ? m/2 : ((m/2)+1));
            else if(m==1)
                System.out.println( (n%2) == 0 ? (n/2) : ((n/2)+1));
            else {
                a = (n % 2) == 0 ? (n / 2) : ((n / 2) + 1);
                b = (m % 2) == 0 ? (m / 2) : ((m / 2) + 1);
                System.out.println(a*b);
            }
        }
    }
}
