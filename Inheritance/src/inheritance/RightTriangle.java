package inheritance;

public class RightTriangle extends Polygon{
	
	private double base;
	private double height;
	
	public RightTriangle(){
		super(3, "Triangle");
		base = 4;
		height = 5;
	}
	
	public RightTriangle(double myBase, double myHeight){
		super(3, "Triangle");
		base = myBase;
		height = myHeight;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double getArea(){
		return 0.5 * base * height;
	}
	
	public double getPerimeter(){
		double hyp = Math.sqrt((base*base) + (height*height));
		return base + height + hyp;
	}
	
	public String toString(){
		return super.toString() + "\nBASE: " + getBase() + "\nHEIGHT: " + getHeight();
	}
	
	public static void main(String[] args) {
		RightTriangle a = new RightTriangle(6, 8);
		System.out.println(a);
		System.out.println("SIDES: " + a.getSides());

	}

}
