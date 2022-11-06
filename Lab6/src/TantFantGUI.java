import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TantFantGUI extends JFrame {
    private TantFantGUI() {
        prepareElements();
        prepareActions();
    }
    public static void main( String[] args ) {
        TantFantGUI tant = new TantFantGUI();
        tant.setVisible(true);
    }
    public void prepareElements(){
        setTitle("Tant Fant");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width/4,screenSize.height/4);
        setLocationRelativeTo(null);

    }
    public void prepareActions(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Este Segmento de codigo sirve para las acciones de pantalla de windows
        WindowListener w = new WindowListener(){
            public void windowOpened(WindowEvent e) {
            }
            public void windowClosing(WindowEvent e) {

            }
            public void windowClosed(WindowEvent e) {
            }
            public void windowIconified(WindowEvent e) {
            }
            public void windowDeiconified(WindowEvent e) {
            }
            public void windowActivated(WindowEvent e) {
            }
            public void windowDeactivated(WindowEvent e) {
            }
        };
        this.addWindowListener(w);
        this.setVisible(true);
        //
    }
}