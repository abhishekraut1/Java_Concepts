package com.company;

//        Recursive Method
//        Time complexity - O(n)
//        Space complexity - O(1)

class LL4 {
     Node head;
     class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
     public void addLast(int data) {
         Node newNode = new Node(data);
         if (head == null) {
             head = newNode;
             return;
         }
         Node currNode = head;
         while (currNode.next != null) {
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
    //***********************************************
     public Node reverseRecursive(Node head){
         //base case
         if(head==null || head.next==null){
             return head;
         }
         Node newHead = reverseRecursive(head.next);
         head.next.next = head;
         head.next = null;

         return newHead;
     }
     public static void main(String[] args) {
         LL4 list = new LL4();
         list.addLast(1);
         list.addLast(2);
         list.addLast(3);
         list.addLast(4);
         list.addLast(5);
         list.addLast(6);
         list.addLast(7);
         list.printList();

         System.out.println();
         list.head = list.reverseRecursive(list.head);
         list.printList();
     }
}
