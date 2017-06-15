package triangle;

import java.text.DecimalFormat;

public class Triangle {
	
	DecimalFormat d = new DecimalFormat("###.##");
	
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point x, Point y, Point z){
		a = x;
		b = y;
		c = z;
	}
	
	public double getLength(Point one, Point two){
		return Math.sqrt(Math.pow(one.getX() - two.getX(), 2) + Math.pow(one.getY() - two.getY(), 2));
	}

	public double getSlope(Point one, Point two){
		return (one.getY()-two.getY())/(one.getX()-two.getX());
	}
	
	public double getAngleA(){
		double A = getLength(b, c);
		double B = getLength(a, c); 
		double C = getLength(a, b);
		
		return Math.toDegrees(Math.acos((-(A*A)+(B*B)+(C*C))/(2*B*C)));
	}
	
	public double getAngleB(){
		double A = getLength(b, c);
		double B = getLength(a, c);
		double C = getLength(a, b);
		
		return Math.toDegrees(Math.acos(((A*A)-(B*B)+(C*C))/(2*A*C)));
	}
	
	public double getAngleC(){
		double A = getLength(b, c);
		double B = getLength(a, c);
		double C = getLength(a, b);
		
		return Math.toDegrees(Math.acos(((A*A)+(B*B)-(C*C))/(2*A*B)));
	}
	
	public double getPerimeter(){
		return getLength(a, b) + getLength(b, c) + getLength(c, a);
	}
	
	public double getArea(){
		double s = getPerimeter()/2.0;
		return Math.sqrt(s*(s - getLength(a, b))*(s - getLength(b, c))*(s - getLength(c, a)));
	}
	
	public String getCircumcenter(){
		//midpoints
		double midAX = (Math.abs(b.getX()-c.getX()))/2.0;
		double midAY = (Math.abs(b.getY()-c.getY()))/2.0;
		
		double midBX = (Math.abs(a.getX()-c.getX()))/2.0;
		double midBY = (Math.abs(a.getY()-c.getY()))/2.0;
		
		//negative reciprocal of slope
		double slopeA = -1 / getSlope(b, c);
		double slopeB = -1 / getSlope(a, c);
		
		//y-intercept
		double AYInt = midAY - slopeA * midAX;
		double BYInt = midBY - slopeB * midBX;
		
		//x and y of circumcenter
		double y = (AYInt - BYInt) / (slopeB - slopeA);
		double x = (slopeA * y) + AYInt;
		
		return "(" + d.format(x) + ", " + d.format(y) + ")";
	}
	
	public String getCentroid(){
		double x = (a.getX() + b.getX() + c.getX())/3.0;
		double y = (a.getY() + b.getY() + c.getY())/3.0;
		
		return "(" + d.format(x) + ", " + d.format(y) + ")";
	}
	
	public String getOrthocenter(){
		//slope
		double slopeA = -1 / getSlope(b, c);
		double slopeB = -1 / getSlope(a, c);
		
		//y-intercept
		double AYInt = a.getY() - slopeA * a.getX();
		double BYInt = b.getY() - slopeB * b.getX();
		
		//x and y of circumcenter
		double x = (AYInt - BYInt) / (slopeB - slopeA);
		double y = (slopeA * x) + AYInt;				
		
		return "(" + d.format(x) + ", " + d.format(y) + ")";
	}
	
	public static void main(String[] args) {
		TriangleTester();

	}
	
	public static void TriangleTester(){
		Point x = new Point(1,5);
		Point y = new Point (-2, -6);
		Point z = new Point (3, 7);
		Triangle one = new Triangle(x, y, z);
		
		//Lengths
		System.out.println(one.getLength(x, y)+" units");
		System.out.println(one.getLength(y, z)+" units");
		System.out.println(one.getLength(x, z)+" units");
		
		//Angles
		System.out.println(one.getAngleA()+" degrees");
		System.out.println(one.getAngleB()+" degrees");
		System.out.println(one.getAngleC()+" degrees");
		
		//Perimeter
		System.out.println(one.getPerimeter()+" units");
		
		//Area
		System.out.println(one.getArea()+" square units");
		
		//Circumcenter
		System.out.println(one.getCircumcenter());
		
		//Centroid
		System.out.println(one.getCentroid());
		
		//Orthocenter
		System.out.println(one.getOrthocenter());
	}

}
