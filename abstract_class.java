package com.company;
 abstract class Animal {
    String name,food;
    void nameof(String name){   //usual method WITH method body
        System.out.println("Name of of the animal is "+name);
    }
    void fooditem(String food){
        System.out.println("Food of of the animal is "+food);
    }
     abstract void soundof(String sound);  //abstract method WITHOUT method body.
}
abstract class Fish{
    abstract void swim(int s);
}
//NO MULTIPLE INHERITANCE :---
//abstract class can't extends two classes at one time
//class Abc extends Animal,Fish  --> Throws Error
class Lion extends Animal {
    void soundof(String sound) {
        System.out.println("sound of animal is for Lion class " + sound);
    }
    void colourof(String colour) {
        System.out.println("colour of animal is " + colour);
    }
}
class Ab extends Animal{
    void soundof(String sound) {
        System.out.println("\n////////////////////////////// " + sound);
    }
}
class Lion2 extends Lion{
    void soundof(String sound) {
        System.out.println("\nsound of animal is for Lion2 class " + sound);
    }
    public static void main(String[] args) {
        Lion a = new Lion();
        a.nameof("Lion");
        a.fooditem("meat");
        a.soundof("roar 1");
        a.colourof("red");

        Lion2 b = new Lion2();
        b.soundof("roar 2");

        Ab m = new Ab();
        m.soundof("oo");
    }
}
//Here soundOf() method is used two times for different purpose