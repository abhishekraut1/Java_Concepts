class Constructor_A
 {
   Constructor_A()
   {
   System.out.println("Constructor_A");
   }
  }
  class Constructor_B extends Constructor_A
 {
   Constructor_B()
   {
   System.out.println("Constructor_B");
   }
  }
  class Constructor_C extends Constructor_B
 {
   Constructor_C()
   {
   System.out.println("Constructor_C");
   }
   public static void main(String args[])
   { 
    Constructor_C obj = new Constructor_C();
   }
 }

//When we call Constructor of SUB CLASS
//AUTOMATTICALLY the Constructor of SUPER CLASS is called