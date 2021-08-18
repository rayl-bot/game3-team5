package Grupo5.MasterMind.window;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class SelectLevelWindow extends JFrame{

	public JRadioButton principiante, medio, avanzado;
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
		this.setTitle("SELECCIONAR NIVEL");
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
		
		principiante = new JRadioButton("Principiante");
	    medio = new JRadioButton("Medio");
	    avanzado = new JRadioButton("Avanzado");

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
