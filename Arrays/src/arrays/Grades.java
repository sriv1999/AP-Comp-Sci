package arrays;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double average = 0;
		
		System.out.println("How many grades would you like to enter? ");
		int size = Integer.parseInt(input.nextLine());
		
		double [] grade = new double[size];
		
		for (int count = 0; count < size; count++){
			System.out.println("Enter grade " + (count+1) + ": ");
			grade[count] = Double.parseDouble(input.nextLine());
		}
		
		for (int i = 0; i < size; i++){
			average += grade[i];
		}
		
		average /= size;
		
		System.out.println("This is the average of the grades: " + average);
	}

}
