package Grupo5.MasterMind.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Grupo5.MasterMind.events.Events;
import Grupo5.MasterMind.objects.PictureBox;
import Grupo5.MasterMind.window.*;

public class ControllerMMW implements ActionListener {
    private MasterMindWindow window;
    private Events event;

    public ControllerMMW() {

        // llamada a la funcion que mostrara la pantalla y inicializara los eventos
        this.window = new MasterMindWindow();
        this.event = new Events();
        for (int i = 0; i < event.bolas.length; i++) {
            event.bolas[i].addActionListener(this);
        }
        llenarBolacolores();
        llenarBolasolucion();
        llenarBolas();
        this.window.acercaDe.addActionListener(this);
        this.window.salir.addActionListener(this);
        this.window.nuevoJuego.addActionListener(this);
        this.window.comoJugar.addActionListener(this);
        this.window.comprobar.addActionListener(this);

    }

    public ControllerMMW(int lvl) {

        // llamada a la funcion que mostrara la pantalla y inicializara los eventos
        this.window = new MasterMindWindow();
        this.event = new Events(lvl);
        for (int i = 0; i < event.bolas.length; i++) {
            event.bolas[i].addActionListener(this);
        }
        llenarBolacolores();
        llenarBolasolucion();
        llenarBolas();
        this.window.acercaDe.addActionListener(this);
        this.window.salir.addActionListener(this);
        this.window.nuevoJuego.addActionListener(this);
        this.window.comoJugar.addActionListener(this);
        this.window.comprobar.addActionListener(this);

    }

    private void llenarBolacolores() {
        for (int j = 0; j < this.event.bolacolores.length; j++) {
            window.pDisponibles.add(this.event.bolacolores[j]);
        }
    }

    private void llenarBolasolucion() {
        for (int j = 0; j < this.event.bolasolucion.length; j++) {
            window.pSecreta.add(this.event.bolasolucion[j]);
        }
    }

    private void llenarBolas() {
        for (int j = 0; j < this.event.bolas.length; j++) {
            window.pSelect.add(this.event.bolas[j]);
        }
    }
    private void llenarSolucion() {
    	for (int j = 0; j < this.event.bolaresul.length; j++) {
            window.pResultado.add(this.event.bolaresul[j]);
        }
    }
    private int i=0;
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // TODO Auto-generated method stub
        if (e.getSource() == window.acercaDe)
            event.acercaDe();
        if (e.getSource() == window.comoJugar)
            event.comoJugar();
        if (e.getSource() == window.nuevoJuego) {
            ControllerSLW cSLW = new ControllerSLW();
            window.frame.dispose();
        }
        if (e.getSource() == window.salir) {
            System.exit(0);
        }
        if (e.getSource() == event.bolas[0]) {
            
            event.cambiarColor(i, 0);
            i++;
            if (i>3) {
                i=0;
            }
        }
        if (e.getSource() == event.bolas[1]) {
            
            event.cambiarColor(i, 1);
            i++;
            if (i>3) {
                i=0;
            }
            
        }
        if (e.getSource() == event.bolas[2]) {
            event.cambiarColor(i, 2);
            i++;
            if (i>3) {
                i=0;
            }
        }
        if (e.getSource() == event.bolas[3]) {
            event.cambiarColor(i, 3);
            i++;
            if (i>3) {
                i=0;
            }
        }
        if(e.getSource() == window.comprobar)
        {
        	event.comprobarAciertos();
        	llenarSolucion();
        	//llenarBolas();
        }
    }
}