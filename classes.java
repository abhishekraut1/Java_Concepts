package com.company;
class Class1 {
    String name,food;
    void nameof(String name){   //simple class
        System.out.println("\nName of of the animal is "+name);
    }
    void fooditem(String food){
        System.out.println("Food of of the animal is "+food);
    }
}
class Class2 extends Class1{
    void colourof(String colour){
        System.out.println("Colour of animal is "+colour);
    }
}
class Class3 extends Class1 {

    public static void main(String[] args) {
        Class1 a = new Class1();
        a.nameof("Lion");
        a.fooditem("meat");


        Class2 b = new Class2();
        b.nameof("Dog");
        b.fooditem("Bark");
        b.colourof("Red");
        b.colourof("NEw");
    }
}
