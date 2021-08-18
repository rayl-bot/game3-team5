<<<<<<< Updated upstream
package Grupo5.MasterMind.window;
import javax.swing.*;
import java.awt.*;

public class OptionWindow extends JFrame {

    public Button aceptar, cancelar;
    public Panel panel;

    public OptionWindow() {
        initialize();
    }

    private void initialize() {
        this.setBounds(100, 100, 450, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        getContentPane().setLayout(null);

        panel = new Panel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(30, 31, 371, 161);
        getContentPane().add(panel);

        aceptar = new Button("Aceptar");
        aceptar.setBounds(83, 212, 66, 21);
        getContentPane().add(aceptar);

        cancelar = new Button("Cancelar");
        cancelar.setBounds(273, 212, 66, 21);
        getContentPane().add(cancelar);



    }
=======
package Grupo5.MasterMind.window;
import javax.swing.*;
import java.awt.*;

public class OptionWindow extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Button aceptar, cancelar;
    public Panel panel;

    public OptionWindow() {
        initialize();
    }

    private void initialize() {
        this.setBounds(100, 100, 450, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        getContentPane().setLayout(null);

        panel = new Panel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(30, 31, 371, 161);
        getContentPane().add(panel);

        aceptar = new Button("Aceptar");
        aceptar.setBounds(83, 212, 66, 21);
        getContentPane().add(aceptar);

        cancelar = new Button("Cancelar");
        cancelar.setBounds(273, 212, 66, 21);
        getContentPane().add(cancelar);



    }
>>>>>>> Stashed changes
}