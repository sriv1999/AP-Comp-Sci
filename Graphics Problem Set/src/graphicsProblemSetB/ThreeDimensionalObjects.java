package graphicsProblemSetB;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ThreeDimensionalObjects extends JFrame{

	public ThreeDimensionalObjects(){
		super("Three Dimensional Objects");
		setSize(600, 600);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		//cone
		g.drawOval(200, 400, 150, 50);
		g.drawLine(200, 425, 275, 200);
		g.drawLine(350, 425, 275, 200);
	}
	
	public static void main(String[] args) {
		ThreeDimensionalObjects application = new ThreeDimensionalObjects();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
