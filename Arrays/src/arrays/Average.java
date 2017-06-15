package arrays;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double average = 0;
		
		System.out.println("Enter grade 1: ");
		double grade1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter grade 2: ");
		double grade2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter grade 3: ");
		double grade3 = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter grade 4: ");
		double grade4 = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter grade 5: ");
		double grade5 = Double.parseDouble(input.nextLine());
		
		average = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
		
		System.out.println("This is the average of the grades: " + average);
	}

}
