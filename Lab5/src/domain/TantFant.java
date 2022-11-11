package domain;

import presentation.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 */
public class TantFant extends JPanel implements MouseListener {
    // Fondo fondo1 = new Fondo();
    /**
     *
     */
    public TantFant(){
        setLayout(new BorderLayout());
        add(new Tablero(), BorderLayout.CENTER);
        add(new Game(), BorderLayout.SOUTH);
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
