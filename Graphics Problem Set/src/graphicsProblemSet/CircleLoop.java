package graphicsProblemSet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class CircleLoop extends JFrame{

	public CircleLoop(){
		super("Circle Loop");
		setSize(600, 600);
		setVisible(true);	
	}
	
	public void paint(Graphics g){
		Random  gen = new Random();   
        super.paint(g);
        int diameter = 600;

        for(int counter = 0; counter <= 600; counter += 10){
        	int red = gen.nextInt(256);
        	int green = gen.nextInt(256);
        	int blue = gen.nextInt(256);
        	
        	 g.setColor( new Color( red,green, blue));
             
             g.fillOval(counter, counter, diameter, diameter);
             diameter -= 10;
        }
	}
	
	public static void main(String[] args) {
		CircleLoop application = new CircleLoop();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
