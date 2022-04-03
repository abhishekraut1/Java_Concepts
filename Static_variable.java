package com.company;

import java.io.*;
class Test1
{
    int x=2;  //instance variable
    static int y=4;  //static variable : It can be used in any method. 
    void setx(int l) //They can be called by class name i.e class_name.varible
    {
       x=l; //local variable
    }
    void sety(int m)
    {
      y=m;
    }
    int getx()
    {
        return x;
    }
    int gety()
    {
        return y;
    }
    public static void main(String args[])
    {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        t1.setx(3);
        t2.setx(5);
        System.out.println("instance variable of object t1 = "+t1.getx());
        System.out.println("instance variable of object t2 = "+t1.getx());
        
        System.out.println("value of y accessed through class name = "+Test1.y);
        
        Test1.y=99;
         System.out.println("changed value of y accessed through class name = "+Test1.y);
        
        t1.sety(Test1.y=7);
         System.out.println("value of y accessed through method and object = "+Test1.y);
    }
}