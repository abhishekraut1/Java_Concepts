package com.company;

interface MyInterface{
    int add(int a,int b);
    int multiply(int a,int b);
}
class MyClass implements MyInterface{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
}

class Super {
    public void name() {
        System.out.println("My name is Super");
    }
    public void who() {
        System.out.println("SUPER");
    }

}
class Sub extends Super{
    public void name() {
        System.out.println("My name is Sub");
    }

    public void whois() {
        System.out.println("SUB");
    }
}
public class Dyamic_method_dispatch {
    public static void main(String[] args) {
        //DYNAMIC METHOD DISPATCH USING Classes

        Super obj = new Sub(); //It is Allowed
      //Superclass reference = Subclass Object
        //Hence we only call Super class methods using this object NOT subclass.
      //When we use 'new' object forms in run time

       // Sub obj2 = new Super(); --> It is Not Allowed

        obj.name();  // It calls Subclass Method
        obj.who();  //It calls Superclass Method
       // obj.whois(); //It is Not Allowed

        //DYNAMIC METHOD DISPATCH USING Interfaces
        MyInterface mi = new MyClass();
        System.out.println(mi.add(4,5));
        System.out.println(mi.multiply(8,2));
    }
}
