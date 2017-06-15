package drawing;
import java.awt.*;
import javax.swing.JFrame;
public class LinesRectsOvals extends JFrame{
	
	public LinesRectsOvals(){
		super("Drawing Lines, Rectangles, Ovals and Polygons");
		setSize(400, 600);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.drawLine(30, 70, 350, 70);
		g.fillOval(40, 400, 150, 50);
		
		g.setColor(Color.red);
		g.draw3DRect(7, 100, 90, 55, true);
		g.fill3DRect(100, 100, 90, 55, true);
		g.setColor(new Color(0, 255, 255));
		
		int xPoint [] = {250, 200, 200};
		int yPoint [] = {250, 250, 220};
		g.fillPolygon(xPoint, yPoint, 3);
		
		g.setColor(new Color(0, 0, 0));
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));
		g.drawLine(200, 230, 200, 300);
		
	}

	public static void main(String[] args) {
		LinesRectsOvals application = new LinesRectsOvals();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
