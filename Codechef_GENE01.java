package com.company;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Scanner;
public class Codechef_GENE01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char p1 = sc.next().charAt(0);
        char p2 = sc.next().charAt(0);
        PrintStream ps = new PrintStream(System.out);
        if (p1 == 'R' && p2 == 'G' || p1 == 'G' && p2 == 'R' || p1 == 'R' && p2 == 'R' || p1 == 'R' && p2 == 'B' || p1 == 'B' && p2 == 'R' ) {
            ps.println("R");
        }
        if (p1 == 'G' && p2 == 'B' || p1 == 'B' && p2 == 'G' || p1 == 'B' && p2 == 'B') {
            ps.println("B");
        }
        if(p1 == 'G' && p2 == 'G')
            ps.println("G");
    }
}
