package com.company;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
class Codechef_THREEBIKES2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        byte test = (byte) Integer.parseInt(br.readLine());
        int count;
        while (test-- > 0) {
            count = 0;
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (a[i] != a[j] && a[i] != a[k] && a[j] != a[k]) {
                            if (((a[i] ^ a[j]) & (a[k])) == ((a[i]) ^ (a[j] & a[k])))
                                count++;
                        }
                    }
                }
            }
            ps.println(count);
        }
        ps.close();
    }
}