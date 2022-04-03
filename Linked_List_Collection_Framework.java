package com.company;

import java.util.LinkedList;

public class Linked_List_Collection_Framework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        list.add(3,"linked");

        list.add("list"); //i.e addLast()
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();
        list.remove(1);

        System.out.println(list);
    }
}
