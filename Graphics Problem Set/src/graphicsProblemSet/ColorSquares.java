package graphicsProblemSet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ColorSquares extends JFrame{

	public ColorSquares(){
		super("Color Squares");
		setSize(600, 600);
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		g.fill3DRect(0, 0, 300, 300, true);
		
		g.setColor(Color.RED);
		g.fill3DRect(150, 150, 300, 300, true);
		
		g.setColor(Color.MAGENTA);
		g.fill3DRect(150, 150, 150, 150, true);
	}

	public static void main(String[] args) {
		ColorSquares application = new ColorSquares();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}