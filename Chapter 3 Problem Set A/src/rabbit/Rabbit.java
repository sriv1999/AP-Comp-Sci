package rabbit;

public class Rabbit {

	private int rabbitReadyPopulationPairs;
	private int rabbitNewPopulationPairs;
	private int month;
	
	public Rabbit(){
		rabbitReadyPopulationPairs = 0;
		rabbitNewPopulationPairs = 0;
		month = 0;
	}
	
	public Rabbit(int rrp){
		rabbitReadyPopulationPairs = rrp;
		rabbitNewPopulationPairs = 0;
		month = 0;
	}
	
	public int getPairs(){
		return rabbitReadyPopulationPairs + rabbitNewPopulationPairs;
	}
	
	public int getMonth(){
		return month;
	}
	
	public void waitAMonth(){
		int x = rabbitNewPopulationPairs;
		rabbitReadyPopulationPairs += x;
		rabbitNewPopulationPairs = rabbitReadyPopulationPairs;
		month++;
	}
	
	public static void main(String[] args) throws InterruptedException{
		RabbitTester();
	}
	
	public static void RabbitTester() throws InterruptedException{
		Rabbit one = new Rabbit(1);
		
		System.out.println("Rabbit Pairs: " + one.getPairs() + "\nMonth: " + one.getMonth() + "\n");
		Thread.sleep(1000);
		
		one.waitAMonth();
		System.out.println("Rabbit Pairs: " + one.getPairs() + "\nMonth: " + one.getMonth() + "\n");
		Thread.sleep(1000);
		
		one.waitAMonth();
		System.out.println("Rabbit Pairs: " + one.getPairs() + "\nMonth: " + one.getMonth() + "\n");
		Thread.sleep(1000);
		
		one.waitAMonth();
		System.out.println("Rabbit Pairs: " + one.getPairs() + "\nMonth: " + one.getMonth() + "\n");
		Thread.sleep(1000);
		
		one.waitAMonth();
		System.out.println("Rabbit Pairs: " + one.getPairs() + "\nMonth: " + one.getMonth() + "\n");
		Thread.sleep(1000);
		
		System.exit(0);
	}

}
