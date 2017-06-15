package almanac;

public class City { 

	String name; 
	int population; 

	public City(int newPop, String newName) { 
		population = newPop;
		name = newName;
	} 
	
	public String getName() { 
		return name;
	} 
	
	public void changeName(String newName) { 
		name = newName;
	} 
	
	public int getPopulation() { 
		return population;
	} 
	
	public String toString() { 
		return "City " + name + " has a population of " + population + " people";
	} 
	
	public void setPopulation(int newPop) { 
		population = newPop;
	}
	
}