package com.company;
import java.io.*;
public class Codeforces_GCD_Problem {
    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int g = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        int a = 0, b = 0, c = 0, n;
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            System.out.println(n);
            for (int i = n; i >= 1; i--) {
                if(n%i==0 && i+3*i+2*i==n){
                    a = 2*i;
                    b=3*i;
                    c=i;
                }
            }
            System.out.println(a+" "+b+" "+c);
        }
    }
}


