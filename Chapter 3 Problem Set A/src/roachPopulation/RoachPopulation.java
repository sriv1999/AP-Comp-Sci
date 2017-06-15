package roachPopulation;

public class RoachPopulation{
	
	private int population;
	
	public RoachPopulation(){
		population = 1;
	}
	
	public RoachPopulation(int p){
		population = p;
	}

	public int getPopulation() {
		return population;
	}

	public void breed(){
		population *= 2;
	}
	
	public void spray(){
		population *= 0.9;
	}
	
	public static void main(String[] args) throws InterruptedException{
		RoachSimulation();
	}
	
	public static void RoachSimulation() throws InterruptedException{
		RoachPopulation one = new RoachPopulation(10);
		
		for (int count = 0; count < 3; count++){
			one.breed();
			one.spray();
			System.out.println("The current roach population is: " + one.getPopulation());
			Thread.sleep(1000);
		}
		
		System.exit(0);
	}

}
