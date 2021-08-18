
package Grupo5.MasterMind.events;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import Grupo5.MasterMind.objects.PictureBox;

public class Events {
<<<<<<< Updated upstream
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
=======
	private static Random r = new Random(); // generamos un numero aleatorio
	private static Color[] colores = new Color[11];
	private PictureBox[] bolasolucion; // solucion correcta de la serie
	private PictureBox[] bolas; // lista de bolas con las que juega el usuario
	private PictureBox[] bolaresul; // lista de aciertos
	private PictureBox[] bolacolores;// colores dispobles con los que jugar
	private int coloresPosibles; //numero de coloresPosibles 
	private int intentos; //numero de intentos que tenemos
	private int numeroIntentos; //numero de intentos que llevamos

	
	//constructor por defecto
	public Events() {
		this.coloresPosibles = 4;
		this.bolasolucion = new PictureBox[4];
		this.bolas = new PictureBox[4];
		this.bolaresul = new PictureBox[4];
		this.bolacolores = new PictureBox[coloresPosibles];
		this.intentos = 10;
		this.numeroIntentos = 0;
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
	//constructor segun el nivel seleccionado
	
	public Events(int lvl) {
		this.coloresPosibles = 4 + lvl;
		this.bolasolucion = new PictureBox[4];
		this.bolas = new PictureBox[4];
		this.bolaresul = new PictureBox[4];
		this.bolacolores = new PictureBox[coloresPosibles];
		this.intentos = 10 - 2*lvl;
		this.numeroIntentos = 0;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream

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
=======
	public void llenarLista() { //metodo para rellenr la lista opciones
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
	public void llenarLista2(Color col,int i) { //metodo que mete un color a la lista de bolacolores segun su posicion
		bolacolores[i].setBackground(col);
	}

	public void comoJugar() { //muestra como jugar
		JOptionPane.showMessageDialog(null, "Se juega jugando");
	}

	public void acercaDe() { //muestra los creadores del juego
		JOptionPane.showMessageDialog(null, "Alvaro Raul Evelyn");
	}

	public void perder() { //mensaje por si pierdes
		JOptionPane.showMessageDialog(null, "Lo siento has superado los intentos");
		System.exit(0);
	}
	public void ganar() { //mensaje pos si ganas
		JOptionPane.showMessageDialog(null, "Has ganado!!!");
		System.exit(0);
	}

	public void comprobarAciertos(PictureBox[] p, PictureBox[] bolasresul) { //metodo que comprueba que bolas de la secuencia introducida por el jugador coinciden y como

		for (int i = 0; i < bolasresul.length; i++) { //ponemos todas las bolas amarillas de default
			bolasresul[i].setBackground(Color.yellow);
		}
		boolean negras[] = new boolean[4]; //lista de booleanos pos si en esa posicion hay una negra
		int neg = 0;
		int blan = 0;
		boolean blancas[] = new boolean[4]; //lista de booleanos por si en esa posicion hay una blanca
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
				if (neg == 4)
					ganar();
				if (blancas[i]) {
=======
				if (neg == 4) //si hay 4 nregas hemos ganado
					ganar();
				if (blancas[i]) { //si antes de negra teniamos una blanca la quitamos
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		for (int i = 0; i < bolasresul.length; i++) {
=======
		for (int i = 0; i < bolasresul.length; i++) { //llenamos la lista de bolasresul
>>>>>>> Stashed changes
			if (neg != 0) {
				bolasresul[i].setBackground(Color.black);
				neg--;
			} else if (blan != 0) {
				bolasresul[i].setBackground(Color.white);
				blan--;
			}
		}
<<<<<<< Updated upstream
		numeroIntentos++;
		if (numeroIntentos >= intentos)
=======
		numeroIntentos++; //sumamos un intento
		if (numeroIntentos >= intentos) //comprobamos que no hayamos perdido
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
					while (j < i && !tr) { // comprovamos si ese numero ha salido ya {
=======
					while (j < i && !tr) { // comprobamos si ese numero ha salido ya {
>>>>>>> Stashed changes
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


<<<<<<< Updated upstream
	public void crear_solucion() {
=======
	public void crear_solucion() { //lenamos la lista con una solucion random
>>>>>>> Stashed changes
		int valor = 0;
		for (int i = 0; i < bolasolucion.length; i++) {
			valor = r.nextInt(bolacolores.length);
			bolasolucion[i].setColor(bolacolores[valor].getBackground());
		}
	}
<<<<<<< Updated upstream
	public void crear_solucion2(PictureBox[]bolacolo,PictureBox[] bolasolu) {
=======
	public void crear_solucion2(PictureBox[]bolacolo,PictureBox[] bolasolu) { //lenamos la lisya con una solucion random pero no sobre variables de nuestra clase
>>>>>>> Stashed changes
		int valor = 0;
		for (int i = 0; i < bolasolu.length; i++) {
			valor = r.nextInt(bolacolo.length);
			bolasolu[i].setColor(bolacolo[valor].getBackground());
		}
	}
<<<<<<< Updated upstream
	public void ganar() {
		JOptionPane.showMessageDialog(null, "Has ganado!!!");
		System.exit(0);
	}

	public void crear_linea_bola() {
=======
	public void crear_linea_bola() { 
>>>>>>> Stashed changes
		// recorre el numero de numeros que se desea crear y se introducen picturesbox
		// de color Blanco (de momento)
		for (int i = 0; i < bolas.length; i++) {
			bolas[i].setColor(Color.black);
		}
	}

<<<<<<< Updated upstream
	public void cambiarColor(int i, int numeroBola, PictureBox[] p,PictureBox[]bolacolo) {
=======
	public void cambiarColor(int i, int numeroBola, PictureBox[] p,PictureBox[]bolacolo) { //metodo para cambiar el color de un picturebox de una lista segun otro de otra
>>>>>>> Stashed changes

		p[numeroBola].setColor(bolacolo[i].getBackground());

	}
<<<<<<< Updated upstream
	public void cambiarColor2(int i, int numeroBola, PictureBox[] p) {
=======
	public void cambiarColor2(int i, int numeroBola, PictureBox[] p) { 
>>>>>>> Stashed changes

		bolacolores[numeroBola].setColor(p[i].getBackground());

	}
<<<<<<< Updated upstream
=======
	
	//getters y setters
>>>>>>> Stashed changes
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
