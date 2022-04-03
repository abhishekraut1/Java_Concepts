package com.company;

import java.util.Scanner;

public class Find_no_of_bits_in_a_no_MIMP {
    //Method 1 : right shift only number
    public static int count1A(int num) {
        //GET BIT (use AND operation)
        //  0    1    0    1
        // 3rd  2nd  1st  0th <-- positions
        int count = 0;
        int cur = num;
        for (int i = 0; i < 33; i++) {
            count += cur & 1;
            cur >>= 1; //>> cur : 1 times
        }
        return count;
    }
    //Method 1 : left shift only 1
        //GET BIT (use AND operation)
        //  0    1    0    1
        // 3rd  2nd  1st  0th <-- positions
    public static int count1B(int num) {
        int count = 0;
        int cur = num;
        for (int i = 0; i < 33; i++) {
            count += cur & 1;
            cur <<= 1; //<< 1 : 1 times
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans1 = count1A(num);
        System.out.println(ans1);

        int ans2 = count1A(num);
        System.out.println(ans2);
    }
}