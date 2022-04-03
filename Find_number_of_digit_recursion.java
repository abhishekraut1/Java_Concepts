package com.company;

public class Find_number_of_digit_recursion {
    public static int noOfDigit(int n){
        if(n<=9){
            return 1;
        }
        int smallAns = noOfDigit(n/10);
        int ans = smallAns + 1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(noOfDigit(7847));
    }
}
