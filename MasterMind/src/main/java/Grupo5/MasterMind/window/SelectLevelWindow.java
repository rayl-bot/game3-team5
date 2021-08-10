package Grupo5.MasterMind.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

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
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class SelectLevelWindow extends JFrame{

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
		this.setBounds(100, 100, 372, 456);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setTitle("Seleccionar nivel");
		
		/***
		 * botones para aceptar o cancelar
		 */
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(53, 290, 94, 25);
		this.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelar.setBounds(199, 288, 94, 28);
		this.getContentPane().add(btnCancelar);
		
		JRadioButton principiante = new JRadioButton("Principiante");

	    JRadioButton medio = new JRadioButton("Medio");

	    JRadioButton avanzado = new JRadioButton("Avanzado");

	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(principiante);
	    group.add(medio);
	    group.add(avanzado);
		
	    JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(88, 38, 186, 228);
		panel.add(principiante);
		panel.add(medio);
		panel.add(avanzado);
		this.getContentPane().add(panel);
		this.setVisible(true);
		
	}
}
