package Grupo5.MasterMind.events;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import Grupo5.MasterMind.objects.PictureBox;

public class Events {
	static final int COLORS = 4;// Constante que pone 4 colores
	
	public void comoJugar() {
		JOptionPane.showMessageDialog(null, "Se juega jugando");
	}
	
	public void acercaDe() {
		JOptionPane.showMessageDialog(null, "Alvaro Raul Evelyn");
	}

	// funcionn que crea los colores pasandoles por parametros dos listas de
	// colores, los disponibles y la lista nueva
	public void crear_colores(Color c[], Color col[]) {
		int[] colores = new int[col.length]; // controlador para comparar los random con los enteros
		int valor = 0;
		for (int i = 0; i < col.length; i++) {
			if (i != 0) // si no estamos en la primera iteracion
			{
				boolean tr = false;
				boolean cor = false;
				while (!cor) {
					Random r = new Random(); // generamos un numero aleatorio
					valor = r.nextInt(c.length + 1) + 1;
					int j = 0;
					while (j < i && !tr) // comprovamos si ese numero ha salido ya
					{
						if (colores[j] == valor)
							tr = true;
						else
							j++;
					}
					if (!tr) // si no coincide con ninguna iteracion anterior dejamos de generar numeros
								// aleatorios
						cor = true;
				}
			} else {
				//esto generara un numero random par agregarlo
				Random r = new Random();
				valor = r.nextInt(c.length + 1) + 1;
			}
			colores[i] = valor;
			col[i] = c[colores[i]];
		}
	}

	public PictureBox[] crear_linea_bola() {
		// creamos una array que almacene picuresbox
		PictureBox[] bolas = new PictureBox[COLORS];
		// recorre el numero de numeros que se desea crear y se introducen picturesbox
		// de color Blanco (de momento)
		for (int i = 0; i < COLORS; i++) {
			bolas[i] = new PictureBox();
			bolas[i].setColor(Color.RED);
		}
		// devuelve la array de bolas
		return bolas;
	}

}
