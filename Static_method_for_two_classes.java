package com.company;

import java.io.*;
class Area1
{
    static int computeArea(int width,int height) //static method : Only static variable can be used in static method
    {                                           //staic method becomes common for all classes
        int area = width*height;
        return area;
    }
    }
    class callArea2
{
    public static void main(String args[])
    {
     System.out.println("Area = "+Area1.computeArea(3,4));
    }
}
//static method can be call without creating object