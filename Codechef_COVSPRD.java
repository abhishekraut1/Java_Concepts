package com.company;

import java.util.Scanner;

public class Codechef_COVSPRD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long d = sc.nextLong();
            long infP = 1;
            for (int i = 1; i <= d && infP < n; i++) {
                if (i < 11) infP *= 2;
                else infP *= 3;
            }
            if(infP>=n) infP=n;
            System.out.println(infP);
        }
    }
}
