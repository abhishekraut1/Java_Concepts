package com.company;
import java.util.Scanner;
public class Codechef_UTKPLC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte test = sc.nextByte();
        char[] arr1 = new char[3];
        char[] arr2 = new char[2];
        int i;
        char a = 'b';

        while (test-- > 0) {
            for (i = 0; i < 3; i++) {
                arr1[i] = sc.next().charAt(0);
            }
            for (i = 0; i < 2; i++) {
                arr2[i] = sc.next().charAt(0);
            }
            for (i = 0; i < 2; i++) {
                    if (arr2[0] == arr1[i]) {
                        a = arr2[0];
                            System.out.println(a);
                            break;
                    } if (arr2[1] == arr1[i]) {
                        a = arr2[1];
                          System.out.println(a);
                        break;
                    }
            }
        }
    }
}