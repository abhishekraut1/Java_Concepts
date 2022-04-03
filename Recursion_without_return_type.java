package com.company;

public class Recursion_without_return_type {
    //to print numbers from 1 to 5
    public static void printNum(int i){
        if(i==6){
            return;
        }
        System.out.print(i+" ");
        printNum(i+1);
    }

    //to print sum of n numbers
    public  static void sumof(int j,int n,int sum){
        if(j==n) {
            sum = sum+ j;
            System.out.println();
            System.out.println(sum);
            return;
        }
        sum=sum+j;
        sumof(j+1,n,sum);
    }
    public static void main(String[] args) {
        printNum(1);
        sumof(1,5,0);
    }
}
