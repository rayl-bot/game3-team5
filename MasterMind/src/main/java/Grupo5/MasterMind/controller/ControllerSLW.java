<<<<<<< Updated upstream
package Grupo5.MasterMind.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Grupo5.MasterMind.window.*;
public class ControllerSLW implements ActionListener{
	
	private SelectLevelWindow window;
	private ControllerMMW cMMW;
	private ControllerOpciones ccd;
	public ControllerSLW()
	{
		this.window = new SelectLevelWindow();
		this.window.btnNewButton.addActionListener(this);
		this.window.btnCancelar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.btnNewButton) {
			if(window.principiante.isSelected()) {
				cMMW = new ControllerMMW(0);
				window.dispose();
			}
			else if (window.medio.isSelected()) {
				cMMW = new ControllerMMW(1); 
				window.dispose();
			}
			else if (window.avanzado.isSelected()) {
				cMMW = new ControllerMMW(2);
				window.dispose();
			}
		}else if(e.getSource() == window.btnCancelar)
		{
			cMMW = new ControllerMMW(0);
			window.dispose();
		}
	}
}
=======
package Grupo5.MasterMind.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Grupo5.MasterMind.window.*;
public class ControllerSLW implements ActionListener{
	
	private SelectLevelWindow window;
	@SuppressWarnings("unused")
	private ControllerMMW cMMW; //controlador cMMW
	public ControllerSLW() //contrusctor por defecto
	{
		this.window = new SelectLevelWindow();
		this.window.btnNewButton.addActionListener(this);
		this.window.btnCancelar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) { 
		if (e.getSource() == window.btnNewButton) { //si clicamos el boton nuevo juego
			if(window.principiante.isSelected()) { //si seleccionamos el nivel principiante
				cMMW = new ControllerMMW(0); //creamos un nuevo juego con este nivel
				window.dispose();
			}
			else if (window.medio.isSelected()) { //si seleccionamos nivel medio
				cMMW = new ControllerMMW(1); 
				window.dispose();
			}
			else if (window.avanzado.isSelected()) { //si seleccionamos nivel avanzado
				cMMW = new ControllerMMW(2);
				window.dispose();
			}
		}else if(e.getSource() == window.btnCancelar) //si cancelamos la seleccion de nivel haremos una nueva partida en nivel principiante
		{
			cMMW = new ControllerMMW(0);
			window.dispose();
		}
	}
}
>>>>>>> Stashed changes
