package presentation;
import domain.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @ Nicolas Castro - Marco Alvarez
 * Este Codigo Interpreta la parte visual de Tant Fant
 */
public class TantFantGUI extends JFrame {
    public JMenu menu;
    public JMenuItem nuevo,abrir,guardar,salir;

    /**
     *
     */
    public static void main( String[] args ) {
        TantFantGUI tant = new TantFantGUI();
        tant.setVisible(true);
    }
    /**
     *
     */
    private TantFantGUI() {
        prepareElements();
        prepareActions();
    }
    /**
     *
     */
    public void prepareElements(){
        setTitle("Tant Fant");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(pantalla.width/2,pantalla.height/2);
        setLocationRelativeTo(null);
        prepareElementsMenu();
        prepareElementsBoard();
    }
    /**
     *
     */
    private void prepareElementsMenu(){
        JMenuBar menuBar = new JMenuBar();
        menu = new JMenu("Menú");
        menuBar.add(menu);
        nuevo = new JMenuItem("Nuevo");
        abrir = new JMenuItem("Abrir");
        guardar = new JMenuItem("Guardar");
        salir = new JMenuItem("Salir");
        menu.add(nuevo);
        menu.add(abrir);
        menu.add(guardar);
        menu.add(salir);
        setJMenuBar(menuBar);
    }
    /**
     *
     */
    private void prepareElementsBoard(){
        JPanel tant = new TantFant();
        this.getContentPane().add(tant);
    }
    /**
     *
     */
    public void prepareActions() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Salir();
            }
        });
        prepareActionsMenu();
    }
    /**
     *
     */
    public void prepareActionsMenu(){
        nuevo.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Nuevo();
                    }
                }
        );
        abrir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Abrir();
                    }
                }
        );
        guardar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Guardar();
                    }
                }
        );
        salir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Salir();
                    }
                }
        );
    }
    /**
     *
     */
    public void Nuevo(){
    }
    /**
     *
     */
    public void Abrir(){
    }
    /**
     *
     */
    public void Guardar() {
    }
    /**
     *
     */
    public void Salir(){
        if (JOptionPane.showConfirmDialog(rootPane,"¿Seguro que quiere salir?") == JOptionPane.YES_OPTION) {
            TantFantGUI.this.dispose();
            System.exit(0);
        }else {
            setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }
    public void refresh(){
    }
}
