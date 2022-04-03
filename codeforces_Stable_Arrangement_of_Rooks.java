package com.company;

import java.util.Scanner;
public class codeforces_Stable_Arrangement_of_Rooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k > (n + 1) / 2) {
                System.out.println(-1);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < n; c++) {
                        sb.append(r == c && r % 2 == 0 && k-- > 0 ? 'R' : '.');
                    }
                    sb.append("\n");
                }
                System.out.println(sb);
            }
        }
    }
}
