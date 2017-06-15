package illusion;
import javax.swing.*;
import java.awt.*;

public class Illusion2 extends JFrame {
	
	public Illusion2() {
		super("Illusion 2");
		setSize(525, 550);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 600, 600);
		g.setColor(Color.BLACK);
		for(int i=0;i<10;i++){	
			for(int j=0;j<10;j++){
				g.fillRect(20+i*50, 40+j*50, 40, 40);
				try {
				    Thread.currentThread().sleep(100);
				} 
				catch (InterruptedException e){ 
				   e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args){
		Illusion2 application=new Illusion2();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}