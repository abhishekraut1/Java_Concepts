package com.company;

class B1 {
    B1(String x) {
        System.out.println("hello " + x);
    }
    B1(String x, int y) {
       this(x);  //It is used to call constructor with one parameter
        System.out.println(y);
    }
}
    class TestThis5{
        public static void main(String args[]){
           // B1 a2 = new B1("Abhi");
            B1 a=new B1("Abhi",10);

        }
    }
