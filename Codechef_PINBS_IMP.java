package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codechef_PINBS_IMP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = 0;
            String str = sc.nextLine();
            int n = str.length();
            if (n == 1) {
                System.out.println("NO");
                continue;
            }
            for (int i = 0; i < n-1; i++) {
                if (str.charAt(i) == '1') {
                    System.out.println("YES");
                    p = 1;
                    break;
                }
            }
            if(p==0){
                System.out.println("YES");
            }
        }
    }
}