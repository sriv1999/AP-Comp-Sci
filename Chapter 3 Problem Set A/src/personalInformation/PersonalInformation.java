package personalInformation;

public class PersonalInformation{
	
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public PersonalInformation(){
		name = "Bob";
		address = "123 Birch Drive";
		age = 35;
		phoneNumber = "1234567890";
	}
	
	public PersonalInformation(String n, String a, int ag, String pn){
		name = n;
		address = a;
		age = ag;
		phoneNumber = pn;
	}

	public String getName(){
		return name;
	}

	public void setName(String n){
		name = n;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String a){
		address = a;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int ag){
		age = ag;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setPhoneNumber(String pn){
		phoneNumber = pn;
	}
	
	public String toString(){
		return "Name: "+getName()+"\nAddress: "+getAddress()+"\nAge: "+getAge()+"\nPhone Number: "+getPhoneNumber()+"\n";
	}

	public static void main(String[] args){
		Tester();

	}
	
	public static void Tester(){
		PersonalInformation me = new PersonalInformation("Nikhil", "65 Amherst Way", 16, "6098659594");
		PersonalInformation friend = new PersonalInformation("Sriv", "4 Brentwood Lane", 15, "6097509776");
		PersonalInformation family = new PersonalInformation("Rajesh", "123 Victoria Ct", 40, "6098229666");
		
		System.out.println(me.toString());
		System.out.println(friend.toString());
		System.out.println(family.toString());
		
		System.exit(0);
	}

}
