package arrays;

public class CombineArrays {

	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

	public static int[] append (int[] a , int[] b) { 
		int [] result = new int[a.length + b.length];

		int count = 0;
	    for (int i = 0; i < a.length; i++){
	    	result[count] = a[i];
	    	count++;
	    }
	    
	    for (int j = 0; j < b.length; j++){
	    	result[count] = b[j];
	    	count++;
	    }
	    
	    return result;
	} 

	public static int[] alternate(int [] a, int [] b) {
		int aCount = 0;
		int bCount = 0;
		
		int [] result = new int[a.length + b.length];
		for (int i = 0; i < result.length; i++){
			if (i%2 == 0){
				result[i] = a[aCount];
				aCount++;
			}
			else if (i%2 == 1){
				result[i] = b[bCount];
				bCount++;
			}
		}
		return result;
	} 
	
	public static void sort(int [] numbArray) {
		int temp = 0;
		for (int x = 0; x < numbArray.length; x++){
			for (int y = x; y < numbArray.length; y++){
				if (numbArray[x] > numbArray[y]){
					temp = numbArray[x];
					numbArray[x] = numbArray[y];
					numbArray[y] = temp;
				}
			}
		}
	}
	
	public static int[] combine(int[] a, int[] b){
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

	public static int[] merge(int[]a, int[] b) {
		int [] concatenate = append(a, b);
		sort(concatenate);
	    return concatenate;

	} 

	public static void main(String[] args) { 
		int[] a = new int[]{1,7,13,24,25};
		int[] b = new int[] {3,10,21,26};
	
		System.out.println("APPEND") ; 
		display(append(a,b)); 
	
		System.out.println(); 
	
		System.out.println("ALTERNATE") ; 
		display(alternate(a,b));
	
		System.out.println() ; 
	
		System.out.println("MERGE") ; 
		display(merge(b,a));

	} 

}