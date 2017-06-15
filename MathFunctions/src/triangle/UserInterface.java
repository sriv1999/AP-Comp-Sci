package triangle;
import java.text.DecimalFormat;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("###.##");
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Triangle");
		
		System.out.println("What is the x-coordinate of point 1? ");
		double x1 = Double.parseDouble(input.nextLine());
		System.out.println("What is the y-coordinate of point 1? ");
		double y1 = Double.parseDouble(input.nextLine());
		
		System.out.println("What is the x-coordinate of point 2? ");
		double x2 = Double.parseDouble(input.nextLine());
		System.out.println("What is the y-coordinate of point 2? ");
		double y2 = Double.parseDouble(input.nextLine());
		
		System.out.println("What is the x-coordinate of point 3? ");
		double x3 = Double.parseDouble(input.nextLine());
		System.out.println("What is the y-coordinate of point 3? ");
		double y3 = Double.parseDouble(input.nextLine());
		
		System.out.println();
		
		Point x = new Point(x1, y1);
		Point y = new Point(x2, y2);
		Point z = new Point(x3, y3);
		
		Triangle one = new Triangle(x, y, z);
		
		System.out.println("Property\tResult");
		System.out.println("------------------------------");
		
		//length
		System.out.println("Length(1 to 2)\t"+d.format(one.getLength(x, y))+" units");
		System.out.println("Length(2 to 3)\t"+d.format(one.getLength(y, z))+" units");
		System.out.println("Length(1 to 3)\t"+d.format(one.getLength(x, z))+" units");
		
		//angle
		System.out.println("Angle of 1\t"+d.format(one.getAngleA())+" degrees");
		System.out.println("Angle of 2\t"+d.format(one.getAngleB())+" degrees");
		System.out.println("Angle of 3\t"+d.format(one.getAngleC())+" degrees");
		
		//perimeter
		System.out.println("Perimeter\t"+d.format(one.getPerimeter())+" units");
		
		//area
		System.out.println("Area\t\t"+d.format(one.getArea())+" square units");
		
		//circumcenter
		System.out.println("Circumcenter\t"+one.getCircumcenter());
		
		//centroid
		System.out.println("Centroid\t"+one.getCentroid());
		
		//orthocenter
		System.out.println("Orthocenter\t"+one.getOrthocenter());
	}

}
