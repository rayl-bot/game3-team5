package Grupo5.MasterMind.window;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MasterMindWindow {

	public JFrame frame;
	public JMenuBar menuBar;
	public JMenu archivo;
	public JMenu ayuda;
	public JMenuItem comoJugar;
	public JMenuItem acercaDe;

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
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setTitle("Master Mind");
		frame.setBounds(100, 100, 640, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		/***
		 * labels de la pantalla principal del juego
		 */
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Colores disponibles");
		lblNewLabel.setBounds(360, 41, 199, 13);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Combinacion secreta");
		lblNewLabel_1.setBounds(360, 129, 199, 13);
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
		comoJugar = new JMenuItem("Como jugar");
		acercaDe = new JMenuItem("Acerca de");
		menuBar.add(archivo);
		menuBar.add(ayuda);
		ayuda.add(comoJugar);
		ayuda.add(acercaDe);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(350, 59, 266, 60);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(350, 152, 266, 60);
		frame.getContentPane().add(panel_1);
		//acercaDe.addActionListener(new Accion());
		//comoJugar.addActionListener(new Accion());

	}
}
