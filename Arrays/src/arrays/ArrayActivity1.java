package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;

public class ArrayActivity1 { 
	
	private int[] numbArray;
	
	// 1. Constructs a default array of size 10
	public ArrayActivity1() { 
		numbArray = new int[10];
		numbArray[0] = 1; 
		numbArray[1] = 3; 
		numbArray[2] = 7; 
		numbArray[3] = 19; 
		numbArray[4] = 15; 
		numbArray[5] = 19; 
		numbArray[6] = 7; 
		numbArray[7] = 3; 
		numbArray[8] = 19; 
		numbArray[9] = 48; 
	} 
	
	// 2. Constructs an array of random numbers (0-24) array of size count
	public ArrayActivity1(int count) { 
		Random gen = new Random();
		numbArray = new int[count];
		for (int i = 0; i < count; i++){
			numbArray[i] = gen.nextInt(25);
		}
	} 

	// 3. This method prints all of the elements of the array in list form
	public void display() { 
		for (int i = 0; i < numbArray.length; i++){
			System.out.println(numbArray[i]);
		}
	} 
	
	// 4. This method prints all of the elements in reverse order
	public void displayReverse() { 
		for (int i = numbArray.length-1; i >= 0; i--){
			System.out.println(numbArray[i]);
		}
	} 

	// 5. This method calculates and returns the average of all of the elements 
	// The average of the default array is 14.1
	public double average(){
		double sum = 0;
		for (int i = 0; i < numbArray.length; i++){
			sum += numbArray[i];
		}
		return sum/numbArray.length;
	} 

	// 6. This method returns the maximum value of all of the elements
	// The max of the default array is 48.
	public int findMax() {
		int max = numbArray[0];
		for (int i = 1; i < numbArray.length; i++){
			if (numbArray[i] > max){
				max = numbArray[i];
			}
		}
		return max;

	} 

	// 7. This method returns the index number of the first instance of int lookFor 
	// returns -1 if not in the list 
	// ex. Using the default array findIndex(15) will return 4
	public int linearSearch(int lookFor) {
		for (int i = 0; i < numbArray.length; i++){
			if (numbArray[i] == lookFor){
				return i;
			}
		}
		return -1;
	} 

	
	/**
	 * 8. This method will print the elements and the tally. The list with the 
	 * default constructor will be 
	 * Number Frequency 
	 * 1 1 
	 * 3 2 
	 * 7 2 
	 * 15 1 
	 * 19 3 
	 *  48 1 
	 */
	public void tallyList(){
		int size = numbArray[0];
		for (int x = 0; x < numbArray.length; x++){
			if (numbArray[x] > size){
				size = numbArray[x];
			}
		}
		int [] counter = new int [size] ;
		for (int i = 0; i < numbArray.length; i++) {
		    counter[numbArray[i] - 1]++;
		}

		for (int i = 0; i < counter.length; i++)
			if (counter[i] != 0){
				 System.out.println((i + 1) + "\t" + counter[i]);
			}
	} 
	
	/**
	 * 9. This method will print a column of numbers in the original order, 
	 * a column of numbers in reverse order, and the average of the two. 
	 * default constructor will be 
	 * LIST REVERSE AVERAGE 
	 * 1 48 24.5 
	 * 3 19 11.0 
	 * 3 19 11.0 
	 * 7 19 13.0 
	 * 7 15 11.0 
	 * 15 7 11.0 
	 * 19 7 13.0 
	 * 19 3 11.0 
	 * 19 3 11.0
	 * 48 1 24.5
	 */
	public void listReverseAvg() { 
		int [] list = numbArray;
		
		int [] reverse = new int [numbArray.length];
		int count = 0;
		for (int i = numbArray.length-1; i >= 0; i--){
			reverse[count] = numbArray[i];
			count++;
		}
		
		double [] average = new double [numbArray.length];
		for (int j = 0; j < numbArray.length; j++){
			average[j] = (reverse[j] + list[j])/2.0;
		}
		
		System.out.println("LIST\tREVERSE\tAVERAGE");
		for (int k = 0; k < numbArray.length; k++){
			System.out.println(list[k] + "\t" + reverse[k] + "\t" + average[k]);
		}
		
	} 
	
	// 10. This method will sort the array in ascending order
	public void sort() {
		int temp = 0;
		for (int x = 0; x < numbArray.length; x++){
			for (int y = x; y < numbArray.length; y++){
				if (numbArray[x] > numbArray[y]){
					temp = numbArray[x];
					numbArray[x] = numbArray[y];
					numbArray[y] = temp;
				}
			}
		}
	}
	
	// 11. Binary Search. This method returns the index number of the first instance of int lookFor
	// returns -1 if not in the list.  The Array must be sorted to use the Binary search
	// ex. Using the default array findIndex(15) will return 4
	public int binarySearch(int lookFor) {
		int index = 0;
		int [] sortArray = new int [numbArray.length];
		sort();
		for (int x = 0; x < numbArray.length; x++){
			sortArray[x] = numbArray[x];
		}
		
		int low = 0;
		int high = sortArray.length;
		int count = (low + high)/2;
		while (high != low){
			if (sortArray[count] == lookFor){
				index = count;
				break;
			}
			else if (sortArray[count] > lookFor){
				high = count - 1;
			}
			else if (sortArray[count] < lookFor){
				low = count + 1;
			}
			count = (low + high)/2;
		}
		return index;
	}

	// 12. Write a tester that will create a random array of size 50 and test all pof these methods
	public static void main(String[] args) { 
		ArrayActivity1 tester = new ArrayActivity1();
		
		tester.display();
		System.out.println();
		
		tester.displayReverse();
		System.out.println();
		
		System.out.println(tester.average());
		System.out.println();
		
		System.out.println(tester.findMax());
		System.out.println();
		
		System.out.println(tester.linearSearch(15));
		System.out.println();
		
		tester.tallyList();
		System.out.println();
		
		tester.listReverseAvg();
		System.out.println();
		
		tester.sort();
		tester.display();
		System.out.println();
		
		System.out.println(tester.binarySearch(15));
		System.out.println();
	}
	
}