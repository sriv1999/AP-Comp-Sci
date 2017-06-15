package chapter5ProblemSet;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class P52 extends JFrame{
	
	private String name;
	
	public P52(String n){
		super("P52");
		setSize(600, 600);
		setVisible(true);
		name = n;
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		g.fill3DRect(100, 100, 140, 40, true);
		
		g.setColor(Color.BLACK);
		g.drawString(name, 110, 130);
	}

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "What is your name? ");
		
		P52 application = new P52(name);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
