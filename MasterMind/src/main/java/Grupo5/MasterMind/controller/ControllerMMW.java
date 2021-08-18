package Grupo5.MasterMind.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.window.MasterMindWindow;

public class ControllerMMW implements ActionListener{
	MasterMindWindow window;
	Events event;
	
	public ControllerMMW() {
		//llamada a la funcion que mostrara la pantalla y inicializara los eventos
		window = new MasterMindWindow();
		event = new Events();
		window.acercaDe.addActionListener(this);
		window.comoJugar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() ==  window.acercaDe)
			event.acercaDe();
		if (e.getSource() == window.comoJugar)
			event.comoJugar();
	}
	
}
