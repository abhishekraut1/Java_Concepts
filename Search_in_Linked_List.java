package com.company;

//Time Complexity = O(n)
class LL1 {
    Node head;
    public class Node{
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
        while (currNode.next != null){
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
    public int searchElement(int element){
        int count = 0;
        Node currNode = head;
        while (currNode.data != element){
            currNode = currNode.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.printList();

        System.out.println();
        System.out.print("index = "+list.searchElement(2));
    }
}
