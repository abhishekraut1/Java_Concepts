package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintStream;
public class codeforces_Construct_a_Rectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int l1 = Integer.parseInt(st.nextToken());
            int l2 = Integer.parseInt(st.nextToken());
            int l3 = Integer.parseInt(st.nextToken());
            if(l1==l2 && l3%2==0 || l2==l3 && l1%2==0 || l3==l1 && l2%2==0){
                ps.println("YES");
            }
            else if(l1==l2+l3 || l2==l3+l1 || l3==l1+l2){
                ps.println("YES");
            }
            else
                ps.println("NO");
        }
    }
}