package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintStream;
public class codeforces_Closing_The_Gap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] arr = new int [n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum=sum+arr[i];
            }
            if(sum%arr.length==0)
                ps.println("0");
            else
                ps.println("1");
        }
    }
}
