package com.company;

import java.util.HashSet;

public class HashSet_in_java {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(6); // This element will be ignored

        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(3); //remove 3 from the hashset
        System.out.println("myHashSet after removing a element : " + myHashSet);

        System.out.println(myHashSet.isEmpty()); // return true if HashSet is empty

        System.out.println("The size of myHashSet is : " + myHashSet.size());

        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after clearing : " + myHashSet);
    }
}