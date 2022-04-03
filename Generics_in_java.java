package com.company;

class MyGeneric <T1,T2>{   // T1 and T2 are class types
    int value;
    private T1 t1;
    private T2 t2;
    public MyGeneric(int value,T1 t1,T2 t2){
        this.value = value;
        this.t1 = t1;
        this.t2 = t2;
    }
    public int getValue() {
        return value;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }
}
public class Generics_in_java {
    public static void main(String[] args) {

        MyGeneric<String,Integer> g = new MyGeneric<>(7,"Abhishek",3);
        System.out.println(g.getValue());
        System.out.println(g.getT1());
        System.out.println(g.getT2());
    }
}
