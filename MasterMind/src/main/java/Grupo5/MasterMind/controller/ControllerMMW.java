
package Grupo5.MasterMind.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< Updated upstream

import javax.swing.JLabel;
=======
import java.awt.event.MouseAdapter;

>>>>>>> Stashed changes

import javax.swing.JOptionPane;
import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

<<<<<<< Updated upstream
public class ControllerMMW implements ActionListener {
	protected MasterMindWindow window;
	protected Events event;
	private PictureBox[] bolas1 = new PictureBox[4];
	private PictureBox[] bolaresul1 = new PictureBox[4];
	private int lvl;
=======
public class ControllerMMW extends MouseAdapter implements ActionListener  {
	protected MasterMindWindow window; //vista principal
	protected Events event; //clase donde se declaran los metodos sobre la funcionalidad del juego
	private PictureBox[] bolas1 = new PictureBox[4];
	private PictureBox[] bolaresul1 = new PictureBox[4];
	private int lvl;
	private int i;
	@SuppressWarnings("unused")
	private ControllerOpciones opcion;
	@SuppressWarnings("unused")
	private ControllerSLW cSLW;
>>>>>>> Stashed changes

	public ControllerMMW() {

		// llamada a la funcion que mostrara la pantalla y inicializara los eventos
		this.lvl=0;
		this.window = new MasterMindWindow();
		this.event = new Events();
<<<<<<< Updated upstream
		for (int i = 0; i < event.bolas.length; i++) {
			event.bolas[i].addActionListener(this);
		}
		llenarBolacolores(event.bolacolores);
		llenarBolasolucion(event.bolasolucion);
		llenarBolas(event.bolas);
=======
		for (int i = 0; i < event.getBolas().length; i++) {
			event.getBolas()[i].addActionListener(this);
		}
		llenarBolacolores(event.getBolacolores());
		llenarBolasolucion(event.getBolasolucion());
		llenarBolas(event.getBolas());
>>>>>>> Stashed changes
		this.window.acercaDe.addActionListener(this);
		this.window.salir.addActionListener(this);
		this.window.nuevoJuego.addActionListener(this);
		this.window.comoJugar.addActionListener(this);
		this.window.comprobar.addActionListener(this);
		this.window.opciones.setVisible(false);
<<<<<<< Updated upstream

=======
		this.i=0;
>>>>>>> Stashed changes
	}

	public ControllerMMW(int lvl) {

		// llamada a la funcion que mostrara la pantalla y inicializara los eventos
<<<<<<< Updated upstream
		this.lvl=lvl;
		this.window = new MasterMindWindow();
		this.event = new Events(lvl);
		for (int i = 0; i < event.bolas.length; i++) {
			event.bolas[i].addActionListener(this);
		}
		llenarBolacolores(event.bolacolores);
		llenarBolasolucion(event.bolasolucion);
		llenarBolas(event.bolas);
=======
		this.window = new MasterMindWindow();
		this.lvl=lvl;
		if(lvl == 0)
			this.window.opciones.setVisible(false);
		
		this.event = new Events(lvl);
		for (int i = 0; i < event.getBolas().length; i++) {
			event.getBolas()[i].addActionListener(this);
		}
		llenarBolacolores(event.getBolacolores());
		llenarBolasolucion(event.getBolasolucion());
		llenarBolas(event.getBolas());
>>>>>>> Stashed changes
		this.window.acercaDe.addActionListener(this);
		this.window.salir.addActionListener(this);
		this.window.nuevoJuego.addActionListener(this);
		this.window.comoJugar.addActionListener(this);
		this.window.comprobar.addActionListener(this);
		this.window.opciones.addActionListener(this);
<<<<<<< Updated upstream

	}

	public void llenarBolacolores(PictureBox[] p) {
		for (int j = 0; j < this.event.bolacolores.length; j++) {
=======
		this.i=0;

	}

	public void llenarBolacolores(PictureBox[] p) { //metodo que llena el panel de colores disponibles
		for (int j = 0; j < this.event.getBolacolores().length; j++) {
>>>>>>> Stashed changes
			window.pDisponibles.add(p[j]);
		}
	}

<<<<<<< Updated upstream
	public void llenarBolasolucion(PictureBox[]p) {
		for (int j = 0; j < this.event.bolasolucion.length; j++) {
			window.pSecreta.add(p[j]);
		}
	}

	public void llenarBolas(PictureBox[] p) {
		for (int j = 0; j < this.event.bolas.length; j++) {
			window.pSelect.add(p[j]);
		}
	}

	public void llenarSolucion(PictureBox[] p) {
		for (int j = 0; j < p.length; j++) {
			window.pResultado.add(p[j]);
		}
	}

	private int i = 0;

=======
	public void llenarBolasolucion(PictureBox[]p) { //metodo que llena el panel de solucion
		for (int j = 0; j < this.event.getBolasolucion().length; j++) {
			window.pSecreta.add(p[j]);
		}
	}

	public void llenarBolas(PictureBox[] p) { //metodo que llena el panel donde prueba combinaciones el jugador
		for (int j = 0; j < this.event.getBolas().length; j++) {
			window.pSelect.add(p[j]);
		}
	}

	public void llenarSolucion(PictureBox[] p) { //metodo que llena el panel que te dice la respuesta a tu secuencia introducida
		for (int j = 0; j < p.length; j++) {
			window.pResultado.add(p[j]);
		}
	}
>>>>>>> Stashed changes
	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
<<<<<<< Updated upstream
		if (e.getSource() == window.acercaDe)
=======
		if (e.getSource() == window.acercaDe) //boton que muestra los creadores del juego
>>>>>>> Stashed changes
			event.acercaDe();
		if (e.getSource() == window.comoJugar) //boton que muestra como jugar
			event.comoJugar();
<<<<<<< Updated upstream
		if (e.getSource() == window.nuevoJuego) {
			ControllerSLW cSLW = new ControllerSLW();
			window.frame.dispose();
		}
		if (e.getSource() == window.opciones) {
			ControllerOpciones opcion = new ControllerOpciones(lvl,this);
			
		}
		if (e.getSource() == window.salir) {
			System.exit(0);
		}
		if (event.numeroIntentos == 0) {
			if (e.getSource() == event.bolas[0]) {

				event.cambiarColor(i, 0, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
			if (e.getSource() == event.bolas[1]) {

				event.cambiarColor(i, 1, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
=======
		if (e.getSource() == window.nuevoJuego) { //boton para crear una nueva partida
			cSLW = new ControllerSLW(); 
			window.frame.dispose();
		}
		if (e.getSource() == window.opciones) { //boton para selecionar los colores con los que queremos jugar
			if(event.getNumeroIntentos() == 0) //solo sera posible si la partida no ha empezado 
				opcion = new ControllerOpciones(lvl,this); //llamamos al controllador de opcion
			else
			{
				JOptionPane.showMessageDialog(null, "El juego ha comenzado no puedes cambiar los colores"); //si la partida ha empezado mostramos msj de error
			}
		}
		if (e.getSource() == window.salir) { //boton para dejar de ejecutar la app
			System.exit(0);
		} 
		
		for (int i = 0; i < event.getBolas().length; i++) {
			event.getBolas()[i].addMouseListener(this);
		}
		if (event.getNumeroIntentos()==0) {
			if (e.getSource() == event.getBolas()[0]) {

				event.cambiarColor(i, 0, event.getBolas(), event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
					i = 0;
				}
			}
			if (e.getSource() == event.getBolas()[1]) {

				event.cambiarColor(i, 1, event.getBolas(), event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
>>>>>>> Stashed changes
					i = 0;
				}

			}
<<<<<<< Updated upstream
			if (e.getSource() == event.bolas[2]) {
				event.cambiarColor(i, 2, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
			if (e.getSource() == event.bolas[3]) {
				event.cambiarColor(i, 3, event.bolas,event.bolacolores);
				i++;
				if (i > 3) {
					i = 0;
				}
			}
		} else {
=======
			if (e.getSource() == event.getBolas()[2]) {
				event.cambiarColor(i, 2, event.getBolas(), event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
					i = 0;
				}
			}
			if (e.getSource() == event.getBolas()[3]) {
				event.cambiarColor(i, 3,event.getBolas(), event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
					i = 0;
				}
			}
		}else {
>>>>>>> Stashed changes
			if (e.getSource() == bolas1[0]) {

				event.cambiarColor(i, 0, bolas1,event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
					i = 0;
				}
			}
			if (e.getSource() == bolas1[1]) {

				event.cambiarColor(i, 1, bolas1,event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
					i = 0;
				}

			}
			if (e.getSource() == bolas1[2]) {
				event.cambiarColor(i, 2, bolas1,event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
					i = 0;
				}
			}
			if (e.getSource() == bolas1[3]) {
				event.cambiarColor(i, 3, bolas1,event.getBolacolores());
				i++;
				if (i >= event.getBolacolores().length) {
					i = 0;
				}
			}
		}
<<<<<<< Updated upstream
		if (e.getSource() == window.comprobar) {
			if (event.numeroIntentos == 0) {
				window.pSelect.revalidate();
				event.comprobarAciertos(event.bolas, event.bolaresul);
				llenarSolucion(event.bolaresul);
=======
		
		
		if (e.getSource() == window.comprobar) { //boton que comprueba si la seuencia que ha intentado el jugador es la correcta
			if (event.getNumeroIntentos() == 0) { 
				window.pSelect.revalidate();
				event.comprobarAciertos(event.getBolas(), event.getBolaresul()); //funcion de event que comprueba los aciertos
				llenarSolucion(event.getBolaresul());
>>>>>>> Stashed changes
			} else {
				window.pSelect.revalidate();
				event.comprobarAciertos(bolas1, bolaresul1);
				llenarSolucion(bolaresul1);
			}
<<<<<<< Updated upstream

			for (int i = 0; i < bolas1.length; i++) {
				bolas1[i] = new PictureBox();
				bolaresul1[i] = new PictureBox();
				bolas1[i].setColor(event.bolas[i].getForeground());
				bolaresul1[i].setColor(event.bolaresul[i].getForeground());
			}
			llenarBolas(bolas1);
			for (int i = 0; i < bolas1.length; i++) {
				bolas1[i].addActionListener(this);
				bolaresul1[i].addActionListener(this);
			}
			for (int i = 0; i < event.bolas.length; i++) {
=======
			for (int i = 0; i < bolas1.length; i++) { //cambiamos el color de la comprobacion segun los aciertos
				bolas1[i] = new PictureBox();
				bolaresul1[i] = new PictureBox();
				bolas1[i].setColor(event.getBolas()[i].getForeground());
				bolaresul1[i].setColor(event.getBolaresul()[i].getForeground());
			}
			llenarBolas(bolas1); //lo añadimos al panel
			for (int i = 0; i < bolas1.length; i++) { 
				bolas1[i].addActionListener(this);
				bolaresul1[i].addActionListener(this);
			}
			for (int i = 0; i < event.getBolas().length; i++) { //printamos debajo los nuevos picturebox de las secuencias
>>>>>>> Stashed changes
				bolas1[i].setBounds(bolas1[i].getBounds().x, bolas1[i].getBounds().y + 30, 30, 30);
				bolaresul1[i].setBounds(bolaresul1[i].getBounds().x, bolaresul1[i].getBounds().y, 30, 30);
			}

		}
<<<<<<< Updated upstream

	}
=======
		
	}
	/***
	public void mouseClicked(MouseEvent es) {
        if (event.getNumeroIntentos() == 0) {
            if (es.getSource() == event.getBolas()[0]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 0, event.getBolas(), event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 0,event.getBolas(), event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }
            }
            if (es.getSource() == event.getBolas()[1]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 1, event.getBolas(), event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 1,event.getBolas(), event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }
            }
            if (es.getSource() ==  event.getBolas()[2]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 2,event.getBolas(), event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 2, event.getBolas(), event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }
            }
            if (es.getSource() ==  event.getBolas()[3]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 3,event.getBolas(), event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 3, event.getBolas(), event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }
            }
        } else {
            if (es.getSource() == bolas1[0]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 0, bolas1, event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 0, bolas1, event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }
            }
            if (es.getSource() == bolas1[1]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 1, bolas1, event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 1, bolas1, event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }

            }
            if (es.getSource() == bolas1[2]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 2, bolas1, event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 2, bolas1, event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }
            }
            if (es.getSource() == bolas1[3]) {
                if (es.getButton() == MouseEvent.BUTTON1) {
                    event.cambiarColor(i, 3, bolas1, event.getBolacolores());
                    i++;
                    if (i > event.getBolacolores().length) {
                        i = 0;
                    }
                } else if (es.getButton() == MouseEvent.BUTTON3) {
                    event.cambiarColor(i, 3, bolas1, event.getBolacolores());
                    i--;
                    if (i < 0) {
                        i = event.getBolacolores().length-1;
                    }
                }
            }
        }
    }***/
>>>>>>> Stashed changes
}

