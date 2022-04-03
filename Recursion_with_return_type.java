package com.company;

public class Recursion_with_return_type {
    //n! = n*(n-1)!
    static int factorial(int n){
      if(n==0 || n==1){
          return 1;
      }
      else{
          return n*factorial(n-1); //to find factorial
      }
    }
    static int s = 0;
    static int sum(int n){//To find sum of n natural nos
        if(n==1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    static void pattern(int b){//For star pattern
        if(b>0){
            pattern(b-1);
            for(int i=0;i<b;i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println("The factorial of "+x+" is "+factorial(x));
        System.out.println(sum(5));

        pattern(4);
    }
}
