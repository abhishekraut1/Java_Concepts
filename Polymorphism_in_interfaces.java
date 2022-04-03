package com.company;

interface Camera{
    int b=9;
    void takeSnap();
    String[] collectSnap();
}
interface Call{
    void  takeCall();
    private void privateCall(){ //private method : It can be called in default method
        System.out.println("It is private call...");
    }
    default void recordCall(){  //default method : it can be called by using object AND It is not forced to implement it in class
        System.out.println("Recording call...");
        privateCall();
    }
}

class CellPhone{
    void cell(){
        System.out.println("In CellPhone class");
    }
}

class SmartPhone extends CellPhone implements Camera,Call{
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
}

public class Polymorphism_in_interfaces {
    public static void main(String[] args) {
        Camera cam = new SmartPhone();  // This is a smartphone but, use it as a camera
        cam.takeSnap();
        cam.collectSnap();
//        cam.takeCall;  --> Not Allowed
//        cam.recordCall();  --> Not Allowed
//        cam.cell();  --> Not Allowed (NOTE)

        SmartPhone sm = new SmartPhone();  // Can call all method
        sm.takeSnap();
        sm.takeCall();
        sm.recordCall();
        sm.takeSnap();
    }
}
