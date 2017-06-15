package recursion;

public class Find {
	
	public static boolean find(String text, String str){
		if (text.length() >= str.length()){
			if (str.equalsIgnoreCase(text.substring(0, str.length()))){
				return true;
			}
			return find(text.substring(1), str);
		}
		return false;
	}

	public static void main(String [] args){
	      System.out.println(find("Mississippi", "sip"));
	      System.out.println("Expected: true");
	      System.out.println(find("Mississippi", "sisip"));
	      System.out.println("Expected: false");
	      System.out.println(find("shoe", "oe"));
	      System.out.println("Expected: true");
	   }

}
