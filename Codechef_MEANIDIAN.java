package com.company;
//WRONG
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Codechef_MEANIDIAN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                sum+=a[i];
            }
            Arrays.sort(a);
            int median = n%2==0 ? a[n/2 - 1] : a[(n+1)/2 - 1];
           // System.out.println(median);
            int mean = sum/a.length;
           // System.out.println(mean);
            if (mean == median) {
                System.out.println(0);
            }else if(mean > median){
                System.out.println(n*(mean - median));
            }else if(mean < median){
                System.out.println(n*(median-mean));
            }
        }
    }
}