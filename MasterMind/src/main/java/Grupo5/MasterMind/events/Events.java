package Grupo5.MasterMind.events;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import Grupo5.MasterMind.objects.PictureBox;

public class Events {
	static final int COLORS = 4;// Constante que pone 4 colores
	static Random r = new Random(); // generamos un numero aleatorio
	static Color[] colores = new Color[10];
	public static PictureBox[] bolasolucion = new PictureBox[4];
	public static PictureBox[] bolas = new PictureBox[4];
	public static PictureBox[] bolaresul = new PictureBox[4];
	public static PictureBox[] bolacolores = new PictureBox[4];

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

	public void comoJugar() {
		JOptionPane.showMessageDialog(null, "Se juega jugando");
	}

	public void acercaDe() {
		JOptionPane.showMessageDialog(null, "Alvaro Raul Evelyn");
	}

	public void comprobarAciertos(PictureBox[] bolasolucion, PictureBox[] bolas, PictureBox[] bolaresul) {
		int cont = 0, cont2=0;
		for (int i = 0; i < bolas.length; i++) {
			if (bolasolucion[i].getColor() == bolas[i].getColor()) {
				bolaresul[cont].setColor(Color.black);
				cont++;
			}
		}
		cont=0;
		for (int i = 0; i < bolas.length; i++) {
			for (int j = 0; j < bolas.length; j++) {
				if (bolasolucion[i].getColor()==bolas[j].getColor()) {
					cont2++;
				}
				if (bolaresul[cont].getColor()!=Color.black&&cont2>0) {
					bolaresul[cont].setColor(Color.white);
				}
				cont++;
				
			}
		}
	}

	// funcionn que crea los colores pasandoles por parametros dos listas de
	// colores, los disponibles y la lista nueva
	public void crear_colores(PictureBox[] bolacolores) {
		int[] coloresNum = new int[bolacolores.length]; // controlador para comparar los random con los enteros
		int valor = 0;
		for (int i = 0; i < bolacolores.length; i++) {
			if (i != 0) // si no estamos en la primera iteracion
			{
				boolean tr = false;
				boolean cor = false;
				while (!cor) {
					valor = r.nextInt(colores.length + 1) + 1;
					int j = 0;
					while (j < i && !tr) // comprovamos si ese numero ha salido ya
					{
						if (coloresNum[j] == valor)
							tr = true;
						else
							j++;
					}
					if (!tr) // si no coincide con ninguna iteracion anterior dejamos de generar numeros
								// aleatorios
						cor = true;
				}
			} else {
				valor = r.nextInt(colores.length + 1) + 1;
			}
			coloresNum[i] = valor;
			bolacolores[i].setColor(colores[coloresNum[i]]);
		}
	}

	public void crear_solucion(PictureBox[] bolasolucion, PictureBox[] bolacolores) {
		int valor = 0;
		for (int i = 0; i < bolasolucion.length; i++) {
			valor = r.nextInt(bolasolucion.length + 1);
			bolasolucion[i] = bolacolores[valor];
		}
	}

	public void crear_linea_bola(PictureBox[] bolas) {
		// recorre el numero de numeros que se desea crear y se introducen picturesbox
		// de color Blanco (de momento)
		for (int i = 0; i < COLORS; i++) {
			bolas[i] = new PictureBox();
			bolas[i].setColor(Color.WHITE);
		}
	}

}
