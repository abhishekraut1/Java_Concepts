package com.company;

//Que. : Take elements(numbers in the range of 1-50) of a Linked List as input
//from the user. Delete all nodes which have values greater than 25.

 class LL2 {
     Node head;
     class Node {
         int data;
         Node next;

         Node(int data) {
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
     //***********************************************
     public void solve(){
         Node currNode = head;
         while (currNode.next != null){
             if(currNode.next.data > 25){
                 currNode.next = currNode.next.next;
             }
             currNode = currNode.next;
         }
     }
    public static void main(String[] args) {
        LL2 list = new LL2();
        list.addLast(1);
        list.addLast(50);
        list.addLast(7);
        list.addLast(30);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.solve();
        list.printList();
    }
}
