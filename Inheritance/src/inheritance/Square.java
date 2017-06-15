package inheritance;

public class Square extends Rectangle{
	
	public Square(){
		super(5, 5);
		super.setType("Square");
	}
	
	public Square(double mySide){
		super(mySide, mySide);
		super.setType("Square");
	}
	
	public String toString(){
		return super.toString();
	}
	
	public static void main(String[] args) {
		Square a = new Square(7);
		System.out.println(a);
		System.out.println("SIDES: " + a.getSides());

	}

}
