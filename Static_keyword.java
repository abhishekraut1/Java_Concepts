package com.company;

public class Static_keyword{
    static int logic(int a, int b) {
        int c;
        if (a > b) {
            System.out.println(a * b);
        }
        else {
            System.out.println(a + b);
        }
        return 0;
    }
    float div(int x, int y){
        float z;
        z = x/y;
        System.out.println(z);
        return z;
    }

    public static void main(String[] args) {
        //Invoking method by using variables
        int x;
        x = logic(5,2); //For invoking method by using variables in main method the method should be of
                              // [static type and having same datatype]

        // static methods can be invoke without creating object
       Static_keyword.logic(8,2);

        //Invoking method by object creation
        Static_keyword obj = new Static_keyword();
        float n = obj.div(8,4);
    }
    }
