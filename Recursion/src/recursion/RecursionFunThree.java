package recursion;

public class RecursionFunThree {
	/* luckySevens will return a count of the 7s in the number
	 *    unless the 7s are side by side in which case they are worth 14
	 *
	 * 1087171  would return 2 as there are 2 7s
	 * 1077171  would return 15 as 2 7s side by side count as 14 + 1 = 15
	 * 77077  would return 28 ( 14 + 14 )
	 * 97171771707797 would return 32 ( 1 + 1 + 14 + 1 + 14 + 1 )
	 * 1089651234 would return 0
	 *
	 * the solution to this problem must use recursion
	 */
	public static int luckySevens(long num) {
		if (num/10 == 0){
			if (num == 7){
				return 1;
			}
		}
		if (num % 10 == 7){
			if (num / 10 % 10 == 7)
				return 13 + luckySevens(num/10);
			return 1 + luckySevens(num/10);
		}
		else if (num/10 > 0){
			return luckySevens(num/10);
		}
		return 0;
	}
	
	public static void main(String [] args){
		System.out.println(luckySevens(12712771));
		System.out.println();
		
		System.out.println(luckySevens(17772272));
	}
}