package graphicsProblemSetB;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class PieChart extends JFrame{

	public PieChart(){
		super("Pie Chart");
		setSize(600, 600);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.GREEN);
		g2d.fill(new Arc2D.Double(100, 100, 300, 300, 90, 180, Arc2D.PIE));
		g2d.fill3DRect(450, 400, 10, 10, true);
		g2d.setColor(Color.BLACK);
		g2d.drawString("2009", 460, 410);
		
		g2d.setColor(Color.RED);
		g2d.fill(new Arc2D.Double(100, 100, 300, 300, 270, 90, Arc2D.PIE));
		g2d.fill3DRect(450, 350, 10, 10, true);
		g2d.setColor(Color.BLACK);
		g2d.drawString("2008", 460, 360);
		
		g2d.setColor(Color.BLACK);
		g2d.fill(new Arc2D.Double(100, 100, 300, 300, 0, 45, Arc2D.PIE));
		g2d.fill3DRect(450, 300, 10, 10, true);
		g2d.setColor(Color.BLACK);
		g2d.drawString("2007", 460, 310);
		
		g2d.setColor(Color.CYAN);
		g2d.fill(new Arc2D.Double(100, 100, 300, 300, 45, 22.5, Arc2D.PIE));
		g2d.fill3DRect(450, 250, 10, 10, true);
		g2d.setColor(Color.BLACK);
		g2d.drawString("2006", 460, 260);
		
		g2d.setColor(Color.BLUE);
		g2d.fill(new Arc2D.Double(100, 100, 300, 300, 67.5, 22.5, Arc2D.PIE));
		g2d.fill3DRect(450, 200, 10, 10, true);
		g2d.setColor(Color.BLACK);
		g2d.drawString("2005", 460, 210);
	}
	
	public static void main(String[] args) {
		PieChart application = new PieChart();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(12.5%3);

	}

}
