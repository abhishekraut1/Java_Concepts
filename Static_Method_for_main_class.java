package com.company;

public class Static_Method_for_main_class {
     static int bc;

    static int logic(int x, int y){
        int z,bc=4;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;

        c = logic(bc, b);
        System.out.println(c);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.print(c1);
    }
}
