package Grupo5.MasterMind.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class SelectLevelWindow {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public SelectLevelWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/***
		 * creacion de ventana de nivel
		 */
		frame = new JFrame();
		frame.setBounds(100, 100, 372, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Seleccionar nivel");
		
		/***
		 * botones para aceptar o cancelar
		 */
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(53, 290, 94, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelar.setBounds(199, 288, 94, 28);
		frame.getContentPane().add(btnCancelar);
		frame.setVisible(true);
		
	}
}
