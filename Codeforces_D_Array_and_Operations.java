package com.company;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Codeforces_D_Array_and_Operations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        PrintStream ps = new PrintStream(System.out);
        while(t-- > 0){
            int score=0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int []a = new int[n];
            st = new StringTokenizer(br.readLine()," ");
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            for(int i = 0; i < n - 2*k; i++){
                score += a[i];
            }
            for(int i = n - 2*k; i < n- k; i++){
                score += a[i]/a[i+k];
            }
            ps.println(score);
        }
        ps.close();
    }
}