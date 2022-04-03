package com.company;
import java.util.Scanner;
public class Codechef_TWONMS {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    while(test -- > 0){
        int a = sc.nextInt(); //Alice no.
        int b = sc.nextInt(); //Bob no.
        int n = sc.nextInt(); //no. of turns
            if(n%2 != 0) // if turns are odd then multiply a by 2
               a = (a*2);
        System.out.println(Math.max(a,b)/Math.min(a,b));
    }
}
}