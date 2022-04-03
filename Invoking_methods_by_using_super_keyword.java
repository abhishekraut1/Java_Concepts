package com.company;

class Anew
 {
   void show()
   {
     System.out.println("Super class show method");
   }
  }
  class Bnew extends Anew
{
  void show()
  {
    System.out.println("Sub class show method");
      super.show();//******************
   }
   public static void main(String args[])
   {
    Bnew obj = new Bnew();
    obj.show(); //Calling sub class method
   }
}