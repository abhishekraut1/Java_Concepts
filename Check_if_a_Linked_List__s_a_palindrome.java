package com.company;

class LL6 {
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
    //***********************************************

    public static void main(String[] args) {
        LL6 list = new LL6();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();

    }
}
