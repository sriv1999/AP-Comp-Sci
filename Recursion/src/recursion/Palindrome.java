package recursion;

public class Palindrome {
	
	public static boolean isPalindrome(String s){
		s = s.toLowerCase();
		s = s.replaceAll("\\W", "");
		
		if (s.charAt(0) != s.charAt(s.length()-1)){
			return false;
		}
		else if (s.length() <= 1){
			return true;
		}
		s = s.substring(1, s.length() - 1);
		return isPalindrome(s);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal - Panama!"));
		//System.out.println(isPalindrome2("A man, a plan, a canal - Panama!"));
	}

}
