package domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tablero extends JPanel {
    public Tablero(){
        this.setLayout(new GridLayout(3,3));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
    }

}
