package Grupo5.MasterMind.main;
import java.awt.*;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		Color[] colores = new Color[12];
        colores[0]=(Color.black);
        colores[1]=(Color.blue);
        colores[2]=(Color.cyan);
        colores[3]=(Color.darkGray);
        colores[4]=(Color.gray);
        colores[5]=(Color.green);
        colores[6]=(Color.lightGray);
        colores[7]=(Color.magenta);
        colores[8]=(Color.orange);
        colores[9]=(Color.pink);
        colores[10]=(Color.red);
        colores[11]=(Color.white);
        colores[12]=(Color.yellow);
        Graphics[] g = new Graphics[4];
        for (int i = 0; i < g.length; i++) {
			g[i].setColor(crear_solucion(colores));
		}
	}
	public static Color crear_solucion(Color[]c) {
		Random r = new Random();
		int i=0;
		i= r.nextInt(4);
		return c[i];
	}
}
