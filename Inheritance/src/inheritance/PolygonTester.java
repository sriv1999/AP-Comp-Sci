package inheritance;

public class PolygonTester {

	public static void main(String[] args) {
		/*RightTriangle a = new RightTriangle(3, 4);
		System.out.println(a);*/
		
		Polygon bubble = new Rectangle(2, 2);
		System.out.println(bubble);

		Rectangle b = new Rectangle(1, 1);
		System.out.println(b);
		
		/*Square c = new Square(5);
		System.out.println(c);
		
		RegularNgon d = new Regulargon(5, 8);
		System.out.println(d);
		
		Polygon [] shapes = new Polygon[4];
		shapes[0] = a;
		shapes[1] = b;
		shapes[2] = c;
		shapes[3] = d;
		
		double total = 0;
		for (Polygon x : shapes){
			System.out.println("TYPE: " + x.getType() + " AREA: " + x.getArea());
			total += x.getArea();
		}
		System.out.println("Total Area: " + total);*/
	}

}
