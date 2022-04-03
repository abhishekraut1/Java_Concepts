package com.company;

interface Camera1{
    void takeSnap();
    String[] collectSnap();
}
interface Call1{
    void  takeCall();
     private void privateCall(){ //private method : It can be called in default method
        System.out.println("It is private call...");
    }
    default void recordCall(){  //default method : it can be called by using object AND It is not forced to implement it in class
        System.out.println("Recording call...");
        privateCall();
    }
}

class CellPhone1{
void cell(){
    System.out.println("In CellPhone class");
}
}

class SmartPhone1 extends CellPhone1 implements Camera1,Call1{
    public void  takeCall(){
        System.out.println("Taking call");
    }
    public void takeSnap(){
        System.out.println("Take snap of Abhishek");
    }
    public String[] collectSnap(){
        System.out.println("Getting snaps...");
        String[] snapList = {"Abhishek","Pawan","Kushal"};
                return snapList;
    }
    //We can update default methods
  // public void recordCall(){  //default method : it can be called by using object AND It is not forced to implement it in class
   //     System.out.println("Recording Updated call...");
   // }
}

public class default_and_private_methods_in_interfaces {
    public static void main(String[] args) {
        SmartPhone1 sm = new SmartPhone1();
        sm.takeSnap();
        String[]  ar = sm.collectSnap();
        for(String item : ar)
            System.out.println(item);
        sm.takeCall();

        sm.recordCall();
    }
}
