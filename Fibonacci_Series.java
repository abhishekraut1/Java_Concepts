package com.company;

public class Fibonacci_Series {
    //To print Fibonacci series using iteration
    static void itFib(int n){
        int []arr =new int[n];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
    }
    //to print Fibonacci series using recursion
    //Time complexity = O(n)
    static void recFib(int a,int b,int n){ //n is counter
        if(n==0) {
            return;
        }
        int c =a+b;
        System.out.print(c+" ");
        recFib(b,c,n-1);
    }
    //To find ath fibonacci no
    static int find(int a){
        if (a == 1 || a == 2) {
            return a-1;
        }
        else{
            return find(a-1)+find(a-2);
        }
    }
    public static void main(String[] args) {
        itFib(20);
        System.out.println();

        int a=0,b=1,n=7;
        System.out.print(a+" "+b+" ");
        recFib(a,b,n-2);
        System.out.println();

        System.out.print(find(4));
    }
}