package Grupo5.MasterMind.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerCD implements ActionListener{

	private ColorDialog window;
	private ControllerMMW cMMW;
	private Events event;
	private int lvl;
	private PictureBox[] colores;
	private PictureBox c = new PictureBox();

	public ControllerCD() {
		event= new Events();
		this.lvl = 0;
		this.window = new ColorDialog();
		this.window.cancelar.addActionListener(this);
		this.window.aceptar.addActionListener(this);
		
	}
	
	public PictureBox getC() {
		return c;
	}

	public void setC(PictureBox c) {
		this.c = c;
	}

	public ControllerCD(int i) {
		event= new Events();
		this.window = new ColorDialog();
		this.window.cancelar.addActionListener(this);
		this.window.aceptar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.cancelar) {
			this.window.dispose();
		}
		if (e.getSource() == window.aceptar) {
			if (!window.tcc.getColor().equals(Color.black)) {
				c.setBackground(window.tcc.getColor());
				window.dispose();
			}else {
				c.setBackground(Color.blue);
				window.dispose();
			}
			
		}
	}
}
