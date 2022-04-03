import java.util.Scanner;
 class Marks
 {
   public static void main(String args[]){ 
   System.out.println("Enter the marks of student: ");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the marks 1st subject: ");
   float sub1 = sc.nextFloat();
   System.out.println("Enter the marks 2nd subject: ");
   float sub2 = sc.nextFloat();
   System.out.println("Enter the marks 3rd subject: ");
   float sub3 = sc.nextFloat();
   System.out.println("Enter the marks 4th subject: ");
   float sub4 = sc.nextFloat();
   System.out.println("Enter the marks 5th subject: ");
   float sub5 = sc.nextFloat();
   System.out.println("Percentage: ");
   float per = (sub1 +sub2+sub3+sub4+sub5)/5;
   System.out.println(per);
   }
   }