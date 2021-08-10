package Grupo5.MasterMind.objects;

import java.awt.Color;

import javax.swing.JComponent;

public class PictureBox extends JComponent{
	private Color color;
	
	public PictureBox () {
		this.color = Color.RED;
		this.setBounds(54, 82, 100, 100);
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
		this.setBackground(this.color);
	}
	
}
