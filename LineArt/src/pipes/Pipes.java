package pipes;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;

public class Pipes extends JFrame{

	public Pipes(){
		super("Pipes");
		setSize(600, 600);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		final int count = 11;
		Random gen = new Random();
		int [] x = new int [count+1];
		int [] y = new int [count+1];
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 600);
		
		g.setColor(Color.WHITE);
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		for(int i = 0; i < count; i++){
			x1 = x2;
			y1 = y2;
			x[i] = x1;
			y[i] = y1;
			x2 = gen.nextInt(600);
			y2 = gen.nextInt(600);
			g.drawLine(x1, y1, x2, y2);
			try{
			    Thread.currentThread().sleep(1000);
			} 
			catch (InterruptedException e){ 
			   e.printStackTrace();
			}
		}
		
		g.setColor(Color.BLACK);
		for (int j = 0; j < count; j++){
			g.drawLine(x[j], y[j], x[j+1], y[j+1]);
			try{
			    Thread.currentThread().sleep(100);
			} 
			catch (InterruptedException e){ 
			   e.printStackTrace();
			}
		}
		g.fillRect(0, 0, 600, 600);
	}
	
	public static void main(String[] args){
		Pipes application = new Pipes();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}