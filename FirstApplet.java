package com.company;

/* <APPLET CODE="FirstApplet.class" WIDTH=200 HEIGHT=150></APPLET> */

import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("This is First Applet",10,20);
    }
}