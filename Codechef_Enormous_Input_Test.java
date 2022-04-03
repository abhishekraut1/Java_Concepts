package com.company;
import java.util.Scanner;
public class Codechef_Enormous_Input_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            if(a[i] < Math.pow(10,9) && a[i]%k == 0 && k <= Math.pow(10,7)){
                count++;
            }
        }
        System.out.println(count);
    }}