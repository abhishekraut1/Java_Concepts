package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintStream;
public class codeforces_And_Non_Zero_FALSE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int []a = new int[j];
            for(int p=i;p<=j;p++){
                a[p-1] = p;
            }

            long count=0;
            if(a.length==2) {
                ps.println("1");
            }
            else {
                for (int p = i; p < j; p++) {
                        if ((a[i-1] & a[p]) == 0) {
                            count++;
                        }
                }
                ps.println(count);
            }
        }
    }
}
