package almanac;

public class Almanac{ 

	/** 
	 * Almanac contains an Array of City objects 
	 */ 
	
	private City [] list; 
	
	public Almanac(){ 
	
		list = new City[5]; 
		list[0] = new City(1547000, "Philadelphia"); 
		list[1] = new City(443775, "Atlanta"); 
		list[2] = new City(636470, "Boston"); 
		list[3] = new City(8336000, "New York"); 
		list[4] = new City(277347, "Newark"); 
	
	} 
	
	public Almanac(int x){ 
		list = new City[x];
	} 
	
	/** 
	
	list = new City[x]; 
	
	 * Displays List of Cities 
	
	 */ 
	
	public void printList(){ 
		System.out.println("CITY\t\tPOPULATION");
		System.out.println("------------------------------");
		for (int i = 0; i < list.length; i++){
			System.out.println(list[i].getName() + "\t\t" + list[i].getPopulation());
		}
	} 
	
	/** 
	
	 * Find the city with the smallest population return the name. 
	
	 */ 
	
	public String smallestPop(){ 
		int minPop = list[0].getPopulation();
		int index = 0;
		for (int i = 1; i < list.length; i++){
			if (list[i].getPopulation() < minPop){
				minPop = list[i].getPopulation();
				index = i;
			}
		}
		return list[index].getName();
	} 
	
	/** 
	
	 * Returns the average population 
	
	 */ 
	
	public int averagePop(){ 
		int sum = 0;
		for (int i = 0; i < list.length; i++){
			sum += list[i].getPopulation();
		}
		
		return sum/list.length;
	} 
	
	/** 
	
	 * Changes the population of a City that matches searchName to newPopulation 
	
	 */ 
	
	public void changePop(String searchName, int newPopulation){ 
		for (int i = 0; i < list.length; i++){
			if (list[i].getName().equalsIgnoreCase(searchName)){
				list[i].population = newPopulation;
				break;
			}
		}
	} 
	
	/** 
	
	* this method will add rate% to each population in the list 
	
	*/ 
	
	public void increasePop(double rate){ 
		for (int i = 0; i < list.length; i++){
			list[i].population = (int) ((1+(rate/100)) * list[i].getPopulation());
		}
	} 
	
	public static void main(String[] args){ 
		Almanac tc = new Almanac(); 
		
		tc.printList();
		System.out.println();
		
		System.out.println("Average Population: " + tc.averagePop());
		System.out.println();
		
		System.out.println("Smallest: " + tc.smallestPop());
		System.out.println();
		
		tc.changePop("Newark", 15); 
		System.out.println("After Change"); 
		tc.printList();
		System.out.println();
		
		tc.increasePop(3); 
		System.out.println("After Increase"); 
		tc.printList(); 
	
	}
}