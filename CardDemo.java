package com.company;
/*
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
*/
import java.awt.*;
import java.awt.event.*;
public class CardDemo extends Frame implements ActionListener {
    Panel cardPanel;	Panel p1, p2, p3;		Panel buttonP;
    Button B1,B2,B3;	CardLayout cLayout;
    public void cardDemo(){
        cardPanel = new Panel();
        cLayout = new CardLayout();
        cardPanel.setLayout(cLayout);
        p1 = new Panel();
        p1.setBackground(Color.red);
        p2 = new Panel();
        p2.setBackground(Color.yellow);
        p3 = new Panel();
        p3.setBackground(Color.green);
        B1 = new Button("Red");
        B1.addActionListener(this);
        B2 = new Button("Yellow");
        B2.addActionListener(this);
        B3 = new Button("Green");
        B3.addActionListener(this);
        buttonP = new Panel();
        buttonP.add(B1);
        buttonP.add(B2);
        buttonP.add(B3);
        cardPanel.add(p1, "B1");
        cardPanel.add(p2, "B2");
        cardPanel.add(p3, "B3");
        setLayout(new BorderLayout());
        add(buttonP, BorderLayout.SOUTH);
        add(cardPanel, BorderLayout.CENTER);
        setVisible(true);	setSize(300,200);
        setTitle("DemoCard");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.out.println("Closing");
                System.exit(0);}});}
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == B1)
            cLayout.show(cardPanel, "B1");
        if (e.getSource() == B2)
            cLayout.show(cardPanel, "B2");
        if (e.getSource() == B3)
            cLayout.show(cardPanel, "B3");}
    public static void main(String[] args){
        CardDemo demo=new CardDemo();
        demo.cardDemo();} }
