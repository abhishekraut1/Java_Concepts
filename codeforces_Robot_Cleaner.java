package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintStream;
public class codeforces_Robot_Cleaner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int rb = Integer.parseInt(st.nextToken());
            int cb = Integer.parseInt(st.nextToken());
            int rd = Integer.parseInt(st.nextToken());
            int cd = Integer.parseInt(st.nextToken());

            int count = 0;
            int dr=1;
            int dc=1;
            while(rb!=rd&&cb!=cd) {
                if(rb+dr>n)
                    dr=-1;
                else if(rb-dr<1)
                    dr=1;

                if(cb+dc>m)
                    dc=-1;
                else if(cb-dr<1)
                    dc=1;
                rb+=dr;
                cb+=dc;
                count++;
            }
            ps.println(count);
        }
    }
}