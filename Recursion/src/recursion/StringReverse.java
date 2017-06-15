package recursion;

public class StringReverse {
	
   /**
      A method that reverses a string.
   */
	
   public static String reverse(String text){
	   if (text.length() == 0)
			return "";
	   return text.charAt(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
   }
   
   public static String reverse2(String text){
	   return reverse2(text, text.length());
   }
   
   public static String reverse2(String text, int length){
	   if (length == 1){
		   return text.substring(0, 1);
	   }
	   return text.substring(length-1, length) + reverse2(text.substring(0, text.length() - 1));
   }
   
   public static void main(String [] args){
       System.out.println(StringReverse.reverse("Hello!"));
       System.out.println("Expected: !olleH");
       System.out.println(StringReverse.reverse2("Odd"));
       System.out.println("Expected: ddO");
   }
}