package mathFunctions;
import java.awt.Point;
import java.util.Random;

public class MathFunctions {

	public static int distance(int a, int b) {
		return Math.abs(a-b);
	}
	
	public static int maximum(int a, int b) {
		return Math.max(a, b);
	}

	public static double maximum(double a, double b, double c) {
		return Math.max(a, Math.max(b,  c));
	}

	public static int getRandomClass() {
		return 9 + (int)(Math.random()*4); 
	}

	public static double sphereSurfaceArea(int radius) {
		return 4*Math.PI*radius*radius;
	} 

	public static double sphereVolume(int radius) {
		return (4.0/3)*Math.PI*Math.pow(radius, 3);
	} 

	public static double hypotenuse(double leg1, double leg2) {
		return Math.sqrt(leg1*leg1 + leg2*leg2);
	}

	public static double segmentLength(Point a, Point b) {
		return Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
	}

	public static double getSmallestAngleOfRightTri(double leg1, double leg2) {
		return Math.toDegrees(Math.asin(Math.min(leg1, leg2)/hypotenuse(leg1, leg2)));
	}

	public static void main(String[] args){ 
		System.out.println("1. DISTANCE: " + distance(-5, 8));
		System.out.println("2. MAX: " + maximum(-5, 8));
		System.out.println("3. MAX: " + maximum(-5, -8, -2));
		System.out.println("4. Random HS Class: " + getRandomClass());
		System.out.println("5. Sphere Surface Area: " + sphereSurfaceArea(9) + " sq. units");
		System.out.println("6. Sphere Volume: " + sphereVolume(2) + " cubic units");
		System.out.println("7. Hypotenuse: " + hypotenuse(7, 9));
		System.out.println("8. Segment Length: " + segmentLength(new Point(1, 3), new Point(-2, 7)));
		System.out.println("9. Smallest Acute Angle: " + getSmallestAngleOfRightTri(5, 7));
	}
}