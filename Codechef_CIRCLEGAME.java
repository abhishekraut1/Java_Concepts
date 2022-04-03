package com.company;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.Callable;

class Code {
    Node head;
    class Node{
        int coin;
        Node next;

        Node(int coin){
            this.coin = coin;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int m = sc.nextInt();
            int x = sc.nextInt();
            Code coin;
            LinkedList<Integer> list = new LinkedList<>();
            for(int i=1;i<=x;i++){
                list.add(i);
            }

        }
    }
}
