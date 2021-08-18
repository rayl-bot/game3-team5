<<<<<<< Updated upstream
package Grupo5.MasterMind.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerOpciones implements ActionListener {

	private OptionWindow window;
	private ControllerCD cd;
	private ControllerMMW cMMW;
	private Events event;
	private int lvl;
	private PictureBox[] bolacolores2, bolasolucion2;

	public ControllerOpciones() {
		event = new Events();
		this.lvl = 0;
		this.window = new OptionWindow();
		this.window.cancelar.addActionListener(this);
		this.window.aceptar.addActionListener(this);
		this.event = new Events();
		bolacolores2 = new PictureBox[4];
		bolasolucion2 = new PictureBox[4];
		for (int i = 0; i < event.bolacolores.length; i++) {
			bolasolucion2[i]= new PictureBox();
			bolacolores2[i] = new PictureBox();
			bolacolores2[i].addActionListener(this);
			window.panel.add(bolacolores2[i]);
		}

	}

	public ControllerOpciones(int i, ControllerMMW ventana) {
		this.cMMW = ventana;
		cMMW.window.pDisponibles.removeAll();
		cMMW.window.pSecreta.removeAll();
		event = new Events();
		this.lvl = i;
		this.window = new OptionWindow();
		this.window.cancelar.addActionListener(this);
		this.window.aceptar.addActionListener(this);
		this.event = new Events(lvl);
		bolacolores2 = new PictureBox[4 + lvl];
		bolasolucion2 = new PictureBox[4];
		for (int j = 0; j < bolasolucion2.length; j++) {
			bolasolucion2[j] = new PictureBox();
		}
		for (int j = 0; j < event.bolacolores.length; j++) {
			bolacolores2[j] = new PictureBox();
			bolacolores2[j].addActionListener(this);
			window.panel.add(bolacolores2[j]);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.cancelar) {
			this.window.dispose();
		}
		if (e.getSource() == window.aceptar) {
			cMMW.llenarBolacolores(bolacolores2);
			cMMW.event.crear_solucion2(bolacolores2,cMMW.event.bolasolucion);
			cMMW.llenarBolasolucion(cMMW.event.bolasolucion);
			window.dispose();
		}
		if (e.getSource() == bolacolores2[0]) {
			cd = new ControllerCD();
			bolacolores2[0] = cd.getC();

		}
		if (e.getSource() == bolacolores2[1]) {
			cd = new ControllerCD();
			bolacolores2[1] = cd.getC();
		}
		if (e.getSource() == bolacolores2[2]) {
			cd = new ControllerCD();
			bolacolores2[2] = cd.getC();
		}
		if (e.getSource() == bolacolores2[3]) {
			cd = new ControllerCD();
			bolacolores2[3] = cd.getC();
		}
		if (e.getSource() == bolacolores2[4]) {
			cd = new ControllerCD();
			bolacolores2[4] = cd.getC();
		}
		if (e.getSource() == bolacolores2[5]) {
			cd = new ControllerCD();
			bolacolores2[5] = cd.getC();
		}
	}
}
=======
package Grupo5.MasterMind.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerOpciones implements ActionListener {

	protected OptionWindow window; //ventana tipo optionwindow
	private ControllerCD cd; //controlador cd
	protected ControllerMMW cMMW; //controlador cMMW
	private Events event; //event
	private int lvl; //nivel
	protected PictureBox[] bolacolores2, bolasolucion2; //lista con bolacolores y con bolasolucion

	
	public ControllerOpciones(int i, ControllerMMW ventana) { //contructor donde le pasammos un nivel y el controlador mmw
		this.cMMW = ventana;
		cMMW.window.pDisponibles.removeAll();
		cMMW.window.pSecreta.removeAll();
		event = new Events(i);
		this.lvl = i;
		this.window = new OptionWindow();
		this.window.cancelar.addActionListener(this);
		this.window.aceptar.addActionListener(this);
		bolacolores2 = new PictureBox[4 + lvl];
		bolasolucion2 = new PictureBox[4];
		for (int j = 0; j < bolasolucion2.length; j++) {
			bolasolucion2[j] = new PictureBox();
		}
		for (int j = 0; j < ventana.event.getBolacolores().length; j++) {
			bolacolores2[j] = new PictureBox();
			bolacolores2[j].setBackground(ventana.event.getBolacolores()[j].getBackground());
			bolacolores2[j].addActionListener(this);
			window.panel.add(bolacolores2[j]);
		}
	}
	public void llenarBolas() //añadir bolas al panel principal de la ventana
	{
		for (int j = 0; j < this.event.getBolacolores().length; j++) {
			window.panel.add(bolacolores2[j]);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.cancelar) { //si clicamos en cancelar cerramos la ventana sin hacer nada
			this.window.dispose();
		}
		if (e.getSource() == window.aceptar) { //si le damos a aceptar 
			cMMW.llenarBolacolores(bolacolores2); //lenamos bolacolores de cmmw con nuestro bolacolores
			cMMW.event.setBolacolores(bolacolores2);
			cMMW.event.crear_solucion2(bolacolores2,cMMW.event.getBolasolucion()); //creamos una solucion 
			cMMW.llenarBolasolucion(cMMW.event.getBolasolucion()); //llenamos el panel de la solucion con la solucion creada
			
			window.dispose(); //cerramos la ventana
			cMMW.window.pDisponibles.revalidate(); //recargamos los paneles de la ventana principal
			cMMW.window.pSecreta.revalidate();
		}
		if (e.getSource() == bolacolores2[0]) { //si clicamos un picture box de la lista crea un controlador cd y copia el color que seleccionemos en bolacolores 2
			cd = new ControllerCD(this, 0);
			bolacolores2[0] = cd.getC();
		}
		if (e.getSource() == bolacolores2[1]) {
			cd = new ControllerCD(this, 1);
			bolacolores2[1] = cd.getC();
		}
		if (e.getSource() == bolacolores2[2]) {
			cd = new ControllerCD(this, 2);
			bolacolores2[2] = cd.getC();
		}
		if (e.getSource() == bolacolores2[3]) {
			cd = new ControllerCD(this, 3);
			bolacolores2[3] = cd.getC();
		}
		if (e.getSource() == bolacolores2[4]) {
			cd = new ControllerCD(this, 4);
			bolacolores2[4] = cd.getC();
		}
		if (e.getSource() == bolacolores2[5]) {
			cd = new ControllerCD(this, 5);
			bolacolores2[5] = cd.getC();
		}
	}
}
>>>>>>> Stashed changes
