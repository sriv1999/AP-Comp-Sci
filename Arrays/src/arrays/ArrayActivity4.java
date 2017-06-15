package arrays;

public class ArrayActivity4 {
	
	public static double lowPrice(int[] price){
		double min = price[0];
		for (int i = 1; i < price.length; i++){
			if (price[i] < min){
				min = price[i];
			}
		}
		return min;
	}
	
	public static void perfect(){
		int [] perfectNum = new int [100];
		int count = 1;
		
		for (int i = 0; i < perfectNum.length; i++){
			int sqrt = (int) Math.sqrt(count);
			if(sqrt*sqrt == count){
				perfectNum[i] = count;
			}
			else{
				i--;
			}
			count++;
		}
		
		for (int i = perfectNum.length-1; i >= 0; i--){
			System.out.println(perfectNum[i]);
		}	
	}
	
	public static void countLetters(String [] lastNames){
		int [] letters = new int [lastNames.length];
		for (int i = 0; i < lastNames.length; i++){
			letters[i] = lastNames[i].length();
		}
		
		for (int i = 0; i < lastNames.length; i++){
			System.out.println(lastNames[i] + "\t" + letters[i]);
		}
	}
	
	public static void displayAnimals(String [] animals){
		for (int i = animals.length-1; i >= 0; i -= 2){
			System.out.println(animals[i]);
		}
	}
	
	public static void displaySplit(String [] words){
		String [] aToM = new String [words.length];
		String [] nToZ = new String [words.length];
		
		String aM = "abcdefghijklmABCDEFGHIJKLM";
		String nZ = "nopqrstuvwxyzNOPQRSTUVWXYZ";
		
		int aCount = 0;
		int nCount = 0;
		
		for (int i = 0; i < words.length; i++){
			if (aM.contains(Character.toString(words[i].charAt(0)))){
				aToM[aCount] = words[i];
				aCount++;
			}
			else if (nZ.contains(Character.toString(words[i].charAt(0)))){
				nToZ[nCount] = words[i];
				nCount++;
			}
		}
		
		System.out.println("A to M\tN to Z");
		System.out.println("---------------");
		
		for (int i = 0; i < words.length; i++){
			if (aToM[i] == null){
				if (nToZ[i] == null){
					break;
				}
				else{
					System.out.println("\t" + nToZ[i]);
				}
			}
			else if (aToM[i] != null){
				if (nToZ[i] == null){
					System.out.println(aToM[i]);
				}
				else{
					System.out.println(aToM[i] + "\t" + nToZ[i]);
				}
			}
		}
	}
	
	public static void gettysburgArray(){
		String getty = "Four score and seven years ago our fathers brought forth on this continent, a new nation, "
				+ "conceived in Liberty, and dedicated to the proposition that all men are created equal. Now we "
				+ "are engaged in a great civil war, testing whether that nation, or any nation so conceived "
				+ "and so dedicated, can long endure. We are met on a great battle-field of that war. We have "
				+ "come to dedicate a portion of that field, as a final resting place for those who here gave "
				+ "their lives that that nation might live. It is altogether fitting and proper that we should "
				+ "do this.But, in a larger sense, we can not dedicate -- we can not consecrate -- "
				+ "we can not hallow -- this ground. The brave men, living and dead, who struggled here, "
				+ "have consecrated it, far above our poor power to add or detract. "
				+ "The world will little note, nor long remember what we say here, "
				+ "but it can never forget what they did here. "
				+ "It is for us the living, rather, to be dedicated here to the unfinished work "
				+ "which they who fought here have thus far so nobly advanced. It is rather for us "
				+ "to be here dedicated to the great task remaining before us -- that from these "
				+ "honored dead we take increased devotion to that cause for which they gave the "
				+ "last full measure of devotion -- that we here highly resolve that these dead shall "
				+ "not have died in vain -- that this nation, under God, shall have a new birth of freedom -- "
				+ "and that government of the people, by the people, for the people, shall not perish from the earth.";
		
		String[] words = getty.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		
		for (int i = 0; i < words.length; i++){
			System.out.println(words[i].length()+"\t"+words[i]);
		}
	}

	public static void main(String[] args) {

		int[] price = { 10000000, 220000, 330500, 403000 };
		System.out.println(lowPrice(price));
		
		System.out.println();

		perfect();
		
		System.out.println();
		
		String[] n = { "Connolly", "Zapicchi", "Miller", "James", "Becker" };
		countLetters(n);
		
		System.out.println();
		
		String[] animals = { "ape", "bear", "cat", "dog", "elephant", "gnu" };
		displayAnimals(animals);
		
		System.out.println();
		
		String[] bowl = new String[] { "apple", "orange", "kiwi", "lemon", "pear", "mango" };
		displaySplit(bowl);
		
		System.out.println();
		
		//gettysburgArray();
	}

}
