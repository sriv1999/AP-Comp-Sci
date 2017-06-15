package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */

	public static void main(String[] args) {
		Card one = new Card("Ace", "Clubs", 1);
		Card two = new Card("Ace", "Clubs", 1);
		Card three = new Card("6", "Hearts", 6);
		
		System.out.println("**** ace of clubs #1 Tests ****");
		System.out.println("rank: " + one.rank());
		System.out.println("suit: " + one.suit());
		System.out.println("pointValue: " + one.pointValue());
		System.out.println("toString: " + one);
		System.out.println();
		
		System.out.println("**** ace of clubs #2 Tests ****");
		System.out.println("rank: " + two.rank());
		System.out.println("suit: " + two.suit());
		System.out.println("pointValue: " + two.pointValue());
		System.out.println("toString: " + two);
		System.out.println();
		
		System.out.println("**** 6 of hearts Tests ****");
		System.out.println("rank: " + three.rank());
		System.out.println("suit: " + three.suit());
		System.out.println("pointValue: " + three.pointValue());
		System.out.println("toString: " + three);
		System.out.println();
		
		System.out.println("**** matches Tests ****");
		System.out.println("matching: " + one.matches(two));
		System.out.println("not matching: " + two.matches(three));
	}
}
