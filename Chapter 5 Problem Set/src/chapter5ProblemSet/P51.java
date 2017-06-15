package chapter5ProblemSet;
import java.awt.*;
import javax.swing.JFrame;

public class P51 extends JFrame{
	
	public P51(){
		super("P51");
		setSize(600, 600);
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLUE);
		g.fill3DRect(100, 100, 140, 40, true);
		
		g.setColor(Color.BLACK);
		g.drawString("Srivatsan Srinivasan", 110, 130);
	}

	public static void main(String[] args) {
		P51 application = new P51();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
