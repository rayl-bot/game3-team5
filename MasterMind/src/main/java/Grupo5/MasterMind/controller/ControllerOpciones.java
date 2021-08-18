package Grupo5.MasterMind.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerOpciones implements ActionListener {

	protected OptionWindow window;
	private ControllerCD cd;
	private ControllerMMW cMMW;
	private Events event;
	private int lvl;
	protected PictureBox[] bolacolores2, bolasolucion2;

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
	public void llenarBolas()
	{
		for (int j = 0; j < this.event.bolacolores.length; j++) {
			window.panel.add(bolacolores2[j]);
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
			cMMW.window.pDisponibles.revalidate();
			cMMW.window.pSecreta.revalidate();
		}
		if (e.getSource() == bolacolores2[0]) {
			cd = new ControllerCD(this);
			bolacolores2[0] = cd.getC();
		}
		if (e.getSource() == bolacolores2[1]) {
			cd = new ControllerCD(this);
			bolacolores2[1] = cd.getC();
		}
		if (e.getSource() == bolacolores2[2]) {
			cd = new ControllerCD(this);
			bolacolores2[2] = cd.getC();
		}
		if (e.getSource() == bolacolores2[3]) {
			cd = new ControllerCD(this);
			bolacolores2[3] = cd.getC();
		}
		if (e.getSource() == bolacolores2[4]) {
			cd = new ControllerCD(this);
			bolacolores2[4] = cd.getC();
		}
		if (e.getSource() == bolacolores2[5]) {
			cd = new ControllerCD(this);
			bolacolores2[5] = cd.getC();
		}
	}
}
