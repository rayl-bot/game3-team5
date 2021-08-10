package Grupo5.MasterMind.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.window.*;

public class ControllerMMW implements ActionListener{
	private MasterMindWindow window;
	private Events event;
	
	
	public ControllerMMW() {
		
		//llamada a la funcion que mostrara la pantalla y inicializara los eventos
		this.window = new MasterMindWindow();
		this.event = new Events();
		this.event.nivel(0);
		this.window.acercaDe.addActionListener(this);
		this.window.salir.addActionListener(this);
		this.window.nuevoJuego.addActionListener(this);
		this.window.comoJugar.addActionListener(this);
	}
	public ControllerMMW(int lvl) {
		
		//llamada a la funcion que mostrara la pantalla y inicializara los eventos
		this.window = new MasterMindWindow();
		this.event = new Events();
		this.event.nivel(lvl);
		this.window.acercaDe.addActionListener(this);
		this.window.salir.addActionListener(this);
		this.window.nuevoJuego.addActionListener(this);
		this.window.comoJugar.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() ==  window.acercaDe)
			event.acercaDe();
		if (e.getSource() == window.comoJugar)
			event.comoJugar();
		if (e.getSource() == window.nuevoJuego) {
			ControllerSLW cSLW = new ControllerSLW();
			//quitar ventana
		}
		if(e.getSource() == window.salir) {
			System.exit(0);
		}
	}	
}
