package com.company;

//        Iterative Method
//        Time complexity - O(n)
//        Space complexity - O(1)

//         Collections Method
//         Time complexity - O(n)
//         Space complexity - O(1)

import java.util.Collections;
import java.util.LinkedList;

class LL3 {
     Node head;
     class Node{
         int data;
         Node next;
         Node(int data){
             this.data = data;
             this.next = null;
         }
     }
     public void addLast(int data){
         Node newNode = new Node(data);
         if(head==null){
             head = newNode;
             return;
         }
         Node currNode = head;
         while(currNode.next!=null){
             currNode = currNode.next;
         }
         currNode.next = newNode;
     }

     public void printList(){
         if(head==null){
             System.out.println("list is empty");
             return;
         }
         Node currNode = head;
         while (currNode != null){
             System.out.print(currNode.data+" ");
             currNode = currNode.next;
         }
     }

     public void reverseIterative(){
         if(head==null || head.next==null){
             return;
         }
         Node prevNode = head;
         Node currNode = head.next;
         while (currNode != null){
             Node nextNode = currNode.next;
             currNode.next = prevNode;

             //update
             prevNode = currNode;
             currNode = nextNode;
         }
         head.next = null;
         head = prevNode;
     }

     public static void main(String[] args) {
         LL3 list = new LL3();
         list.addLast(1);
         list.addLast(2);
         list.addLast(3);
         list.addLast(4);
         list.addLast(5);
         list.addLast(6);
         list.addLast(7);
         list.printList();

         System.out.println();
         list.reverseIterative();
         list.printList();

         LinkedList<Integer> list1 = new LinkedList<>();
         System.out.println();
         list1.add(1);
         list1.add(2);
         System.out.println(list1);

         Collections.reverse(list1);
         System.out.println(list1);
     }
}
