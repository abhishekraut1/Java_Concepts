package com.company;

import java.util.*;
import java.util.Random;
 class Game
 {
   public static void main(String args[])
   { 
     int rock=0, paper=1, scissor=2;
     Scanner sc = new Scanner(System.in);
     System.out.println("rock = 0, paper = 1, scissor = 2");
     Random r = new Random();

       System.out.print("Enter the user's value: ");
     int a = sc.nextInt();
     
       int b = r.nextInt(3); //It generates 3 values from 0 to 2
       System.out.println("and computer's value is "+b);
       
       if(a==0 && b==2 || a==1 && b==0 || a==2 && b==1)
       {
         System.out.println("User is Winner");
       }
      else if(a==b)
       {
         System.out.println("Draw");
       }
       else
       {
         System.out.println("\nComputer is Winner");
       }
   }
 }
