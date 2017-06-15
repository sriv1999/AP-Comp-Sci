package mathFunctions;

public class Quadratic{
	
	private int a;
	private int b;
	private int c;
	
	public Quadratic(){
		a = 1;
		b = 8;
		c = 16;
	}
	
	public Quadratic(int m, int n, int o){
		a = m;
		b = n;
		c = o;
	}
	
	public boolean discriminant(){
		return (((b*b)-(4*a*c))>=0);
	}
	
	public double root1(){
		return (0 - b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
	}
	
	public double root2(){
		return (0 - b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
	}

	public static void main(String[] args){
		Quadratic one = new Quadratic(1, -10, -24);
		Quadratic two = new Quadratic(1, 4, 5);
		Quadratic three = new Quadratic();
		
		if (one.discriminant()){
			System.out.println("One");
			System.out.println("Root 1: " + one.root1());
			System.out.println("Root 2: " + one.root2());
			System.out.println();
		}
		else{
			System.out.println("One");
			System.out.println("Equation 1 has no real roots");
			System.out.println();
		}
		
		if (two.discriminant()){
			System.out.println("Two");
			System.out.println("Root 1: " + two.root1());
			System.out.println("Root 2: " + two.root2());
			System.out.println();
		}
		else{
			System.out.println("Two");
			System.out.println("Equation 2 has no real roots");
			System.out.println();
		}
		
		if (three.discriminant()){
			System.out.println("Three");
			System.out.println("Root 1: " + three.root1());
			System.out.println("Root 2: " + three.root2());
			System.out.println();
		}
		else{
			System.out.println("Three");
			System.out.println("Equation 3 has no real roots");
			System.out.println();
		}

	}

}
