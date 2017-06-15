package recursion;

public class RecursionFunOne {

	public static int countOddDigits(int num) {
		if (num / 10 == 0){
			if (num % 2 == 1)
				return 1;
			return 0;
		}
		if (num % 10 % 2 == 1){
			return 1 + countOddDigits(num / 10);
		}
		return countOddDigits(num / 10);
	}
	
	public static void main(String[] args) {
		System.out.println(RecursionFunOne.countOddDigits(1337778));

	}

}
