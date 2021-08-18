<<<<<<< Updated upstream
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
=======
package Grupo5.MasterMind.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerCD implements ActionListener{

	protected ColorDialog window; //ventana tipo colordialog
	private ControllerMMW cMMW; //controlador de la vista principal 
	private ControllerOpciones cO; //controlador de opciones
	private int pos; //posicion de la lista de bolasolucion que queremos cambiar
	private PictureBox c = new PictureBox(); //picturebox auxiliar
	public ControllerCD(ControllerOpciones co, int pos) { //contructor con el controlador de la vista principal y la posicion de la lista bolacolores que queremos cambiar
		this.cO = co;
		this.window = new ColorDialog();
		this.window.cancelar.addActionListener(this);
		this.window.aceptar.addActionListener(this);
		this.c.addActionListener(cO);
		this.cMMW = co.cMMW;
		this.pos = pos;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.cancelar) { //si clicamos cancelar no añadimos ningun color a la lista
			this.window.dispose();
			cO.window.panel.removeAll();
			cO.llenarBolas();
			cO.window.panel.revalidate();
		}
		if (e.getSource() == window.aceptar) { //si clicamos aceptar 
			 boolean encontrado = false;
			if (!window.tcc.getColor().equals(Color.black)) {
				for (int i = 0; i < cO.bolacolores2.length; i++) { //comprobamos si el color ya esta en la lista
                    if (cO.bolacolores2[i].getBackground().equals(window.tcc.getColor())
                            && !window.tcc.getColor().equals(Color.white)) {
                        encontrado = true;
                    }
				}if (encontrado) {//si el color se encuentra en la lista informamos al usuario de que no puede escoger ese colory lo dejamos como estaba
                    JOptionPane.showMessageDialog(null, "El color ya esta elegido", "Error", JOptionPane.ERROR_MESSAGE);
                    c.setBackground(cMMW.event.getBolacolores()[pos].getBackground());
                    cO.window.panel.removeAll();
    				cO.llenarBolas();
    				cO.window.panel.revalidate();
                } else { //si el color no se encuentra lo modificamos
                    c.setBackground(window.tcc.getColor());
                    cO.window.panel.removeAll();
    				cO.llenarBolas();
    				cO.window.panel.revalidate();
                }
				window.dispose(); //cerramos la ventana
			}else {
				c.setBackground(Color.blue);
				window.dispose();
			}
		}
	}
	//getters y setters
	public PictureBox getC() {
		return c;
	}

	public void setC(PictureBox c) {
		this.c = c;
	}
}
>>>>>>> Stashed changes
