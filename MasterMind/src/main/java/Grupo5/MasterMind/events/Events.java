
package Grupo5.MasterMind.events;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import Grupo5.MasterMind.objects.PictureBox;

public class Events {
	static final int COLORS = 4;// Constante que pone 4 colores
	static Random r = new Random(); // generamos un numero aleatorio
	static Color[] colores = new Color[11];
	public PictureBox[] bolasolucion = new PictureBox[4];// solucion correcta de la serie
	public PictureBox[] bolas = new PictureBox[4];// lista de bolas con las que juega el usuario
	public PictureBox[] bolaresul = new PictureBox[4];// lista de opciones que han salido
	public PictureBox[] bolacolores = new PictureBox[4];// lista de bolas de donde sale la solucion
	public int coloresPosibles = 4;
	public int intentos = 10;
	public int numeroIntentos = 0;

	public Events() {
		for (int i = 0; i < bolacolores.length; i++) {
			bolasolucion[i] = new PictureBox();
			bolas[i] = new PictureBox();
			bolaresul[i] = new PictureBox();
			bolacolores[i] = new PictureBox();
		}
		llenarLista();
		crear_colores();
		crear_solucion();
		crear_linea_bola();
	}

	public Events(int lvl) {
		this.bolacolores = new PictureBox[4 + lvl];
		for (int i = 0; i < bolacolores.length; i++) {
			bolacolores[i] = new PictureBox();
		}
		for (int i = 0; i < bolasolucion.length; i++) {
			bolasolucion[i] = new PictureBox();
			bolas[i] = new PictureBox();
			bolaresul[i] = new PictureBox();
		}
		llenarLista();
		crear_colores();
		crear_solucion();
		crear_linea_bola();
	}

	public Events(int lvl, Color opciones) {
		this.bolacolores = new PictureBox[4 + lvl];
		for (int i = 0; i < bolacolores.length; i++) {
			bolacolores[i] = new PictureBox();
		}
		for (int i = 0; i < bolasolucion.length; i++) {
			bolasolucion[i] = new PictureBox();
			bolas[i] = new PictureBox();
			bolaresul[i] = new PictureBox();
		}
		llenarLista();
		crear_colores();
		crear_solucion();
		crear_linea_bola();
	}

	public void nivel(int num) {
		switch (num) {
		case 0:
			coloresPosibles = 4;
			intentos = 10;
			bolacolores = new PictureBox[coloresPosibles];
			break;
		case 1:
			coloresPosibles = 5;
			intentos = 8;
			bolacolores = new PictureBox[coloresPosibles];
			break;
		case 2:
			coloresPosibles = 6;
			intentos = 6;
			bolacolores = new PictureBox[coloresPosibles];
			break;

		default:
			break;
		}
	}

	public void llenarLista() {
		colores[0] = (Color.yellow);
		colores[1] = (Color.blue);
		colores[2] = (Color.cyan);
		colores[3] = (Color.darkGray);
		colores[4] = (Color.gray);
		colores[5] = (Color.green);
		colores[6] = (Color.lightGray);
		colores[7] = (Color.magenta);
		colores[8] = (Color.orange);
		colores[9] = (Color.pink);
		colores[10] = (Color.red);
	}

	public void llenarLista2(Color col,int i) {

		bolacolores[i].setBackground(col);

	}

	public void comoJugar() {
		JOptionPane.showMessageDialog(null, "Se juega jugando");
	}

	public void acercaDe() {
		JOptionPane.showMessageDialog(null, "Alvaro Raul Evelyn");
	}

	public void perder() {
		JOptionPane.showMessageDialog(null, "Lo siento has superado los intentos");
		System.exit(0);
	}

	public void comprobarAciertos(PictureBox[] p, PictureBox[] bolasresul) {

		for (int i = 0; i < bolasresul.length; i++) {
			bolasresul[i].setBackground(Color.yellow);
		}
		boolean negras[] = new boolean[4];
		int neg = 0;
		int blan = 0;
		boolean blancas[] = new boolean[4];
		PictureBox[] copia = new PictureBox[4];
		for (int i = 0; i < copia.length; i++) {
			copia[i] = new PictureBox();
			copia[i].setBackground(bolasolucion[i].getBackground());
		}
		for (int i = 0; i < p.length; i++) {
			if (p[i].getBackground().equals(copia[i].getBackground())) { // comprobamos si es negrai
				negras[i] = true; // en esa posicion tenemos una negra
				copia[i].setBackground(Color.black);
				neg++;
				if (neg == 4)
					ganar();
				if (blancas[i]) {
					blancas[i] = false;
					blan--;
				}
			} else {
				int j = 0;
				boolean en = false;
				while (j < bolasolucion.length && !en) {
					if (p[i].getBackground().equals(copia[j].getBackground())) { // comprobamos si aparece en otro lugar
																					// del array
						if (!negras[j] && !blancas[j]) {
							blancas[j] = true;
							blan++;
							copia[j].setBackground(Color.black);
							en = true;
						}
					}
					j++;
				}
			}
		}
		for (int i = 0; i < bolasresul.length; i++) {
			if (neg != 0) {
				bolasresul[i].setBackground(Color.black);
				neg--;
			} else if (blan != 0) {
				bolasresul[i].setBackground(Color.white);
				blan--;
			}
		}
		numeroIntentos++;
		if (numeroIntentos >= intentos)
			perder();
	}

	// funcionn que crea los colores pasandoles por parametros dos listas de
	// colores, los disponibles y la lista nueva
	public void crear_colores() {
		int[] coloresNum = new int[bolacolores.length]; // controlador para comparar los random con los enteros
		int valor = 0;
		for (int i = 0; i < bolacolores.length; i++) {
			if (i != 0) // si no estamos en la primera iteracion
			{
				boolean cor = false;
				while (!cor) {
					boolean tr = false;
					valor = r.nextInt(colores.length);
					int j = 0;
					while (j < i && !tr) { // comprovamos si ese numero ha salido ya {
						if (coloresNum[j] == valor) {
							tr = true;
						} else {
							j++;
						}
					}
					if (!tr) { // si no coincide con ninguna iteracion anterior dejamos de generar numeros
						cor = true;
					}
				}
			} else {
				valor = r.nextInt(colores.length);
			}
			coloresNum[i] = valor;
			bolacolores[i].setColor(colores[coloresNum[i]]);
		}
	}


	public void crear_solucion() {
		int valor = 0;
		for (int i = 0; i < bolasolucion.length; i++) {
			valor = r.nextInt(bolacolores.length);
			bolasolucion[i].setColor(bolacolores[valor].getBackground());
		}
	}
	public void crear_solucion2(PictureBox[]bolacolo,PictureBox[] bolasolu) {
		int valor = 0;
		for (int i = 0; i < bolasolu.length; i++) {
			valor = r.nextInt(bolacolo.length);
			bolasolu[i].setColor(bolacolo[valor].getBackground());
		}
	}
	public void ganar() {
		JOptionPane.showMessageDialog(null, "Has ganado!!!");
		System.exit(0);
	}

	public void crear_linea_bola() {
		// recorre el numero de numeros que se desea crear y se introducen picturesbox
		// de color Blanco (de momento)
		for (int i = 0; i < bolas.length; i++) {
			bolas[i].setColor(Color.black);
		}
	}

	public void cambiarColor(int i, int numeroBola, PictureBox[] p,PictureBox[]bolacolo) {

		p[numeroBola].setColor(bolacolo[i].getBackground());

	}
	public void cambiarColor2(int i, int numeroBola, PictureBox[] p) {

		bolacolores[numeroBola].setColor(p[i].getBackground());

	}
	public PictureBox[] getBolasolucion() {
		return bolasolucion;
	}

	public void setBolasolucion(PictureBox[] bolasolucion) {
		this.bolasolucion = bolasolucion;
	}

	public PictureBox[] getBolas() {
		return bolas;
	}

	public void setBolas(PictureBox[] bolas) {
		this.bolas = bolas;
	}

	public PictureBox[] getBolaresul() {
		return bolaresul;
	}

	public void setBolaresul(PictureBox[] bolaresul) {
		this.bolaresul = bolaresul;
	}

	public PictureBox[] getBolacolores() {
		return bolacolores;
	}

	public void setBolacolores(PictureBox[] bolacolores) {
		this.bolacolores = bolacolores;
	}

	public int getColoresPosibles() {
		return coloresPosibles;
	}

	public void setColoresPosibles(int coloresPosibles) {
		this.coloresPosibles = coloresPosibles;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public int getNumeroIntentos() {
		return numeroIntentos;
	}

	public void setNumeroIntentos(int numeroIntentos) {
		this.numeroIntentos = numeroIntentos;
	}

}
