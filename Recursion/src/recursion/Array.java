package recursion;

public class Array {
	
	public static int largest(int [] array){
		return largest(array, array.length - 1);
	}
	
	public static int largest(int [] array, int index){
	    if (index > 0) {
	        return Math.max(array[index], largest(array, index-1));
	    } 
	    return array[0];
	}
	
	public static int add(int [] array){
		return add(array, array.length - 1);
	}
	
	public static int add(int [] array, int index){
		if (index > 0){
			return array[index] + add(array, index-1);
		}
		return array[0];
	}

	public static void main(String[] args) {
		System.out.println(largest(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println("Expected: 5");
		System.out.println(largest(new int[] { 7, 9, 4, 6, 8 }));
		System.out.println("Expected: 9");

		System.out.println();

		System.out.println(add(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println("Expected: 15");
		System.out.println(add(new int[] { 7, 9, 4, 6, 8 }));
		System.out.println("Expected: 34");

	}

}
