package graphicsProblemSet;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Hexagon extends JFrame{

	public Hexagon(){
		super("Hexagon");
		setSize(800, 800);
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
	
		int xPoint [] = {100, 300, 500, 700, 500, 300};
		int yPoint [] = {300, 150, 150, 300, 450, 450};
		g.fillPolygon(xPoint, yPoint, 6);
	}

	public static void main(String[] args) {
		Hexagon application = new Hexagon();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}