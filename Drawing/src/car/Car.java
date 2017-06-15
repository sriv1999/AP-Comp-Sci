package car;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
public class Car {
	
	private int xLeft;
	private int yTop;
	
	public Car(int x, int y){
		xLeft = x;
		yTop = y;
	}
	
	public void draw(Graphics2D g2){                                                                                                   
		//Body
		Rectangle body = new Rectangle(xLeft, yTop +10, 60, 10);
		
		//Tires
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
		
		//The bottom of the front windshield
		Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
		
		//The front of the roof
		Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
		
		//The rear of the roof
		Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
		
		//The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);
		
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
		
		Graphics2D g2d = (Graphics2D) g2;
		g2d.setStroke(new BasicStroke(2));
		
		g2.setColor(Color.BLUE);
		g2.fill(body);
		g2.setColor(Color.BLACK);
		g2.fill(frontTire);
		g2.fill(rearTire);
		g2.setColor(Color.ORANGE);
		g2.draw(frontWindshield);
		g2.setColor(Color.GREEN);
		g2.draw(roofTop);
		g2.setColor(Color.ORANGE);
		g2.draw(rearWindshield);
	}

}
