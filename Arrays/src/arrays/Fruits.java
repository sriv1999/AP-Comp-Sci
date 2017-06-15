package arrays;

public class Fruits {
	
	private static String [] bowl;
	
	public Fruits(){
		bowl = new String[10];
		//bowl = new String [] {"apple", "banana", "kiwi", "lemon", "lime", "mango"};
		bowl[0] = "apple";
		bowl[1] = "banana";
		bowl[2] = "kiwi";
		bowl[3] = "lemon";
		bowl[4] = "lime";
		bowl[5] = "mango";
		bowl[6] = "orange";
		bowl[7] = "pear";
		bowl[8] = "pineapple";
		bowl[9] = "plum";
	}
	
	public void display(){
		for (int i = 0; i < bowl.length; i++){
			System.out.println(bowl[i]);
		}
	}
	
	public void display2(){
		for (String x : bowl){
			System.out.println(x);
		}
	}
	
	public void displayEveryOther(){
		for (int i = 0; i < bowl.length; i+=2){
			System.out.println(bowl[i]);
		}
	}

	public void displayReverseOrder(){
		for (int i = bowl.length-1; i >= 0; i--){
			System.out.println(bowl[i]);
		}
	}
	
	public void displayMostLetters(){
		String choice = "";
		for (int i = 0; i < bowl.length; i++){
			if (bowl[i].length() > choice.length()){
				choice = bowl[i];
			}
		}
		System.out.println(choice);
	}
	
	public void replace(String a, String b){
		for (int i = 0; i < bowl.length; i++){
			if (bowl[i] == a){
				bowl[i] = b;
				break;
			}
		}
	}
	
	public void remove(String a){
		boolean result = false;
		for (int x = 0; x < bowl.length; x++){
			if (bowl[x] == a){
				result = true;
			}	
		}
		if (!result){
			System.out.println();
			System.out.println("Not in List!");
			System.out.println("Could Not Remove!");
			return;
		}
		String [] temp = new String [bowl.length-1];
		for (int i = 0; i < bowl.length; i++){
			if (bowl[i] != a){
				temp[i-1] = bowl[i];
			}
		}
		bowl = temp;
	}
	
	public void insert(String a){
		String [] temp = new String [bowl.length+1];
		int index = 0;
		if (bowl[0].compareToIgnoreCase(a) >= 0){
			temp[0] = a;
			for (int i = 1; i < temp.length; i++){
				temp[i] = bowl[i-1];
			}
			bowl = temp;
			return;
		}
		for (int x = 0; x < bowl.length; x++){
			if (bowl[x].compareToIgnoreCase(a) >= 0){
				index = x;
				break;
			}
		}
		temp[index-1] = bowl[index-1];
		temp[index] = a;
		for (int y = index+1; y < temp.length; y++){
			temp[y] = bowl[y-1];
		}
		
		for (int i = 0; i < index-1; i++){
			temp[i] = bowl[i];
		}
		bowl = temp;
	}
	
	public static void main(String[] args) {
		/*Fruits tester1 = new Fruits();
		tester1.display();*/
		
		/*Fruits tester2 = new Fruits();
		tester2.display2();*/
		
		/*Fruits tester3 = new Fruits();
		tester3.displayEveryOther();*/
		
		/*Fruits tester4 = new Fruits();
		tester4.displayReverseOrder();*/
		
		/*Fruits tester5 = new Fruits();
		tester5.displayMostLetters();*/
		
		/*Fruits tester6 = new Fruits();
		tester6.display();
		tester6.replace("lime", "lychee");
		System.out.println();
		tester6.display();*/
		
		/*Fruits tester7 = new Fruits();
		tester7.display();
		tester7.remove("apple");
		System.out.println();
		tester7.display();*/
		
		Fruits tester8 = new Fruits();
		tester8.display();
		tester8.insert("aardvark fruit");
		System.out.println();
		tester8.display();
	}

}
