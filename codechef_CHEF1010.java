package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;
public class codechef_CHEF1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
          /*  char [] a = new char[n];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<n;i++){
                a[i] = (char) Integer.parseInt(br.readLine());
            } */
            int count=0;
            String a = br.readLine();
            for(int i=0;i<(n/2)-1;i++){
                if(a.charAt(0)=='1' && a.charAt(1)=='0'&& a.charAt(2)=='1' && a.charAt(3)=='0'){
                    count++;
                }
            }
            ps.println(count);
        }
    }
}
