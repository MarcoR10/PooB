package domain;

import javax.swing.*;
import java.awt.*;

public class Tablero extends JPanel {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    public Tablero(){
        this.setLayout(new GridLayout(3,3));
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
    }

}
