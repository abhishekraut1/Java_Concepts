package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;
public class codechefMXMTRIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            //int max = Integer.MIN_VALUE;
            Arrays.sort(a);
            for(int i=0;i<n;i++){
                ps.println(a[i]);
            }
            int ans=0;
           /*  if(a[0]==a[n-2]) {
                ans = (a[n - 1] - a[0]) * a[0];
            }
            else */
                ans = (a[n - 1] - a[0]) * a[n-2];
            ps.println(ans);
        }
    }
}