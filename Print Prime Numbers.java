package com.company;

import java.util.Scanner;
class Prime {
        public static boolean isPrime(int n){
            // Check if number is less than
            // equal to 1
            if(n<=1)
                return false;
            // Check if n is a multiple of 2
            if(n%2==0)
                return false;
            // If not, then just check the odds
            for(int i=3;i<=Math.sqrt(n);i+=2){
                if(n%i==0)
                    return false;
            }
            return true;
        }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int n = s.nextInt();
        for (int j = a; j <=n; j++) {
          if(isPrime(j)) {
              System.out.print(j+ " ");
          }
        }
    }
}
//   for(j=2;j<n;j++)
//   {
//     if(i%j==0)
//     break;
//    }
//    if(i==j)
//    {
//      System.out.print(i+" ");
//     }