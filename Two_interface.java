package com.company;
interface A{
    void showA();
}
interface B extends  A{
    void showB();
}
class InDemo implements B {
    public void showA(){  //public keyword is used.
        System.out.println("Overridden method of interface A");
    }
    public void showB(){
        System.out.println("Overridden method of interface B");
    }

    public static void main(String[] args) {
        InDemo d = new InDemo();
        d.showA();
        d.showB();
    }
}
