 class Encrypt
 {
   public static void main(String args[])
   { 
   char grade='A';
   //Change A to encrypt grade
    grade=(char)(grade+8);
    System.out.println(grade);
    //Then decrypt grade
      grade=(char)(grade-8);
    System.out.println(grade);
   }
 }
 // Here we write (char) to  grade to 
 // increase grade by 8 character.