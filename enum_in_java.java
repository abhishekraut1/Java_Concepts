package com.company;

//POINTS:
//1) The main objective of enum is to define our own data types(Enumerated Data Types).
//2) In java Enum declaration can be done outside a Class or inside a Class but NOT inside a Method.
//3)In Java, we can also add variables, methods and constructors to it.
enum Mobile{
    APPLE,SAMSUNG,HTC;
    //Constructor --> It will be call 3 times because there are 3 constants
    // APPLE(100),SAMSUNG(2),HTC(0);
   /* Mobile(int i) {
        System.out.println("Constructor");
    }  */
    // int price=10000; --> this value is constant for all constants
     int getPrice(int i){
         return i;
    }
}
//Actual formation of enum behind the scene
/* class Mobile{
   static final Mobile APPLE = new Mobile();
    static final Mobile SAMSUNG = new Mobile();
    static final Mobile HTC = new Mobile();
  }
  */
public class enum_in_java {
    public static void main(String[] args) {
        //get price for different constants
        System.out.println(Mobile.APPLE.getPrice(87));
        System.out.println(Mobile.SAMSUNG.getPrice(7777));

        Mobile m1 = Mobile.APPLE;
        System.out.println(m1);
        Mobile m2 = Mobile.HTC;
        System.out.println(m2);
    }
}
