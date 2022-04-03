package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class Codechef_MUSICHAIR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            PrintStream ps = new PrintStream(System.out);
            int x = Integer.parseInt(br.readLine());
            int sum = 1;
            if(x>2){
            if (x < 7)
                sum++;
            else if (x % 2 == 1)
                sum+=2;
            else if (x % 3 == 1)
                sum+=2;
        }
            ps.println(sum);
        }
    }
}