package com.company;

import java.util.Scanner;

public class Codechef_KEPLERSLAW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            if(t1*t1*r2*r2*r2 == t2*t2*r1*r1*r1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
