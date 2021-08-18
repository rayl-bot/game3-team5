
package Grupo5.MasterMind.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import java.awt.Button;

public class ColorDialog extends JFrame {

    public JColorChooser tcc;
    public JLabel banner;
    public Button aceptar, cancelar;

    public ColorDialog() {
        initialize();
    }


    private void initialize() {
        this.setTitle("SELECCIONADOR DE COLOR"); 
        this.setVisible(true);
        this.setBounds(100, 100, 725, 552);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the banner at the top of the window
        banner = new JLabel("Bienvenidos a la seleccion de color", JLabel.CENTER);
        banner.setForeground(Color.yellow);
        banner.setBackground(Color.blue);
        banner.setOpaque(true);
        //banner.setFont(new Font("SansSerif", Font.BOLD, 24));
        banner.setPreferredSize(new Dimension(100, 65));

        JPanel bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.setBounds(0, 0, 700, 135);
        bannerPanel.add(banner, BorderLayout.CENTER);
        bannerPanel.setBorder(BorderFactory.createTitledBorder("Banner"));

        // Set up color chooser for setting text color
        tcc = new JColorChooser(banner.getForeground());
        tcc.setBounds(0, 135, 700, 327);
        //tcc.getSelectionModel().addChangeListener();
        tcc.setBorder(BorderFactory.createTitledBorder("Choose Text Color"));
        getContentPane().setLayout(null);

        getContentPane().add(bannerPanel);
        getContentPane().add(tcc);

        aceptar = new Button("Aceptar");
        aceptar.setBounds(200, 484, 66, 21);
        getContentPane().add(aceptar);

        cancelar = new Button("Cancelar");
        cancelar.setBounds(414, 484, 66, 21);
        getContentPane().add(cancelar);
    }

}
