package com.company;

//1. Find the nth node from the end & remove it.
//        Time complexity - O(n)
//        Space complexity - O(1)

class LL5 {

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
         if(head == null){
             head = newNode;
             return;
         }
         Node currNode = head;
         while (currNode.next != null){
             currNode = currNode.next;
         }
         currNode.next = newNode;
     }
     public void printList(){
         if(head == null){
             return;
         }
         Node currNode = head;
         while (currNode != null){
             System.out.print(currNode.data +" ");
             currNode = currNode.next;
         }
     }
     public void removeNthNodeFromEnd(int n) {
         if (head == null) {
             head = null;
             return;
         }
         if (head.next == null) {
             head = null;
             return;
         }
//         Find size of list
         int size = 0;
         Node currNode = head;
         while (currNode != null) {
             currNode = currNode.next;
             size++;
         }
         System.out.println(size);
         if (n == size) {
             head =  head.next;
             return;
         }

         int ptf = size - n; // position to find
         int cp = 1; //current position
         Node prevNode = head;
         while (cp != ptf) {
             prevNode = prevNode.next;
             cp++;
         }
         prevNode.next = prevNode.next.next;
     }

     public static void main(String[] args) {
         LL5 list = new LL5();
         list.addLast(1);
         list.addLast(2);
         list.addLast(3);
         list.addLast(4);
         list.addLast(5);
         list.printList();

         System.out.println();
         System.out.println(list.head.data);

         System.out.println();
         list.removeNthNodeFromEnd( 4);
         list.printList();
     }
}
