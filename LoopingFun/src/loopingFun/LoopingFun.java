package loopingFun;
import java.util.Random;

public class LoopingFun {
	
	public static String printFactors(int n){
		String factors = "";
		for (int count = 1; count <= n; count++){
			if (n%count == 0)
				factors += (count + " ");
		}
		return factors;
	}
	
	public static int sumInts(int n){
		int sum = 0;
		for (int count = n; count > 0; count--){
			sum += count;
		}
		return sum;
	}
	
	public static long factorial(int n){
		long factorial = 1;
		for (int count = n; count > 0; count--){
			factorial *= count;
		}
		return factorial;
	}
	
	public static boolean isEven(int n){
		return (n%2 == 0);
	}
	
	public static boolean isPrime(int n){
		String[] parts = printFactors(n).split(" ");
		return (parts.length == 2);
	}
	
	public static int lcm(int a, int b){
		int lcm = 0;
		for (int count = Math.max(a, b); count <= a*b; count++){
			if ((count%a == 0) && (count%b == 0)){
				lcm = count;
				break;
			}
		}
		return lcm;
	}
	
	public static int gcf(int a, int b){
		int gcf = 0;
		for (int count = Math.min(a, b); count > 0; count--){
			if ((a%count == 0) && (b%count == 0)){
				gcf = count;
				break;
			}
		}
		return gcf;
	}
	
	public static void primeNumberList(int n){
		String primeNumList = "";
		for (int count = 0; count <= n; count++){
			if (isPrime(count))
				primeNumList += count + " ";
		}
		System.out.println(primeNumList);
	}
	
	public static int reverseNum(int n){
		int reverseNum = 0;
		while( n != 0 ){
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + n%10;
	         n = n/10;
		}
		return reverseNum;
	}
	
	public static void coinTrials(int n){
		Random gen = new Random();
		int heads = 0;
		int tails = 0;
		for (int count = 0; count < n; count++){
			if (gen.nextInt(3) == 0)
				heads++;
			else
				tails++;
		}
		System.out.println("Heads: " + heads + "\nTails: " + tails);
	}
	
	public static int countDigits(int n){
		String number = n + "";
		return number.length();
	}
	
	public static void fibonacci(int n){
		if (n == 0){
			System.out.println("");
	    } 
		else if (n == 1){
			System.out.println("1");
	    } 
		else{
			System.out.print("1 ");
			int a = 0;
			int b = 1;
			for (int i = 1; i < n; i++){
				int nextNumber = a + b;
				System.out.print(nextNumber + " ");
				a = b;
				b = nextNumber;
	        }
	    }
	}
	
	public static boolean isPerfect(int n){
		int sum = 0;
		for (int count = 1; count <= n/2; count++){
			if (n%count == 0)
				sum += count;
		}
		return (sum == n);
	}
	
	public static void primeFactorization(int n){
		for (int count = 2; count*count <= n; count++) {
			while (n % count == 0) {
				System.out.print(count + " "); 
				n = n / count;
            }
		}
		if (n > 1) 
			System.out.println(n);
        else       
        	System.out.println();
	}
	
	public static void binary(int n){
		int binary[] = new int[25];
        int index = 0;
        while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
	}
	
	public static void pyramid(int n){
		int spaces = n-1;
		int stars = 1;
		for (int count = 0; count < n; count++){
			for (int x = 0; x < spaces; x++){
				System.out.print(" ");
			}
			for (int y = 0; y < stars + count; y++){
				System.out.print("*");
			}
			spaces--;
			stars++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		//print factors
		System.out.println("Factors: " + printFactors(12));
		
		System.out.println();
		
		//sum integers from 1 to number inclusive
		System.out.println("Sum: " + sumInts(5));
		
		System.out.println();

		//factorial
		System.out.println("Factorial: " + factorial(3));
		
		System.out.println();
		
		//check evenness
		System.out.println("Even Check: " + isEven(5));
		
		
		System.out.println();
		
		//check primeness
		System.out.println("Prime Check: " + isPrime(23));
		
		System.out.println();
		
		//least common multiple (lcm)
		System.out.println("LCM: " + lcm(9, 12));
		
		System.out.println();
		
		//greatest common multiple (gcf)
		System.out.println("GCF: " + gcf(24, 6));
		
		System.out.println();
		
		//prime number list for given number n
		System.out.println("Prime Number List:");
		primeNumberList(100);
		
		System.out.println();
		
		//returns reverse of number
		System.out.println("Reverse Number: " + reverseNum(100));
		
		System.out.println();
		
		//returns random coin trial
		System.out.println("Coin Trials: ");
		coinTrials(100);
		
		System.out.println();
		
		//returns number of digits in a number
		System.out.println("Count Digits: " + countDigits(123456789));
		
		System.out.println();
		
		//fibonacci sequence
		System.out.println("Fibonacci: ");
		fibonacci(7);
		
		System.out.println();
		System.out.println();
		
		//check for perfect number
		System.out.println("Perfect Number: " + isPerfect(28));
		
		System.out.println();
		
		//returns prime factorization of a number
		System.out.println("Prime Factorization: ");
		primeFactorization(123);
		
		System.out.println();
		
		//pyramid drawing
		System.out.println("Binary: "); 
		binary(100);
		
		System.out.println();
		System.out.println();
		
		//pyramid drawing
		System.out.println("Pyramid: ");
		pyramid(10);
	}

}
