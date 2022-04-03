package com.company;

// The 'throws' keyword is used to declare which exceptions can be thrown from a method.
// So it's better to be prepared with 'try catch' block
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "NegativeRadiusException is occurred.";
    }
}

public class throw_and_throws_keyword {
    public static double areaOfCircle(double r) throws NegativeRadiusException{
        if(r < 0){
            throw new NegativeRadiusException();
        }
        return Math.PI * r *r;
    }

    public static int div(int a,int b) throws ArithmeticException{ // ArithmeticException is for int type i.e integer / zero
        return a/b;
    }

    public static void main(String[] args) {
        try {
//            int d = div(8,0);
//            System.out.println(d);

            double ar= areaOfCircle(-1);
            System.out.println("Area of Circle = "+ar);
        }
        catch (Exception e){
//            System.out.println(" ArithmeticException is occurred.");
            System.out.println(e);
        }
    }
}
