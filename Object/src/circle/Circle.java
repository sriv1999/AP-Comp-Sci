package circle;

public class Circle {

	private double radius;
	private static final double PI = 3.141592;
	
	public Circle(){
		radius = 10;
	}
	
	public Circle(double r){
		radius = r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double rad){
		radius = rad;
	}
	
	public double getArea(){
		return PI*radius*radius;
	}
	
	public double getDiameter(){
		return radius*2;
	}
	
	public double getCircumference(){
		return PI*getDiameter();
	}
	
	public String toString(){
		return "Circle \nRadius: " + getRadius() + "\nArea: " + getArea() + 
				"\nCircumference: " + getCircumference();
	}
	
	public static void main(String[] args) {
		Circle one = new Circle();
		System.out.println(one.toString());

	}

}
