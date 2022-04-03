package com.company;

class One {
    int a, b, c;
    void operate(int a, int b) {
        c = a + b;
        System.out.println("Addition = " + c);
    }
}
class Two extends One {
    @Override  //It used to identify we are actually overriding or NOT.
    void operate(int a, int b) {
        c = a * b;
        System.out.println("Multiplication = " + c);

    }

}
public class Method_overriding{
    public static void main(String[] args) {
       Two obj2 = new Two();
       obj2.operate(4,5);
       One obj1 = new One();
       obj1.operate(4,5);
        }
}
//If parameters of methods are different then they are not overriding.