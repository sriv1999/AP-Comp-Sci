package stats;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Stats {
	
	private static int [] myData = new int[1000];
	private int myHowMany;
	
	public Stats(String fileName){
		myHowMany = 0;
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

	public double average(){
		long sum = 0;
		for (int i = 0; i < myData.length; i++){
			sum += myData[i];
		}
		
		return sum/myData.length;
	}

	public double stdDev(){
		int standDev = 0;
		for (int i = 0; i < myData.length; i++){
		    standDev += Math.pow(myData[i] - average(), 2);
		}
		standDev /= myData.length-1;
		return Math.sqrt(standDev);
	}

	private int findLargest(int[] scores){
		int max = scores[0];
		for (int i = 1; i < scores.length; i++){
			if (scores[i] > max){
				max = scores[i];
			}
		}
		return max;

	}
	
	public int linearSearch(int lookFor, int [] numbArray) {
		for (int i = 0; i < numbArray.length; i++){
			if (numbArray[i] == lookFor){
				return i;
			}
		}
		return -1;
	} 

	public void findMode(){
		int [] smallList = new int [myData.length];
		for (int i = 0; i < myData.length; i++){
			smallList[myData[i]]++;
		}
		System.out.println("Mode: " + linearSearch(findLargest(smallList), smallList) + " with " + findLargest(smallList)
							+ " occurrences");
	}
	
	
	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("00.00");
		Stats tester = new Stats("H:/Files/numbers.txt");
		
		System.out.println(d.format(tester.average()));
		System.out.println();
		
		System.out.println(d.format(tester.stdDev()));
		System.out.println();
		
		System.out.println(tester.findLargest(myData));
		System.out.println();
		
		tester.findMode();
	}

}