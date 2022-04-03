package com.company;

public class String_methods {
        public static void main(String[] args)
        {
            String name = "Abhishek";
            System.out.println("Name is "+name);

            System.out.println("\n1");
            int value = name.length();
            System.out.println(value);

            System.out.println("\n2");
            String lstring = name.toLowerCase();
            System.out.println(lstring);

            System.out.println("\n3");
            String ustring = name.toUpperCase();
            System.out.println(ustring);

            System.out.println("\n4");
            String newString = "    Abhishek    ";
            System.out.println(newString);
            System.out.println(newString.trim()); //It is used to delete spaces in the string

            System.out.println("\n5");
            System.out.println(name.substring(2));  //Print string from index 2 to end
            System.out.println(name.substring(2,7)); //Print string from index 2 to index 7-1=6

            System.out.println("\n6");
            System.out.println(name.replace('A','b'));
            System.out.println(name.replace("A","Abhi"));

            System.out.println("\n7");
            System.out.println(name.startsWith("A"));
            System.out.println(name.endsWith("END"));

            System.out.println("\n8");
            System.out.println(name.charAt(0)); //Character at location 0

            System.out.println("\n9");
            String moreName = "abhishshshekabhi";    ////////////////////////////////////////////////////
            System.out.println(moreName.indexOf("sh")); //Index from starting
            System.out.println(moreName.indexOf("abhi",4));  //Index from 4 to end
            System.out.println(moreName.lastIndexOf("sh",10));//Index from 10 to start

            System.out.println("\n10");
            System.out.println(name.equals("Abhishek"));  //TO FIND THE STRING IN GIVEN STRING
            System.out.println(name.equalsIgnoreCase("ABHISHEK"));

            System.out.println("\n11");
            System.out.println("I\tam \"escape sequence\" ");

            System.out.println("\n12");
            //STRINGS ARE IMMUTABLE
            moreName = moreName.replace("abhishshshekabhi","ABHISHEK");
            System.out.println(moreName);

            System.out.println("\n\n13");
            System.out.println("Character at position 4 is "+moreName.charAt(4));
        }
    }
