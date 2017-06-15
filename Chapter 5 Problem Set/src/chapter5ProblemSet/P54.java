package chapter5ProblemSet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class P54 extends JFrame{
	
	private int radius;
	
	public P54(int r){
		super("P54");
		setSize(600, 600);
		setVisible(true);
		radius = r;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		Ellipse2D.Double circle = new Ellipse2D.Double(300, 300, radius, radius);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2));
		
		g2d.draw(circle);
	}

	public static void main(String[] args) {
		int radius = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the radius of the circle? "));
		
		P54 application = new P54(radius);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
