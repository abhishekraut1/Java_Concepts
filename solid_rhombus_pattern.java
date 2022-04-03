package com.company;

public class solid_rhombus_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){  //For no. of rows
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
