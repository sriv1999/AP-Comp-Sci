package sevenElevens;
import java.util.Random;
import java.util.Scanner;

public class SevenElevens {
	static double bankroll = 0;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		sevenElevens();
	}
	
	public static void sevenElevens() throws InterruptedException{
		Random gen = new Random();
		int roll = 0;
		int rollPoint = 0;
		int rollPointCounter = 0;
		boolean result = true;
		
		System.out.println("Enter your bankroll: ");
		bankroll = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter your bet: ");
		double bet = Double.parseDouble(input.nextLine());
		
		if (bet > bankroll){
			result = false;
		}
		
		while (result!=true){
			System.out.println("Enter a bet less than your bankroll: ");
			bet = Double.parseDouble(input.nextLine());
			if (bet <= bankroll){
				result = true;
			}
		}
		
		System.out.println("SEVEN ELEVENS!");
		
		System.out.println();
		
		System.out.println("Loading...");
		Thread.sleep(1000);
		
		System.out.println();
		
		System.out.println("Press enter to roll");
		input.nextLine();
		
		roll = gen.nextInt(6)+gen.nextInt(6);
		if (roll == 7 || roll == 11){
			System.out.println("YOU WON!!!");
			bankroll += bet;
			System.out.println("Your bankroll is now: $" + bankroll);
		}
		
		else if (roll == 2 || roll == 3 || roll == 12){
			System.out.println("You lost");
			bankroll -= bet;
			System.out.println("Your bankroll is now: $" + bankroll);
		}
		
		else{
			System.out.println("You are on a player's point");
			Thread.sleep(1000);
			System.out.println("We will roll the dice repeatedly");
			Thread.sleep(1000);
			System.out.println();
			while ((rollPoint != roll) || (rollPoint != 7)){
				rollPointCounter++;
				rollPoint = gen.nextInt(6) + gen.nextInt(6);
				if (rollPoint == roll){
					System.out.println("YOU WON!!!");
					System.out.println("It took " + rollPointCounter + " rolls");
					bankroll += bet;
					System.out.println();
					System.out.println("Your bankroll is now: $" + bankroll);
					break;
				}
				if (rollPoint == 7){
					System.out.println("You lost");
					System.out.println("It took " + rollPointCounter + " rolls");
					bankroll -= bet;
					System.out.println();
					System.out.println("Your bankroll is now: $" + bankroll);
					break;
				}
			}
		}
		System.out.println();
		if (bankroll == 0){
			System.out.println("You have no more money to bet");
			System.out.println("Thank You for playing Seven Eleven!");
			System.exit(0);
		}
		System.out.println("Do you want to play again (Y or N)?");
		if (input.nextLine().equalsIgnoreCase("Y"))
			sevenElevensNew();
		else{
			System.out.println("Thank You for playing Seven Eleven!");
			System.out.println("You leave with $" + bankroll);
			System.exit(0);
		}
	}

	public static void sevenElevensNew() throws InterruptedException{
		Random gen = new Random();
		int roll = 0;
		int rollPoint = 0;
		int rollPointCounter = 0;
		boolean result = true;
		
		System.out.println("Your current bankroll is $" + bankroll);
		
		System.out.println("Enter your bet: ");
		double bet = Double.parseDouble(input.nextLine());
		
		if (bet > bankroll){
			result = false;
		}
		
		while (result!=true){
			System.out.println("Enter a bet less than your bankroll: ");
			bet = Double.parseDouble(input.nextLine());
			if (bet <= bankroll){
				result = true;
			}
		}
		
		System.out.println("SEVEN ELEVENS!");
		
		System.out.println();
		
		System.out.println("Loading...");
		Thread.sleep(1000);
		
		System.out.println();
		
		System.out.println("Press enter to roll");
		input.nextLine();
		
		roll = gen.nextInt(6)+gen.nextInt(6);
		if (roll == 7 || roll == 11){
			System.out.println("YOU WON!!!");
			bankroll += bet;
			System.out.println("Your bankroll is now: $" + bankroll);
		}
		
		else if (roll == 2 || roll == 3 || roll == 12){
			System.out.println("You lost");
			bankroll -= bet;
			System.out.println("Your bankroll is now: $" + bankroll);
		}
		
		else{
			System.out.println("You are on a player's point");
			Thread.sleep(1000);
			System.out.println("We will roll the dice repeatedly");
			Thread.sleep(1000);
			System.out.println();
			while ((rollPoint != roll) || (rollPoint != 7)){
				rollPointCounter++;
				rollPoint = gen.nextInt(6) + gen.nextInt(6);
				if (rollPoint == roll){
					System.out.println("YOU WON!!!");
					System.out.println("It took " + rollPointCounter + " rolls");
					bankroll += bet;
					System.out.println();
					System.out.println("Your bankroll is now: $" + bankroll);
					break;
				}
				if (rollPoint == 7){
					System.out.println("You lost");
					System.out.println("It took " + rollPointCounter + " rolls");
					bankroll -= bet;
					System.out.println();
					System.out.println("Your bankroll is now: $" + bankroll);
					break;
				}
			}
		}
		System.out.println();
		if (bankroll == 0){
			System.out.println("You have no more money to bet");
			System.out.println("Thank You for playing Seven Eleven!");
			System.exit(0);
		}
		System.out.println("Do you want to play again (Y or N)?");
		if (input.nextLine().equalsIgnoreCase("Y"))
			sevenElevensNew();
		else{
			System.out.println("Thank You for playing Seven Eleven!");
			System.out.println("You leave with $" + bankroll);
			System.exit(0);
		}
	}

}
