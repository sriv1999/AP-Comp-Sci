package recursion;

public class RecursionFunTwo {

	public static int countChickens(String word) {
		if (word.contains("chicken")) {
			int index = word.indexOf("chicken");
			String newWord = word.substring(0, index) + word.substring(index+7, word.length());
		    return countChickens(newWord) + 1;
		} 
		else if (!word.isEmpty()) {
		    return countChickens(word.substring(1));
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(countChickens("chchickchickenenicken"));
		System.out.println();
		
		System.out.println(countChickens("chickchickfun"));
		System.out.println();
		
		System.out.println(countChickens("chickenbouncetheballchicken"));

	}

}
