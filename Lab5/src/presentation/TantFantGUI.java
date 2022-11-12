package presentation;
import domain.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * @ Nicolas Castro - Marco Alvarez
 * Este Codigo Interpreta la parte visual de Tant Fant
 */
public class TantFantGUI extends JFrame {
    public JMenu menu,config;
    public JMenuItem nuevo,abrir,guardar,salir,tamaño,color;

    public JFileChooser fileChooser;
    Color colo;

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
        prepareElementsBoard();
        prepareElementsChooser();


    }
    /**
     *
     */
    private void prepareElementsMenu(){
        JMenuBar menuBar = new JMenuBar();
        menu = new JMenu("Menú");
        config = new JMenu("Configuración");
        menuBar.add(menu);
        menuBar.add(config);
        nuevo = new JMenuItem("Nuevo");
        abrir = new JMenuItem("Abrir");
        guardar = new JMenuItem("Guardar");
        salir = new JMenuItem("Salir");
        color = new JMenuItem("Cambiar Color");
        tamaño = new JMenuItem("Cambiar Tamaño");
        menu.add(nuevo);
        menu.add(abrir);
        menu.add(guardar);
        menu.add(salir);
        config.add(color);
        config.add(tamaño);
        setJMenuBar(menuBar);
    }
    /**
     *
     */
    private void prepareElementsBoard(){
        JPanel tant = new TantFant();
        this.getContentPane().add(tant);
    }
    private void prepareElementsChooser(){
        fileChooser = new JFileChooser();
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
        color.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Color();
                    }
                }
        );

        tamaño.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Tamaño();
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
        int action = fileChooser.showSaveDialog(abrir);
        if (action == JFileChooser.APPROVE_OPTION){
            File archivo = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null,"Archivo cargado "+ archivo.getName()+"\nFuncionalidad ABRIR se encuentra en construcion");
        }
    }
    /**
     *
     */
    public void Guardar() {
        int action = fileChooser.showSaveDialog(guardar);
        if (action == JFileChooser.APPROVE_OPTION){
            File archivo = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null,"Archivo guardado "+ archivo.getName()+"\nFuncionalidad GUARDAR se encuentra en construcion");
         }
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
    public void Color(){
        JColorChooser selector = new JColorChooser();
        colo = selector.showDialog(null,"Selecciona el color del fondo",Color.GRAY);

    }
    public void Tamaño(){
    }
    public void refresh(){
    }
}
