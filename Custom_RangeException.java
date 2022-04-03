package com.company;
//Runs in command prompt

class RangeException extends Exception {
    public String toString() {
        return "marks are not in specified range";
    }
}

public class Custom_RangeException {
    public static void main(String[] args ){
        try {
            System.out.println("Enter the name of student: " + args[0]);
            double[] marks = new double[6];
            double perc = 0;
            for (int i = 1; i < 6; i++) {
                marks[i] = Double.parseDouble(args[i]);
                perc = perc + marks[i]/5;
            }
            for (int i = 1; i < 6; i++) {
                if (marks[i] < 0 || marks[i] > 50) {
                    throw new RangeException();
                }
            }
            System.out.println("marks in physics: " + args[1]);
            System.out.println("marks in maths: " + args[2]);
            System.out.println("marks in chemistry: " + args[3]);
            System.out.println("marks in biology: " + args[4]);
            System.out.println("marks in English: " + args[5]);
            System.out.println("Percentage = "+perc);
        }
        catch (RangeException e){
            System.out.println(e.toString());
        }
    }
}