package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codechef_PINBS {
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        if(n%2==0)
            return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){//********************
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            int var=0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = i+1; j < str.length()+1; j++) {
                    int n = Integer.parseInt(str.substring(i,j),2);
                    if (isPrime(n)) {
                        System.out.println("YES");
                        var = 1;
                        break;
                    }
                    if(i==str.length()-1 && j==str.length()){
                        System.out.println("NO");
                    }
                }
                if(var==1){
                    break;
                }
            }
        }
    }
}
