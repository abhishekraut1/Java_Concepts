package com.company;
import java.util.Scanner;
public class Codechef_CHEFCONTEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int sum1,sum2;
            sum1=x+10*p;
            sum2=y+10*q;
            if(sum1<sum2)
                System.out.println("Chef");
            else if(sum1>sum2)
                System.out.println("Chefina");
            else
                System.out.println("Draw");
        }
    }
}