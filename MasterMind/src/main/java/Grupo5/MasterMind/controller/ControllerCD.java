package Grupo5.MasterMind.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerCD implements ActionListener{

	protected ColorDialog window;
	private ControllerMMW cMMW;
	private Events event;
	private ControllerOpciones cO;
	private int lvl;
	private PictureBox[] colores;
	private PictureBox c = new PictureBox();
	public ControllerCD(ControllerOpciones c) {
		this.cO = c;
		event= new Events();
		this.lvl = 0;
		this.window = new ColorDialog();
		this.window.cancelar.addActionListener(this);
		this.window.aceptar.addActionListener(this);
		this.c.addActionListener(cO);
	}
	
	
	public PictureBox getC() {
		return c;
	}

	public void setC(PictureBox c) {
		this.c = c;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.cancelar) {
			this.window.dispose();
		}
		if (e.getSource() == window.aceptar) {
			 boolean encontrado = false;
			if (!window.tcc.getColor().equals(Color.black)) {
				for (int i = 0; i < cO.bolacolores2.length; i++) {
                    if (cO.bolacolores2[i].getBackground().equals(window.tcc.getColor())
                            && !window.tcc.getColor().equals(Color.white)) {
                        encontrado = true;
                    }
				}if (encontrado) {
                    JOptionPane.showMessageDialog(null, "El color ya esta elegido", "Error", JOptionPane.ERROR_MESSAGE);
                    cO.window.panel.removeAll();
    				cO.llenarBolas();
    				cO.window.panel.revalidate();
                } else {
                    c.setBackground(window.tcc.getColor());
                    cO.window.panel.removeAll();
    				cO.llenarBolas();
    				cO.window.panel.revalidate();
                }
				window.dispose();
			}else {
				c.setBackground(Color.blue);
				window.dispose();
			}
		}
	}
}
