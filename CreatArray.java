package com.company;

import java.util.Scanner;

public class CreatArray {
    int totalSize,usedSize;
    int[] a;
     void creatArray(int ts, int us) {
        totalSize=ts;
        usedSize=us;
         a = new int[usedSize];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < usedSize; i++) {
            a[i] = sc.nextInt();
        }
    }
     void getArray(){
        for(int i=0;i<usedSize;i++){
            System.out.print(a[i]+", ");
        }
    }
    public static void main(String[] args) {
         CreatArray o = new CreatArray();
        o.creatArray(5,3);
        o.getArray();
    }
}
