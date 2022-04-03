package com.company;

import java.util.ArrayDeque;

public class ArrayDequeue_Demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);

        ad1.pollFirst(); //deletes first element
        ad1.removeFirst(); //deletes first element

        ad1.pollLast(); ///deletes last element
        ad1.removeLast(); //deletes last element
    }
}
