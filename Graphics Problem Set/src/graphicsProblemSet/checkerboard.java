package graphicsProblemSet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class checkerboard extends JFrame{

	public checkerboard(){
		super("Checkerboard");
		setSize(800, 800);
		setVisible(true);	
	}
	
	public void paint(Graphics g){
     
        for (int row = 0; row < 8; row++){
           for (int col = 0; col < 8; col++){
              int x = col * 100;
              int y = row * 100;
              
              if ((row % 2) == (col % 2))
                 g.setColor(Color.RED);
              else
                 g.setColor(Color.BLACK);
              
              g.fillRect(x, y, 100, 100);
           } 
        }
	}
	
	public static void main(String[] args) {
		checkerboard application = new checkerboard();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
