package Grupo5.MasterMind.objects;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class PictureBox extends JButton{
	
	public PictureBox () {
		super();
		this.setBorder(null);
		this.setOpaque(true);
		this.setContentAreaFilled(false);
		this.setBackground(Color.WHITE);
		this.setForeground(Color.BLACK);
		this.setPreferredSize(new Dimension(30,30));
		this.setOpaque(true);
		this.setSize(30, 30);
	}
	
	public void setColor(Color c) {
		this.setBackground(c);
		this.setForeground(Color.BLACK);
	}
	public void getColor(){
		this.getBackground();
	}
}
