package domain;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    public Game(){
        this.setLayout(new GridLayout(1,2));
        JButton BotonColor = new JButton("Jugar");
        JButton BotonTamaño = new JButton("Reiniciar");
        this.add(BotonColor);
        this.add(BotonTamaño);
    }
}

