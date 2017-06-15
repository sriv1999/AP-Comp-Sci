package arrays;

public class ArrayActivity3 {
	
	public static void display(int [] numbArray) { 
		for (int i = 0; i < numbArray.length; i++){
			System.out.println(numbArray[i]);
		}
	}
	
	public static void displayString(String [] stringArray){
		for (int i = 0; i < stringArray.length; i++){
			System.out.println(stringArray[i]);
		}
	}
	
	public static int [] createOddArray(){
		int [] odd = new int [100];
		int count = 1;
		for (int i = 0; i < 100; i++){
			odd[i] = count;
			count += 2;
		}
		return odd;
	}
	
	public static int avgSalary(int [] salary){
		int sum = 0;
		for (int i = 0; i < salary.length; i++){
			sum += salary[i];
		}
		return sum/salary.length;
	}
	
	public static String [] reverseArray(String [] name){
		String [] reverse = new String [name.length];
		int count = 0;
		for (int i = name.length-1; i >= 0; i--){
			reverse[count] = name[i];
			count++;
		}
		return reverse;
	}
	
	public static void posAndNeg(int [] numbers){
		int [] pos = new int [numbers.length];
		int [] neg = new int [numbers.length];
		
		int countPos = 0;
		int countNeg = 0;
		
		for (int i = 0; i < numbers.length; i++){
			if (numbers[i] > 0){
				pos[countPos] = numbers[i];
				countPos++;
			}
			else if (numbers[i] < 0){
				neg[countNeg] = numbers[i];
				countNeg++;
			}
		}
		
		for (int j = 0; j < pos.length; j++){
			if (pos[j] != 0){
				System.out.print(pos[j] + " ");
			}
			else{
				break;
			}
		}
		
		System.out.println();
		
		for (int k = 0; k < neg.length; k++){
			if (neg[k] != 0){
				System.out.print(neg[k] + " ");
			}
			else{
				break;
			}
		}
	}

	public static void main(String[] args) {
		display(createOddArray());
		
		System.out.println();
		
		int [] salary = new int [] {10, 15, 100, 24, 36, 200, 750, 1000, 26};
		System.out.println(avgSalary(salary));
		
		System.out.println();
		
		String [] name = new String [] {"apple", "banana", "kiwi", "lemon", "lime", "mango"};
		displayString(reverseArray(name));
		
		System.out.println();
		
		int [] numbers = new int [] {-1, 3, 4, -5, -24, 36, -400, 1000};
		posAndNeg(numbers);
	}

}
