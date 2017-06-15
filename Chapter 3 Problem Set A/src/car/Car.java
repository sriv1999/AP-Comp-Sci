package car;
import java.util.*;

public class Car {

	private int yearModel;
	private String make;
	private int speed;
	
	public Car(){
		
	}
	
	public Car(int y, String m){
		yearModel = y;
		make = m;
		speed = 0;
	}
	
	public int getYearModel() {
		return yearModel;
	}

	public String getMake() {
		return make;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void accelerate(){
		speed += 5;
	}
	
	public void brake(){
		speed -= 5;
	}
	
	public String toString(){
		return "The current speed of " + getYearModel() + " " + getMake() +" is " + getSpeed() + " mph.";
	}

	public static void main(String[] args) throws InterruptedException {
		CarTester();

	}
	
	public static void CarTester() throws InterruptedException{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Car");
		System.out.println("What is the model year of your car? ");
		int year = Integer.parseInt(input.nextLine());
		
		System.out.println("What is the make of your car? ");
		String make = input.nextLine();
		
		Car bob = new Car(year, make);
		
		for(int count = 1; count <= 5; count++){
			bob.accelerate();
			System.out.println(bob.toString());
			Thread.sleep(1000);
		}
		
		for(int count = 1; count <= 5; count++){
			bob.brake();
			System.out.println(bob.toString());
			Thread.sleep(1000);
		}
		
	}

}
