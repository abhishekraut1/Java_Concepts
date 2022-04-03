package com.company;

import java.util.Scanner;
public class BitManipulation_UPDATE_BIT {
    public static void main(String[] args) {
        //UPDATE BIT    i.e 0 to 1 and 1 to 0
        //Set Bit + Clear Bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int no = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        if(oper==1){
            int ans = bitMask | no;
            System.out.println(ans);
        }
        else{
            int notBitMask = ~(bitMask);
            int ans = notBitMask & no;
            System.out.println(ans);
        }
    }
}
