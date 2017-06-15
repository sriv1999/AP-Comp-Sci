package pet;
import java.util.*;
public class Pet {

	private String name;
	private String type;
	private int age;
	
	public Pet(){
		name = "Bob";
		type = "Dog";
		age = 100;
	}
	
	public Pet(String n, String t, int a){
		name = n;
		type = t;
		age = a;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getType() {
		return type;
	}

	public void setType(String t) {
		type = t;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public static void main(String[] args) {
		petTester();
	}
	
	public static void petTester(){
		Scanner kb = new Scanner(System.in);

		System.out.println("What is your pet's name? ");
		String name = kb.nextLine();
		
		System.out.println("What type of pet do you have? ");
		String type = kb.nextLine();
		
		System.out.println("What is the age of your pet? ");
		int age = Integer.parseInt(kb.nextLine());
		
		Pet one = new Pet(name, type, age);
		
		System.out.println("Name: "+one.getName());
		System.out.println("Type: "+one.getType());
		System.out.println("Age: "+one.getAge());
		
		System.exit(0);
	}

}
