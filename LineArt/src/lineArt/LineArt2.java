package lineArt;
import java.awt.*;
import javax.swing.*;

public class LineArt2 extends JFrame{

	public LineArt2() { 
		super("Line Art 2"); 
		setSize(600, 600); 
		setVisible(true);
	} 

	public void paint(Graphics g) { 
		final int gap = 10; 
		super.paint(g);
		
		g.setColor(Color.GREEN);
		for (int i = 0; i < 150/gap; i++){
			g.drawLine(300-i*gap, 50, 150, 50+i*gap);
		}
		
		g.setColor(Color.MAGENTA);
		for (int i = 0; i < 150/gap; i++){
			g.drawLine(300-i*gap, 300, 150, 300-i*gap);
		}
		
		g.setColor(Color.BLUE);
		for (int i = 0; i < 150/gap; i++){
			g.drawLine(300+i*gap, 300, 450, 300-i*gap);
		}
		
		g.setColor(Color.RED);
		for (int i = 0; i < 150/gap; i++){
			g.drawLine(300+i*gap, 50, 450, 50+i*gap);
		}
	}
	
	public static void main(String[] args) {
		LineArt2 application = new LineArt2();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
