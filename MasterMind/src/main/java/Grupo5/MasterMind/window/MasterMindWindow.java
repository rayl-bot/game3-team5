package Grupo5.MasterMind.window;

import java.awt.*;

import javax.swing.*;

import Grupo5.MasterMind.events.Events;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class MasterMindWindow {

	public JFrame frame;
	public JMenuBar menuBar;
	public JMenu archivo;
	public JMenu ayuda;
	public JMenuItem comoJugar, nuevoJuego, salir;
	public JMenuItem acercaDe;
	public JPanel pDisponibles,pSecreta, pResultado;
	public Button button;
	private Button button_1;

	/**
	 * Create the application.
	 */
	public MasterMindWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/***
		 * creacion de la ventana principal
		 */
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame.setTitle("Master Mind");
		frame.setBounds(100, 100, 913, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		/***
		 * labels de la pantalla principal del juego
		 */
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Colores disponibles");
		lblNewLabel.setBounds(690, 36, 199, 13);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Combinacion secreta");
		lblNewLabel_1.setBounds(690, 129, 199, 13);
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		frame.getContentPane().add(lblNewLabel_1);

		/***
		 * Barra de menu con los items incorporados
		 */
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 266, 22);
		frame.getContentPane().add(menuBar);
		archivo = new JMenu("Archivo");
		ayuda = new JMenu("Help");
		comoJugar = new JMenuItem("Como jugar");
		acercaDe = new JMenuItem("Acerca de");
		nuevoJuego = new JMenuItem("New Game");
		salir = new JMenuItem("Exit");
		menuBar.add(archivo);
		menuBar.add(ayuda);
		ayuda.add(comoJugar);
		ayuda.add(acercaDe);
		archivo.add(nuevoJuego);
		archivo.add(salir);
		
		pDisponibles = new JPanel();
		pDisponibles.setBackground(Color.WHITE);
		pDisponibles.setBounds(623, 59, 266, 60);
		frame.getContentPane().add(pDisponibles);
		
		pSecreta = new JPanel();
		pSecreta.setBackground(Color.WHITE);
		pSecreta.setBounds(623, 152, 266, 60);
		frame.getContentPane().add(pSecreta);
		
		
		JLabel lblNewLabel_2 = new JLabel("Tablero de Juego");
		lblNewLabel_2.setFont(new Font("Source Code Pro", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(218, 83, 150, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		pResultado = new JPanel();
		pResultado.setBackground(Color.WHITE);
		pResultado.setBounds(309, 106, 266, 285);
		frame.getContentPane().add(pResultado);
		GridBagLayout gbl_pResultado = new GridBagLayout();
		gbl_pResultado.columnWidths = new int[]{0};
		gbl_pResultado.rowHeights = new int[]{0};
		gbl_pResultado.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_pResultado.rowWeights = new double[]{Double.MIN_VALUE};
		pResultado.setLayout(gbl_pResultado);
		
		JPanel pResultado_1 = new JPanel();
		pResultado_1.setBackground(Color.WHITE);
		pResultado_1.setBounds(42, 106, 266, 285);
		frame.getContentPane().add(pResultado_1);
		pResultado_1.add(button, "14, 2");
		GridBagLayout gbl_pResultado_1 = new GridBagLayout();
		gbl_pResultado_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_pResultado_1.rowHeights = new int[]{0, 0};
		gbl_pResultado_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pResultado_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pResultado_1.setLayout(gbl_pResultado_1);
		
		button_1 = new Button("New button");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 7;
		gbc_button_1.gridy = 0;
		pResultado_1.add(button_1, gbc_button_1);

	}
}
