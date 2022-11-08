import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

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
        setSize(pantalla.width/4,pantalla.height/4);
        setLocationRelativeTo(null);
        prepareElementsMenu();
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
        File game = new File("");
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
}
