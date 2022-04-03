package com.company;
class Practical_2
{
  public static void main(String args[])
  {
      int a=23,b=7;
    System.out.println("Addition ="+(a+b));
    System.out.println("Subtraction: "+(a-b));
    System.out.println("Multiplication ="+(a*b));
    System.out.println("Division = "+(a/b));
    System.out.println("Modulo division is "+(a%b));
    
    int c=50,d=20;
   System.out.println("\nEquality Operatoris "+(c==d));
   System.out.println("Not equal to is "+(c!=d));
   System.out.println("Greater than is "+(c>d));
   System.out.println("Less than is "+(c<d));
   System.out.println("Greater than equal to is "+(c>=d));
   System.out.println("Less than equal to is "+(c<=d));
   
   boolean t=true,f=false; //For Logical Operators NEGATION='!'
   System.out.println("\nLogical OR Operation is "+(t||f));
   System.out.println("Logical AND Operation is "+(t&&f));
   System.out.println("Logical XOR Operation is "+(t^f));
   System.out.println("Logical NOT Operation is "+(!t));
   
   int p=4,q=6;  //For Bitwise Operators NEGATION='~'
   System.out.println("\nBitwise OR Operation is "+(p|q));
   System.out.println("Bitwise AND Operation is "+(p&q));
   System.out.println("Bitwise XOR Operation is "+(p^q));
   System.out.println("Bitwise NOT Operation is "+(~p));
   
   int r=4,s=2;
   System.out.println("\nLeft shift Operation is "+(r<<s));
   System.out.println("Right shift Operation is "+(r>>s));
   System.out.println("Unsigned Right shift Operation is "+(r>>>s));
 }
 }