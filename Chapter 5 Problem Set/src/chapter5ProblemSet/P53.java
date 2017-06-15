package chapter5ProblemSet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class P53 extends JFrame{
	
	public P53(){
		super("P53");
		setSize(600, 600);
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawString("BLACK", 100, 25);
		
		g.setColor(Color.RED);
		g.drawString("RED", 100, 50);
		
		g.setColor(Color.BLUE);
		g.drawString("BLUE", 100, 75);

		g.setColor(Color.YELLOW);
		g.drawString("YELLOW", 100, 100);
		
		g.setColor(Color.GREEN);
		g.drawString("GREEN", 100, 125);
		
		g.setColor(Color.ORANGE);
		g.drawString("ORANGE", 100, 150);
		
		g.setColor(Color.PINK);
		g.drawString("PINK", 100, 175);
		
		g.setColor(Color.MAGENTA);
		g.drawString("MAGENTA", 100, 200);
		
		g.setColor(Color.CYAN);
		g.drawString("CYAN", 100, 225);
		
		g.setColor(Color.LIGHT_GRAY);
		g.drawString("LIGHT GRAY", 100, 250);
		
		g.setColor(Color.GRAY);
		g.drawString("GRAY", 100, 275);
		
		g.setColor(Color.DARK_GRAY);
		g.drawString("DARK GRAY", 100, 300);
	}

	public static void main(String[] args) {
		P53 application = new P53();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
