package compact;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Compact {

	private static int [] myData = new int[1000];
	
	public Compact(String fileName){
		loadFile(fileName);
	}

	public void loadFile(String fileName){
		File file = new File(fileName);
		
		try {
			Scanner inFile = new Scanner(file);
			int index = 0;
			while (inFile.hasNext()){
				myData[index] = inFile.nextInt();
				index++;
			}
		}

		catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File is in the wrong directory");
		}
	}
	
	public void removeZero(){
		for (int i = 0; i < myData.length; i++){
			if (myData[i] == 0){
				remove(0);
			}
		}
		
	}
	
	public void remove(int a){
		boolean result = false;
		for (int x = 0; x < myData.length; x++){
			if (myData[x] == a){
				result = true;
			}	
		}
		if (!result){
			System.out.println();
			System.out.println("Not in List!");
			System.out.println("Could Not Remove!");
			return;
		}
		int [] temp = new int [myData.length-1];
		int count = 0;
		for (int i = 0; i < myData.length; i++){
			if (myData[i] != a){
				temp[count] = myData[i];
				count++;
			}
		}
		myData = temp;
	}
	
	public void display() { 
		for (int i = 0; i < myData.length; i++){
			if (myData[i] == 0){
				break;
			}
			System.out.println(myData[i]);
		}
	} 
	
	public static void main(String[] args) {
		Compact tester = new Compact("H:/Files/compact.txt");
		tester.removeZero();
		System.out.println("OUTPUT");
		tester.display();
		
	}

}
