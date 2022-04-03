package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintStream;
public class Codechef_FRGAME {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if(b>a){
                a=a+c;
            }
            else{
                b=b+c;
            }
            if(b>a){
                a=a+d;
            }
            else{
                b=b+d;
            }
            if(b>a){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }
        }
    }
}