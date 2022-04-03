package com.company;

public class BitManipulation {
    public static void main(String[] args) {
        //GET BIT (use AND operation)
        int no = 5; //  0    1    0    1
                    // 3rd  2nd  1st  0th <-- positions
        int pos = 2;//
        int bitMask = 1<<pos;
        if((bitMask & no) == 0)
            System.out.println("bit was zero");
        else
            System.out.println("bit was one");

        //SET BIT (use OR operation)
        int bitMask_1 = 1<<pos;
        int ans1 = bitMask_1 | no;
        System.out.println(ans1);

        //CLEAR BIT (use AND WITH NOT operation)
        int bitMask_2 = 1<<pos;
        int notBitMask = ~(bitMask_2);
        int ans2 = notBitMask & no;
        System.out.println(ans2);
    }
}
