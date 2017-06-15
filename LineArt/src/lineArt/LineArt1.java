package lineArt;
import javax.swing.*;

import java.awt.*;

public class LineArt1 extends JFrame { 
//  Create the object and set the frame 

	public LineArt1() { 
		super("Line Art 1"); 
		setSize(600, 600); 
		setVisible(true);
	} 

	public void paint(Graphics g) { 
		final int gap = 10; 
		super.paint(g);
		
		g.setColor(Color.RED);
		for (int i = 1; i < 300/gap; i++){
			g.drawLine(300, 0+i*gap, 300+i*gap, 300);
		}
		
		g.setColor(Color.BLUE);
		for (int i = 1; i < 300/gap; i++){
			g.drawLine(300, 600-i*gap, 300+i*gap, 300);
		}
		
		g.setColor(Color.MAGENTA);
		for (int i = 1; i < 300/gap; i++){
			g.drawLine(300, 600-i*gap, 300-i*gap, 300);
		}
		
		g.setColor(Color.GREEN);
		for (int i = 1; i < 300/gap; i++){
			g.drawLine(300, 0+i*gap, 300-i*gap, 300);
		}
	}
	
	public static void main(String[] args) {
		LineArt1 application = new LineArt1();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
