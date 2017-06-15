package graphicsProblemSet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class SquareLoop extends JFrame{

	public SquareLoop(){
		super("Square Loop");
		setSize(700, 700);
		setVisible(true);	
	}
	
	public void paint(Graphics g){
        super.paint(g);
        int side = 700;

        for(int counter = 0; counter <= 700; counter += 100){
        	 if ((counter/100)%2 == 0)
        		 g.setColor(Color.BLUE);
        	 else
        		 g.setColor(Color.YELLOW);
             
             g.fillRect(0, counter, side, side);
             side -= 100;
        }
	}
	
	public static void main(String[] args) {
		SquareLoop application = new SquareLoop();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
