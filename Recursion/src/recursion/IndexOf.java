package recursion;

public class IndexOf {
	
	public static int indexOf(String text, String str){
		return indexOf(text, str, 0);
	}
	
	public static int indexOf(String text, String str, int count){
		if (text.length() >= str.length()){
			if (str.equalsIgnoreCase(text.substring(0, str.length()))){
				return count;
			}
			count += 1;
			return indexOf(text.substring(1), str, count);
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(indexOf("Mississippi", "sip"));
		System.out.println("Expected: 6");
		System.out.println(indexOf("Mississippi", "Miss"));
		System.out.println("Expected: 0");
		System.out.println(indexOf("shoe", "oe"));
		System.out.println("Expected: 2");
		System.out.println(indexOf("shoe", "foot"));
		System.out.println("Expected: -1");
	}

}
