package com.company;

class Super_Class_Variable {
   int b=50;
  }          //ONE CLASS CAN'T EXTENDS TWO CLASSES
class newOne extends Super_Class_Variable{
    void meth() {
        System.out.println("\nValue odf b is " + b);
    }
}
  class Sub_Class extends Super_Class_Variable {
      int b = 100;
      void show() {
          System.out.println("Sub class variable is " + b);
          System.out.println("Super class variable is " + super.b);  //using super keyword
      }
   public static void main(String args[])
   {
       newOne o = new newOne();
       o.meth();

    Sub_Class obj = new Sub_Class();
    obj.show(); //Calling sub class method
   }
}

