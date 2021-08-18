
package Grupo5.MasterMind.window;

import java.awt.*;

import javax.swing.*;

import Grupo5.MasterMind.controller.ControllerMMW;
import Grupo5.MasterMind.events.Events;
import net.miginfocom.swing.MigLayout;

public class MasterMindWindow extends JFrame{
    
    private static final long serialVersionUID = 1L;
    public JFrame frame;
    public JMenuBar menuBar;
    public JMenu archivo;
    public JMenu ayuda, more;
    public JMenuItem comoJugar, nuevoJuego, salir;
    public JMenuItem acercaDe;
    public JPanel pDisponibles,pSecreta, pResultado, pSelect;
    public Button comprobar;
    public JLabel lblNewLabel_1;
    public JLabel lblNewLabel;
    public JLabel lblNewLabel_2;
    public JMenuItem opciones;
    /**
     * Create the application.
     */
    public MasterMindWindow() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        /***
         * creacion de la ventana principal
         */
        frame = new JFrame();
        frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
        frame.setTitle("Master Mind");
        frame.setBounds(100, 100, 913, 561);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

        /***
         * labels de la pantalla principal del juego
         */
        frame.getContentPane().setLayout(null);
        lblNewLabel = new JLabel("Colores disponibles");
        lblNewLabel.setBounds(690, 36, 199, 13);
        lblNewLabel.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
        frame.getContentPane().add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("Combinacion secreta");
        lblNewLabel_1.setBounds(690, 129, 199, 13);
        lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
        frame.getContentPane().add(lblNewLabel_1);

        /***
         * Barra de menu con los items incorporados
         */
        menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 266, 22);
        frame.getContentPane().add(menuBar);
        archivo = new JMenu("Archivo");
        ayuda = new JMenu("Help");
        more = new JMenu("More");
        comoJugar = new JMenuItem("Como jugar");
        acercaDe = new JMenuItem("Acerca de");
        nuevoJuego = new JMenuItem("New Game");
        opciones = new JMenuItem("Opciones");
        salir = new JMenuItem("Exit");
        menuBar.add(archivo);
        menuBar.add(ayuda);
        menuBar.add(more);
        ayuda.add(comoJugar);
        ayuda.add(acercaDe);
        archivo.add(nuevoJuego);
        archivo.add(salir);
        more.add(opciones);
        
        pDisponibles = new JPanel();
        pDisponibles.setBackground(Color.WHITE);
        pDisponibles.setBounds(623, 59, 266, 60);
        frame.getContentPane().add(pDisponibles);
        
        pSecreta = new JPanel();
        pSecreta.setBackground(Color.WHITE);
        pSecreta.setBounds(623, 152, 266, 60);
        frame.getContentPane().add(pSecreta);
        
        
        lblNewLabel_2 = new JLabel("Tablero de Juego");
        lblNewLabel_2.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(218, 83, 150, 13);
        frame.getContentPane().add(lblNewLabel_2);
        
        pResultado = new JPanel();
        pResultado.setBackground(Color.yellow);
        pResultado.setBounds(263, 106, 171, 362);
        frame.getContentPane().add(pResultado);
        pResultado.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        pSelect = new JPanel();
        pSelect.setBackground(Color.white);
        pSelect.setBounds(57, 106, 171, 362);
        frame.getContentPane().add(pSelect);
        pSelect.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        comprobar = new Button("Compr");
        frame.getContentPane().add(comprobar);
        comprobar.setBounds(110, 474, 44, 21);
        
    }
}
