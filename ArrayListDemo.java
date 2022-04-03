package com.company;
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//*************************
//Time Complexity of insertion in ArrayList = O(n)
//Time Complexity of get element in ArrayList = O(1)

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(9);
        a.add(4);
//        System.out.println(a); --> to print arraylist

        //search
        System.out.println(a.indexOf(4));

        ArrayList<Integer> a2 = new ArrayList<>(5); //Initial Capacity is given
        a2.add(9);

        //insertion
        a2.add(0, 88);

        a.addAll(a2);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
        //index
        System.out.println(a.indexOf(9));
        System.out.println(a.lastIndexOf(9));

        ArrayList<Integer> a3 = new ArrayList<>(5);
        a3.add(9);
        a3.add(4);
        a3.set(0, 445); //set
        for (int i = 0; i < a3.size(); i++) {
            System.out.print(a3.get(i) + " ,");
        }

        //a3.clear(); --> to clear arraylist

        //Collection Sort--> To sort Elements
        Collections.sort(a3);

        Object[] arr = a3.toArray(); //Returns an array containing all the elements in this list in proper sequence (from first to last element).
        System.out.println();
        for (int i = 0; i < a3.size(); i++) {
            System.out.print(arr[i] + " ");
        }

        //Taking input in Integer type arraylist
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }
        System.out.println();
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i) + " ");

        }
    }
}
