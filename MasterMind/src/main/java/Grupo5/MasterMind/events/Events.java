package Grupo5.MasterMind.events;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import Grupo5.MasterMind.objects.PictureBox;

public class Events {
	static final int COLORS = 4;// Constante que pone 4 colores
	static Random r = new Random(); // generamos un numero aleatorio
	static Color[] colores = new Color[11];
	public PictureBox[] bolasolucion = new PictureBox[4];
	public PictureBox[] bolas = new PictureBox[4];
	public PictureBox[] bolaresul = new PictureBox[4];
	public PictureBox[] bolacolores = new PictureBox[4];
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
	public void comprobarAciertos() {
        int cont = 0, cont2 = 0;
        for (int i = 0; i < bolas.length; i++) {
            if (bolasolucion[i].getBackground().equals(bolas[i].getBackground())) {
                bolaresul[cont].setColor(Color.black);
                cont++;
            }
        }
        if(cont != 4) {
	        cont = 0;
	        for (int i = 0; i < bolas.length; i++) {
	            for (int j = 0; j < bolas.length; j++) {
	                if (bolasolucion[i].getBackground().equals(bolas[j].getBackground())) {
	                    cont2++;
	                }
	                if (!bolaresul[cont].getBackground().equals(Color.black) && cont2 > 0) {
	                    bolaresul[cont].setColor(Color.white);
	                }
	                cont2 = 0;
	            }
	            cont++;
	        }
        }
        else
        {
        	ganar();
        }
        numeroIntentos++;
        if (numeroIntentos >= intentos) {
            perder();
        }
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
	public void ganar()
	{
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

	public void cambiarColor(int i, int numeroBola) {
		
		bolas[numeroBola].setColor(bolacolores[i].getBackground());
			
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