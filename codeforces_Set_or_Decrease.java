package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintStream;
import java.util.Arrays;
public class codeforces_Set_or_Decrease {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            int[] a = new int[n];
            int sum = 0, count = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                sum = a[i] + sum;
            }
            if (sum <= k) {
                ps.println(count);
            } else {
                Arrays.sort(a);
                for (int i = a.length - 1; i > 0; i--) {
                    if (a[i] != a[0]) {
                        count++;
                        sum=sum-a[i];
                        a[i] = a[0];
                        sum=sum+a[i];
                        if(sum<=k) {
                            ps.println(count);
                            break;
                        }
                    }
                }
                if(sum>k){
                    boolean c =true;
                    while(c){

                    }
                }
            }
        }
    }
}