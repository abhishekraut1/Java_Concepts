import java.util.Scanner;
class Input { 
  //FOR NUMBERS
  public static void main(String args[]) { 
  System.out.println("Taking input from user:\n");
  Scanner variable = new Scanner(System.in); 
  System.out.print("Enter integer no: ");
  int a = variable.nextInt();
  System.out.print("Enter float no: ");
  float b = variable.nextFloat();
  float sum=a+b;
  System.out.println("sum of "+a+" & "+b+" is "+(sum));
  
  System.out.print("sum = ");
  System.out.println(sum); 
  
    //For single String input
    System.out.print("\nEnter one string: ");
    Scanner variable1 = new Scanner(System.in);
    String str1 = variable.next();
    System.out.println(str1);
  
  
    //FOR multiple String input
    System.out.print("\nEnter multiple string: ");
    Scanner variable2 = new Scanner(System.in);
    String str2 = variable2.nextLine();
    System.out.println(str2);
    
    
    //TO check input is integer
    System.out.print("\nEnter int : ");
    System.out.println(variable1.hasNextInt());
  }
  }
  
 /*    NOTE:
   To take input we have to add Scanner class i.e,
   (import java.util.Scanner;)
    */