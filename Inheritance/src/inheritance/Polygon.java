package inheritance;

public abstract class Polygon {

	private int sides;
	private String type;
	
	public Polygon(){
		sides = 3;
		type = "Triangle";
	}
	
	public Polygon(int mySides, String myType){
		sides = mySides;
		type = myType;
	}

	public int getSides() {
		return sides;
	}

	public String getType() {
		return type;
	}

	public void setType(String newType) {
		type = newType;
	}
	
	public String toString(){
		return "POLYGON: " + getType() + "\nSIDES: " + getSides() +
				"\nPERIMETER: " + getPerimeter() + "\nAREA: " + getArea();
	}
	
	abstract double getPerimeter();
	abstract double getArea();
	
	public static void main(String [] args){
		/*Polygon a = new Polygon(4, "Rectangle");
		System.out.println(a);*/
	}
}
