package Grupo5.MasterMind.window;

import java.awt.*;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class MasterMindWindow {

	public JFrame frame;
	private JTable table_1;
	private JTable table_2;

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
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setTitle("Master Mind");
		frame.setBounds(100, 100, 640, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		/***
		 * labels de la pantalla principal del juego
		 */
		JLabel lblNewLabel = new JLabel("Colores disponibles");
		lblNewLabel.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 13));
		lblNewLabel.setBounds(360, 36, 126, 13);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Combinacion secreta");
		lblNewLabel_1.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(360, 129, 126, 13);
		frame.getContentPane().add(lblNewLabel_1);

		/***
		 * tablas que muestran los diferentes colores y la tabla que muestra la
		 * combinacion que se tiene que adivinar
		 */
		table_1 = new JTable();
		table_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		table_1.setBackground(Color.WHITE);
		table_1.setBounds(350, 152, 266, 60);
		frame.getContentPane().add(table_1);

		table_2 = new JTable();
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		table_2.setBackground(Color.WHITE);
		table_2.setBounds(350, 59, 266, 60);
		frame.getContentPane().add(table_2);

		/***
		 * Barra de menu con los items incorporados
		 */
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 266, 22);
		frame.getContentPane().add(menuBar);

		JMenuItem mntmNewMenuItem = new JMenuItem("Archivo");
		menuBar.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Help");
		menuBar.add(mntmNewMenuItem_1);
	}
}
