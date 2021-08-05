package Grupo5.MasterMind.main;

/**
 * Hello world!
 *
 */

import java.awt.*;

import Grupo5.MasterMind.window.MasterMindWindow;
import Grupo5.MasterMind.window.SelectLevelWindow;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// llamamos a la funcion que mostrara la ventana
		showWindow();
	}

	public static void showWindow() {
		SelectLevelWindow level = new SelectLevelWindow();
		//MasterMindWindow window = new MasterMindWindow();
	}
}