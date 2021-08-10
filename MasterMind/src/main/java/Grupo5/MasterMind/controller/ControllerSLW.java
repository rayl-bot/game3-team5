package Grupo5.MasterMind.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.window.*;
public class ControllerSLW implements ActionListener{
	
	private SelectLevelWindow window;
	
	public ControllerSLW()
	{
		this.window = new SelectLevelWindow();
		this.window.btnNewButton.addActionListener(this);
		this.window.btnCancelar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.btnNewButton) {
				ControllerMMW cMMW;
			if(e.getSource() == window.principiante)
				 cMMW = new ControllerMMW();
			else if (e.getSource() == window.medio)
				cMMW = new ControllerMMW(1);
			else if (e.getSource() == window.avanzado)
				cMMW = new ControllerMMW(2);
			//cerrar ventana
		}else if(e.getSource() == window.btnCancelar)
		{
			ControllerMMW cMMW = new ControllerMMW();
			//cerrar ventana
		}
	}
}
