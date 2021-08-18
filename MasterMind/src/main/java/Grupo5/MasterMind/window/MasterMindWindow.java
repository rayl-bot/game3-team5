package Grupo5.MasterMind.window;

import java.awt.*;

import javax.swing.*;

public class MasterMindWindow {

	public JFrame frame;
	public JMenuBar menuBar;
	public JMenu ayuda, opciones, archivo;
	public JMenuItem comoJugar, nuevoJuego, salir;
	public JMenuItem acercaDe;
	public JPanel pDisponibles,pSecreta, pResultado, pSelect;
	public Button comprobar;

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
		JLabel lblNewLabel = new JLabel("Colores disponibles");
		lblNewLabel.setBounds(690, 36, 199, 13);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Combinacion secreta");
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
		opciones = new JMenu("Opciones");
		comoJugar = new JMenuItem("Como jugar");
		acercaDe = new JMenuItem("Acerca de");
		nuevoJuego = new JMenuItem("New Game");
		salir = new JMenuItem("Exit");
		menuBar.add(archivo);
		menuBar.add(opciones);
		menuBar.add(ayuda);
		ayuda.add(comoJugar);
		ayuda.add(acercaDe);
		archivo.add(nuevoJuego);
		archivo.add(salir);
		
		pDisponibles = new JPanel();
		pDisponibles.setBackground(Color.WHITE);
		pDisponibles.setBounds(623, 59, 266, 60);
		frame.getContentPane().add(pDisponibles);
		
		pSecreta = new JPanel();
		pSecreta.setBackground(Color.WHITE);
		pSecreta.setBounds(623, 152, 266, 60);
		frame.getContentPane().add(pSecreta);
		
		
		JLabel lblNewLabel_2 = new JLabel("Tablero de Juego");
		lblNewLabel_2.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(218, 83, 150, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		pResultado = new JPanel();
		pResultado.setBackground(Color.WHITE);
		pResultado.setBounds(309, 106, 266, 285);
		frame.getContentPane().add(pResultado);
		pResultado.setLayout(null);
		
		
		pSelect = new JPanel();
		pSelect.setLayout(null);
		pSelect.setBackground(Color.WHITE);
		pSelect.setBounds(42, 106, 266, 285);
		frame.getContentPane().add(pSelect);
		pSelect.setLayout(null);
		
		comprobar = new Button("Compr");
		comprobar.setBounds(190, 10, 66, 21);
		pSelect.add(comprobar);
		
		

	}
}
