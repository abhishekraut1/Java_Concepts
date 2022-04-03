import java.util.*;
 class Leap
 {
   public static void main(String args[])
   { 
    System.out.println("Enter the year: ");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    int leapYear=0;
    if(year%4==0)
    {
      leapYear = year;
      if(year%100==0)
      {
        if(year%400==0)
        {
        leapYear = year;
        }
        else
        {
          leapYear = 0;
         }
       }
    }
    if(leapYear == 0)
    {
    System.out.println("Entered year is not a leap year.");
    }
    else
    {
      System.out.println("Entered year is a leap year.");
     }
 }
}