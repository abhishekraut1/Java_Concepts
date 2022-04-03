//For showing Layout only

package com.company;
import java.awt.*;
public class BLayoutDemo extends Frame{
    public BLayoutDemo(String title) {
        super(title);
        add(new Button("North"),BorderLayout.NORTH);
        add(new Button("South"),BorderLayout.SOUTH);
        add(new Button("East"),BorderLayout.EAST);
        add(new Button("West"),BorderLayout.WEST);
        add(new Button("Center"),BorderLayout.CENTER);
        setSize(400,270);
        setVisible(true);
    }
    public static void main(String[] args) {
        new BLayoutDemo("Border Layout Example");
    }
}
