package sodaCan;

public class SodaCan{

	private double height;
	private double radius;
	private static final double PI = 3.141592;
	
	public SodaCan(){
		height = 10;
		radius = 4;
	}
	
	public SodaCan(double h, double r){
		height = h;
		radius = r;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}
	
	public double getSurfaceArea(){
		return (2*PI*radius*radius) + (2*PI*radius*height);
	}
	
	public double getVolume(){
		return 2*PI*radius*radius*height;
	}

	public static void main(String[] args){
		sodaCanTester();
	}
	
	public static void sodaCanTester(){
		SodaCan pizza = new SodaCan(12.5, 15.75);
		System.out.println("Radius: "+pizza.getRadius());
		System.out.println("Height: "+pizza.getHeight());
		System.out.println("Surface Area: "+pizza.getSurfaceArea());
		System.out.println("Volume: "+pizza.getVolume());
		
		System.exit(0);
	}

}
