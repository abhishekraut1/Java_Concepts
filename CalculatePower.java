package com.company;

public class CalculatePower {
    // TO PRINT x^n

    //Time complexity = O(n)
    static int calcPow1(int x,int n){
        if(x==0){ //base case 1
            return 0;
        }
        if(n==0){ //base case 2
            return 1;
        }
        return x*calcPow1(x,n-1);
    }

    //Time complexity = log(n)
    static int calcPow2(int x,int n){
        if(x==0){ //base case 1
            return 0;
        }
        if(n==0){ //base case 2
            return 1;
        }
        if(n%2==0){ //if n is even
            return calcPow2(x,n/2) * calcPow2(x,n/2);
        }
        else{  //if n is odd
            return calcPow2(x,n/2) * calcPow2(x,n/2) * x;
        }
    }
    public static void main(String[] args) {
        int ans1 = calcPow1(2,5);
        System.out.println(ans1);

        int ans2 = calcPow2(2,5);
        System.out.println(ans2);
    }
}
