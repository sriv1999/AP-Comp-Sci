package illusion;
import javax.swing.*;
import java.awt.*;

public class Illusion1 extends JFrame {

	public Illusion1(){
		super("Illusion 1");
		setSize(600, 600);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, 600, 600);
		g.setColor(Color.WHITE);
		for(int i = 0; i < 11; i++){
			g.fillRect(50 + i*50, 0, 10, 600);
			try{
			    Thread.currentThread().sleep(100);
			} 
			catch (InterruptedException e){ 
			   e.printStackTrace();
			}
		}
		
		for(int i = 0; i <= 11; i++){
			g.fillRect(0, 50 + i*50, 600, 10);
			try{
			    Thread.currentThread().sleep(100);
			} 
			catch (InterruptedException e){ 
			   e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		Illusion1 application=new Illusion1();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}