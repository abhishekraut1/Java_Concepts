import java.util.Scanner;

 class Percentage
 {
   public static void main(String args[])
   { 
     byte p,c,m;
     System.out.print("Enter the marks of Physics: ");
     Scanner sc = new Scanner(System.in);
     p = sc.nextByte();
     
     System.out.print("Enter the marks of Chemistry: ");
     c = sc.nextByte();
     
     System.out.print("Enter the marks of Maths: ");
     m = sc.nextByte();
     
     float percentage = (p+c+m)/3.0f;
     System.out.print("Therefore Percentage = "+percentage+"%");
     
     if(percentage>=35 && p>=35 && c>=35 && m>=35)
     {
       System.out.println("\nCongrats you got are passed!");
     }
     else
     {
       System.out.println("\nYou are failed!");
     }
   }
 }
