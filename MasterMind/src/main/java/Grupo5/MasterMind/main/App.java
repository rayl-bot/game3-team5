package Grupo5.MasterMind.main;

/**
 * Hello world!
 *
 */

import java.awt.*;
import java.util.*;

import Grupo5.MasterMind.controller.ControllerMMW;
import Grupo5.MasterMind.objects.PictureBox;

public class App {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// llamamos a la funcion que mostrara la ventana
		showWindow();
	}
	
	public static void showWindow() {
		//SelectLevelWindow level = new SelectLevelWindow();
		ControllerMMW controlMMW = new ControllerMMW();
	}
	
}