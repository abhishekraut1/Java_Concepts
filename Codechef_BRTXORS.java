package com.company;
import java.io.*;
public class Codechef_BRTXORS {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] s = new int[n];
            int m = 1000000007;
            if (n == 1) {
                ps.println(n);
            } else {
                int a = s.length + 1;
                ps.println((a % m + m) % m);
            }
        }
    }
}