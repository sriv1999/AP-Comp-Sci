package inheritance;

public class Rectangle extends Polygon{

	private double length;
	private double width;
	
	public Rectangle(){
		super(4, "Rectangle");
		length = 7;
		width = 8;
	}
	
	public Rectangle(double myLength, double myWidth){
		super(4, "Rectangle");
		length = myLength;
		width = myWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public void doubleWidth(){
		System.out.println("DOUBLE WIDTH: " + 2.0 * width);
	}
	
	public double getArea(){
		return length * width;
	}
	
	public double getPerimeter(){
		return 2 * length + 2 * width;
	}
	
	public String toString(){
		return super.toString() + "\nLENGTH: " + getLength() + "\nWIDTH: " + getWidth();
	}
	
	public static void main(String [] args){
		Rectangle a = new Rectangle(5, 6);
		System.out.println(a);
		System.out.println(a.getSides());
	}
}
