package Grupo5.MasterMind.window;

import java.awt.*;

import javax.swing.*;

import Grupo5.MasterMind.events.Events;

public class MasterMindWindow {

	public JFrame frame;
	public JMenuBar menuBar;
	public JMenu archivo;
	public JMenu ayuda;
	public JMenuItem comoJugar, nuevoJuego, salir;
	public JMenuItem acercaDe;
	public JPanel pDisponibles,pSecreta,pSelect;

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
		nuevoJuego = new JMenuItem("New Game");
		salir = new JMenuItem("Exit");
		menuBar.add(archivo);
		menuBar.add(ayuda);
		ayuda.add(comoJugar);
		ayuda.add(acercaDe);
		archivo.add(nuevoJuego);
		archivo.add(salir);
		
		pDisponibles = new JPanel();
		pDisponibles.setBackground(Color.WHITE);
		pDisponibles.setBounds(350, 59, 266, 60);
		frame.getContentPane().add(pDisponibles);
		
		pSecreta = new JPanel();
		pSecreta.setBackground(Color.WHITE);
		pSecreta.setBounds(350, 152, 266, 60);
		frame.getContentPane().add(pSecreta);
		
		pSelect = new JPanel();
		pSelect.setBackground(Color.WHITE);
		pSelect.setBounds(23, 105, 266, 156);
		
		
		JLabel lblNewLabel_2 = new JLabel("Seleccion de colores");
		lblNewLabel_2.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(54, 82, 199, 13);
		frame.getContentPane().add(lblNewLabel_2);
		//acercaDe.addActionListener(new Accion());
		//comoJugar.addActionListener(new Accion());
		
		/*PictureBox[] pb = event.crear_linea_bola();
		//array que recorre los picturebox y los muestra por pantalla
		for (int i = 0; i < pb.length; i++) {
			panel2.add(pb[i]);
		}*/
		
		frame.getContentPane().add(pSelect);

	}
}
