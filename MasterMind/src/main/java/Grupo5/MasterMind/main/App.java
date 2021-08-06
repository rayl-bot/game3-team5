package Grupo5.MasterMind.main;

/**
 * Hello world!
 *
 */

import java.awt.*;
import java.util.*;

import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.MasterMindWindow;
import Grupo5.MasterMind.window.SelectLevelWindow;

public class App {
	static final int COLORS = 4;// Constante que pone 4 colores

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// llamamos a la funcion que mostrara la ventana
		showWindow();
	}

	public static void showWindow() {
		SelectLevelWindow level = new SelectLevelWindow();
		// MasterMindWindow window = new MasterMindWindow();
	}

	public static void crear_colores(Color c[], Color col[]) {
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
				Random r = new Random();
				valor = r.nextInt(c.length + 1) + 1;
			}
			colores[i] = valor;
			col[i] = c[colores[i]];
		}
	}

	public static PictureBox[] crear_linea_bola() {
		// creamos una array que almacene picuresbox
		PictureBox[] bolas = new PictureBox[COLORS];
		// recorre el numero de numeros que se desea crear y se introducen picturesbox
		// de color Blanco (de momento)
		for (int i = 0; i < COLORS; i++) {
			bolas[i] = new PictureBox();
			bolas[i].setColor(Color.WHITE);
		}
		//devuelve la array de bolas
		return bolas;
	}
}