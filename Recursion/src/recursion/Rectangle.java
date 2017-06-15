package recursion;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}

	public int getArea() {
		if (width == 1) {
			return height;
		} 
		else {
			Rectangle smallerRect = new Rectangle(width - 1, height);
			return smallerRect.getArea() + height;
		}
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2, 3);
		Rectangle r2 = new Rectangle(14, 10);

		System.out.println(r1.getArea());
		System.out.println("Expected: 6");
		System.out.println(r2.getArea());
		System.out.println("Expected: 140");
	}

}
