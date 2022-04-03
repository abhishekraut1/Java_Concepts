package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
class Codechef_VKMPAIRS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int []a = new int[n];
            st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            int []b = new int[m];
            st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<m;i++){
                b[i] = Integer.parseInt(st.nextToken());
            }
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if((a[i]^b[j])<p && (a[i]*((a[i]^b[j]))-1)%p==0){
                        count++;
                    }
                }
            }
            ps.println(count);
        }
    }
}