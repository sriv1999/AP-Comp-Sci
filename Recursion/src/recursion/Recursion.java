package recursion;

public class Recursion {
	
	public static String reverse(String s){
		if (s.length() == 0)
			return "";
		return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
	}

	public static int factorial(int num){
		if (num == 1){
			return num;
		}
		return num * factorial(num-1);
	}
	
	public static int sumInt(int num){
		if (num == 1){
			return num;
		}
		return num + sumInt(num-1);
	}
	
	public static int power2(int exp){
		if (exp == 1){
			return 2;
		}
		return 2 * power2(exp-1);
	}
	
	public static int areaSquare(int side){
		return factorial(side-1) + (side-1) + 1;
	}
	
	public static int mult5s(int num){
		if (num == 1){
			return 5;
		}
		return 5*num + mult5s(num-1);
	}
	
	public static double birthdayGift(int years){
		if (years == 1){
			return 1;
		}
		return (Math.pow(2, years-1)) + birthdayGift(years-1);
	}
	
	public static double birthdayGiftYear(int years){
		return Math.pow(2,  years-1);
	}
	
	public static void main(String[] args) {
		/*System.out.println(reverse("PHASE"));
		System.out.println();
		
		System.out.println(factorial(5));
		System.out.println();
		
		System.out.println(sumInt(3));
		System.out.println();
		
		System.out.println(power2(10));
		System.out.println();
		
		System.out.println(areaSquare(5));
		System.out.println();*/
		
		System.out.println(mult5s(10));
		System.out.println();
		
		System.out.println("On year 25: $" + birthdayGiftYear(25)/100.0);
		System.out.println("Total: $" + birthdayGift(25)/100.0);
		System.out.println();
		
	}

}
