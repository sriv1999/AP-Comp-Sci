package stringfuncts;
import java.util.Random;

public class StringFuncts {

	public static String getEmail(String first, String last) { 
		return first + "." + last + "@ww-p.org";
	}

	public static String getInitials(String first, String last) {
		return first.substring(0, 1) + "." + last.substring(0, 1) + ".";
	}

	public static String getYear(String bday) { 
		return bday.substring(4);
	}

	public static String getUserName(String first, String last) { 
		return first.substring(0, 4) + last.substring(last.length()-4);
	} 

	public static String getFirst(String fullName) { 
		String[] parts = fullName.split(" ");
		return parts[0];
	} 

	public static String getLast(String fullName) { 
		String[] parts = fullName.split(" ");
		return parts[1];
	} 

	public static String getRandomWord() {
		String word = "";
		Random rand = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int counter = 0; counter < 4; counter++){
			word += alphabet.charAt(rand.nextInt(alphabet.length()));
		}
		
		return word;
	}

	public static String everyOtherLetter(String word) {
		String newWord = "";
		
		for (int counter = 0; counter < word.length(); counter+=2){
			newWord += word.charAt(counter);
		}
		
		return newWord;
	} 

	public static String reverse(String word) {
		String newWord = "";
		for (int counter = word.length(); counter > 0; counter--){
			newWord += word.charAt(counter-1);
		}
		return newWord;
	}  

	public static Boolean checkDigit(String creditCard) {
		int firstDigit = Character.getNumericValue(creditCard.charAt(0));
		int lastDigit = Character.getNumericValue(creditCard.charAt(creditCard.length()-1));

		return (firstDigit+lastDigit) % 5 == 0;
	} 

	public static String everyOtherLetterCaps(String word) {
		String newWord = "";
		for (int counter = 0; counter < word.length(); counter++){
			String letter = word.charAt(counter) + "";
			if (counter%2 == 0)
				newWord += letter;
			else
				newWord += letter.toUpperCase();
		}
		return newWord;
	} 

	public static String replaceIsWith8s(String word){ 
		String newWord = "";
		for (int counter = 0; counter < word.length(); counter++){
			String letter = word.charAt(counter) + "";
			if (letter.equalsIgnoreCase("i"))
				newWord += "8";
			else
				newWord += letter;
		}
		return newWord;
	} 

	public static void main(String[] args) { 
		System.out.println("1. Email: " + getEmail("Mister", "Scarpitta")); 
		System.out.println("2. Initials: " + getInitials("Mister", "Scarpitta")); 
		System.out.println("3. Year: " + getYear("01021916")); 
		System.out.println("4. UserName: " + getUserName("Mister", "Scarpitta")); 
		System.out.println("5. FirstName: " + getFirst("Mister Scarpitta")); 
		System.out.println("6. LastName: " + getLast("Mister Scarpitta")); 
		System.out.println("7. RandomWord: " + getRandomWord()); 
		System.out.println("8. EveryOtherLetter: " + everyOtherLetter("encyclopedias")); 
		System.out.println("9A. Reverse: " + reverse("Philadelphia")); 
		System.out.println("9B. Reverse: " + reverse("JAVA")); 
		System.out.println("10A. CheckDigit: " + checkDigit("123456")); 
		System.out.println("10B. CheckDigit: " + checkDigit("123456789")); 
		System.out.println("11. EveryOtherCaps: "+ everyOtherLetterCaps("misterscarpitta")); 
		System.out.println("12. Replaces I's with 8's: " + replaceIsWith8s("WilliamScarpitta")); 
	}

}