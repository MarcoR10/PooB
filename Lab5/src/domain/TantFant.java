package domain;

import presentation.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 */
public class TantFant extends JPanel implements MouseListener {

    final Tablero tablero;

    /**
     *
     */
    public TantFant(){
        tablero = new Tablero();
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

}
