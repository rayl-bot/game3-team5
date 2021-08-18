
package Grupo5.MasterMind.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerMMW implements ActionListener {
	protected MasterMindWindow window;
	protected Events event;
	private PictureBox[] bolas1 = new PictureBox[4];
	private PictureBox[] bolaresul1 = new PictureBox[4];
	private int lvl;

	public ControllerMMW() {

		// llamada a la funcion que mostrara la pantalla y inicializara los eventos
		this.lvl=0;
		this.window = new MasterMindWindow();
		this.event = new Events();
		for (int i = 0; i < event.bolas.length; i++) {
			event.bolas[i].addActionListener(this);
		}
		llenarBolacolores(event.bolacolores);
		llenarBolasolucion(event.bolasolucion);
		llenarBolas(event.bolas);
		this.window.acercaDe.addActionListener(this);
		this.window.salir.addActionListener(this);
		this.window.nuevoJuego.addActionListener(this);
		this.window.comoJugar.addActionListener(this);
		this.window.comprobar.addActionListener(this);
		this.window.opciones.setVisible(false);

	}

	public ControllerMMW(int lvl) {

		// llamada a la funcion que mostrara la pantalla y inicializara los eventos
		this.lvl=lvl;
		this.window = new MasterMindWindow();
		this.event = new Events(lvl);
		for (int i = 0; i < event.bolas.length; i++) {
			event.bolas[i].addActionListener(this);
		}
		llenarBolacolores(event.bolacolores);
		llenarBolasolucion(event.bolasolucion);
		llenarBolas(event.bolas);
		this.window.acercaDe.addActionListener(this);
		this.window.salir.addActionListener(this);
		this.window.nuevoJuego.addActionListener(this);
		this.window.comoJugar.addActionListener(this);
		this.window.comprobar.addActionListener(this);
		this.window.opciones.addActionListener(this);

	}

	public void llenarBolacolores(PictureBox[] p) {
		for (int j = 0; j < this.event.bolacolores.length; j++) {
			window.pDisponibles.add(p[j]);
		}
	}

	public void llenarBolasolucion(PictureBox[]p) {
		for (int j = 0; j < this.event.bolasolucion.length; j++) {
			window.pSecreta.add(p[j]);
		}
	}

	public void llenarBolas(PictureBox[] p) {
		for (int j = 0; j < this.event.bolas.length; j++) {
			window.pSelect.add(p[j]);
		}
	}

	public void llenarSolucion(PictureBox[] p) {
		for (int j = 0; j < p.length; j++) {
			window.pResultado.add(p[j]);
		}
	}

	private int i = 0;

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		if (e.getSource() == window.acercaDe)
			event.acercaDe();
		if (e.getSource() == window.comoJugar)
			event.comoJugar();
		if (e.getSource() == window.nuevoJuego) {
			ControllerSLW cSLW = new ControllerSLW();
			window.frame.dispose();
		}
		if (e.getSource() == window.opciones) {
			ControllerOpciones opcion = new ControllerOpciones(lvl,this);
			
		}
		if (e.getSource() == window.salir) {
			System.exit(0);
		}
		if (event.numeroIntentos == 0) {
			if (e.getSource() == event.bolas[0]) {

				event.cambiarColor(i, 0, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
			if (e.getSource() == event.bolas[1]) {

				event.cambiarColor(i, 1, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}

			}
			if (e.getSource() == event.bolas[2]) {
				event.cambiarColor(i, 2, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
			if (e.getSource() == event.bolas[3]) {
				event.cambiarColor(i, 3, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
		} else {
			if (e.getSource() == bolas1[0]) {

				event.cambiarColor(i, 0, bolas1,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
			if (e.getSource() == bolas1[1]) {

				event.cambiarColor(i, 1, bolas1,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}

			}
			if (e.getSource() == bolas1[2]) {
				event.cambiarColor(i, 2, bolas1,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
			if (e.getSource() == bolas1[3]) {
				event.cambiarColor(i, 3, bolas1,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
		}
		if (e.getSource() == window.comprobar) {
			if (event.numeroIntentos == 0) {
				window.pSelect.revalidate();
				event.comprobarAciertos(event.bolas, event.bolaresul);
				llenarSolucion(event.bolaresul);
			} else {
				window.pSelect.revalidate();
				event.comprobarAciertos(bolas1, bolaresul1);
				llenarSolucion(bolaresul1);
			}

			for (int i = 0; i < bolas1.length; i++) {
				bolas1[i] = new PictureBox();
				bolaresul1[i] = new PictureBox();
				bolas1[i].setColor(event.bolas[i].getForeground());
				bolaresul1[i].setColor(event.bolaresul[i].getForeground());
			}
			llenarBolas(bolas1);
			for (int i = 0; i < bolas1.length; i++) {
				bolas1[i].addActionListener(this);
				bolaresul1[i].addActionListener(this);
			}
			for (int i = 0; i < event.bolas.length; i++) {
				bolas1[i].setBounds(bolas1[i].getBounds().x, bolas1[i].getBounds().y + 30, 30, 30);
				bolaresul1[i].setBounds(bolaresul1[i].getBounds().x, bolaresul1[i].getBounds().y, 30, 30);
			}

		}

	}
}
