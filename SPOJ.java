package com.company;
/*
import java.util.Scanner;

public class SPOJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(true){
                int i=sc.nextInt();
                if(i==42)
                    break;
            System.out.println(i);
        }
    }
}
*/
import java.io.*;
class SPOJ {
    int a=77;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = new PrintStream(System.out);
        while(true){
            int i = Integer.parseInt(br.readLine());
            if(i==42)
                break;
            ps.println(i);
        }
        ps.close();
    }
}