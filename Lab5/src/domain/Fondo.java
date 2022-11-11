package domain;

import javax.swing.*;
import java.awt.*;

public class Fondo extends JPanel {
    private Image fondo;

    public void paint(Graphics g){
        fondo = new ImageIcon(getClass().getResource("/Imagenes/tantfant.jpg")).getImage();
        g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }

}
