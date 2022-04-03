package com.company;

import java.util.Scanner;

public class Codechef_MINMANH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long distance,g;
        int i,j;
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] s = new long[ (n*2)];
        long[] t = new long[ (m*2)];
        for( i=0;i<s.length;i++) {
           // System.out.println(i);
            s[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        for(i=m;i<t.length;i++){
            g=Integer.MAX_VALUE;
            for(j=0;j<m;j++) {
                distance = (Math.abs(t[i] - t[j]) + Math.abs(s[i] - s[j]));
                if(distance<g)
                    g=distance;
            }
            System.out.println(g);
        }
    }
}