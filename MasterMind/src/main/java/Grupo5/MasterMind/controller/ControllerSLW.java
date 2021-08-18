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
