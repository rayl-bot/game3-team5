package Grupo5.MasterMind.window;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Button;

public class ViewOptionsGame extends JFrame {

	public Button aceptar, cancelar;
	private Panel panel_1;
	
	/**
	 * Create the application.
	 */
	public ViewOptionsGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setTitle("OPCIONES DE JUEGO");
		this.setBounds(100, 100, 452, 302);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		aceptar = new Button("Aceptar");
		panel.add(aceptar);
		
		cancelar = new Button("Cancelar");
		panel.add(cancelar);
		
		panel_1 = new Panel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
	}
}
