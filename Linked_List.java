package com.company;

 class LL {
    //size
    int size;
    // size=0;
    //Constructor
    LL(){
        size = 0;
    }

    //class Node
    Node head; //*********
    public class Node {
        String data;
        Node next;

        //constructor
        Node(String data) {
            this.data = data;
            this.next = null; //******

            size++;
        }
    }

    // addFirst method
     public void addFirst(String data){
         Node newNode = new Node(data);
         //if list is empty
         if(head==null){
             head = newNode;
             return;
         }
        newNode.next = head;
        head = newNode; //update head
     }

     // addLast method
     public void addLast(String data){
        Node newNode = new Node(data);
        //if list is empty
        if(head==null){
            head = newNode;
            return; //IMP
        }
        Node currNode = head; //using currNode object for reference to traverse list. avoid using head itself
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        //at last currNode points at newNode and new node points at null
        currNode.next = newNode;
     }

     //print
     public void printList(){
        //corner case
         if(head==null){
             System.out.println("list is empty");
             return;
         }
        Node currNode = head;
        while(currNode != null){ //NOTE
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
         System.out.println("null");
     }

     //removeFirst method
     public void removeFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;

        size--;
     }

     public void removeLast(){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
         //if list contain only one element
         if(head.next==null) {
             head = null;
             return;
         }
         Node secondLast = head;
         Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
     }

     public void addInMiddle(int index,String data) {
         if (index > size || index < 0) {
             System.out.println("Invalid Index value");
             return;
         }

         size++;

         Node newNode = new Node(data);
         if (head == null || index == 0) {
             newNode.next = head;
             head = newNode;
             return;
         }

         Node currNode = head;
         for (int i = 1; i < size; i++) {
             if (i == index) {
                 Node nextNode = currNode.next;
                 currNode.next = newNode;
                 newNode.next = nextNode;
                 break;
             }
             currNode = currNode.next;
         }
     }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        list.addLast("list");

        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println(list.size);

        list.addInMiddle(1,"added");
        list.printList();
    }
}

