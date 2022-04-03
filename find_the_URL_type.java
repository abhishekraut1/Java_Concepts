import java.util.*;

 class URL
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the URL: ");
    Scanner sc = new Scanner(System.in);
    String url = sc.next();
    if(url.endsWith(".com"))
    {
      System.out.println("It is commercial website.");
   }
   else if(url.endsWith(".in"))
    {
      System.out.println("It is Indian website.");
   }
   else if(url.endsWith(".org"))
    {
      System.out.println("It is organisational website.");
   }
 }
 }