package com.company;

class Base
 {
   Base(){
   System.out.println("Constructor of Base class");
   }
   Base(int x){
       System.out.println("Parameterised Constructor of Base class with value of x as: "+x);
   }
  }
  class Derived extends Base {
   Derived()
   {
       System.out.println("Constructor of Derived class");
   }
   Derived(int x,int y){
       super(x);
       System.out.println("Parameterised Constructor of Derived class with value of y as: "+y);
   }
  }
  class ChildOfDerived extends Derived {
      ChildOfDerived() {
          System.out.println("Constructor of ChildOfDerived class");
      }

      ChildOfDerived(int x, int y, int z) {
           super(x,y);
          System.out.println("Parameterised Constructor of ChildOfDerived class with value of z as: " + z);
      }
  }
  public class Constructor_In_Inheritance{
   public static void main(String[] args)
   { 
    ChildOfDerived o = new ChildOfDerived();
    ChildOfDerived o2 = new ChildOfDerived(1,2,3);
   }
 }

//When we call Constructor of SUB CLASS
//AUTOMATTICALLY the Constructor of SUPER CLASS is called