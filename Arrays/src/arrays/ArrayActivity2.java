package arrays;

import java.util.Random;

public class ArrayActivity2 {
	
	public void display(int [] numbArray) { 
		for (int i = 0; i < numbArray.length; i++){
			System.out.println(numbArray[i]);
		}
	} 
	
	public static void createRandomArray(){
		Random gen = new Random();
		int [] newArray = new int[75];
		int tempGen = 0;
		for (int i = 0; i < 75; i++){
			tempGen = gen.nextInt(2001);
			if (tempGen < 2000 && tempGen > 1000){
				newArray[i] = gen.nextInt();
			}
			else{
				i--;
			}
		}
		
		int even = 0;
		int odd = 0;
		for (int j = 0; j < newArray.length; j++){
			if(newArray[j]%2 == 0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);
	}

	public static void main(String[] args) {
		createRandomArray();

	}

}
