package com.company;

import java.io.*;
class VolumeCalculation
{
    double length,breadth,height,volume;
    VolumeCalculation(double l,double  b,double h)  //Constructor can be called by class name
    {                                               //Constructor doess not have any return type
        length=l;
        breadth=b;
        height=h;
    }
    double volCal()
    {
        volume= length*breadth*height;
        return volume;
    }
    public static void main(String args[])
    {
        VolumeCalculation r1 = new VolumeCalculation(14,12,10);
         VolumeCalculation r2 = new VolumeCalculation(19,15,13);
            System.out.println("Volume = "+r1.volCal());
            System.out.println("Volume = "+r2.volCal());
            
    }
}