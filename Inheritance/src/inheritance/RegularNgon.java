package inheritance;

public class RegularNgon extends Polygon{
	
	private int side;
	private double length;
	
	public RegularNgon(){
		super(10, "RegularNgon");
		side = 10;
		length = 25;
	}
	
	public RegularNgon(int mySide, double myLength){
		super(mySide, "RegularNgon");
		side = mySide;
		length = myLength;
	}

	public int getSide() {
		return side;
	}

	public double getLength() {
		return length;
	}

	public double getArea(){
		return (side*length) / (4*Math.tan(Math.PI/side));
	}
	
	public double getPerimeter(){
		return side*length;
	}
	
	public String toString(){
		return super.toString() + "\nSIDES: " + getSide() + "\nLENGTH: " + getLength();
	}
	
	public static void main(String[] args) {
		RegularNgon a = new RegularNgon(30, 12);
		System.out.println(a);

	}

}
