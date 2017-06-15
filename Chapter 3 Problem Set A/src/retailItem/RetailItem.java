package retailItem;

public class RetailItem {
	
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(){
		description = "Shirt";
		unitsOnHand = 0;
		price = 0.00;
	}
	
	public RetailItem(String d, int uon, double p){
		description = d;
		unitsOnHand = uon;
		price = p;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String d) {
		description = d;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public void setUnitsOnHand(int uon) {
		unitsOnHand = uon;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		price = p;
	}

	public static void main(String[] args) {
		retailTester();

	}
	
	public static void retailTester(){
		RetailItem one = new RetailItem("Jacket", 12, 59.95);
		RetailItem two = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem three = new RetailItem("Shirt", 20, 24.95);
		
		System.out.println("\tDescription\tUnits on Hand\tPrice");
		System.out.println("Item #1\t"+one.getDescription()+"\t\t"+one.getUnitsOnHand()+"\t\t"+one.getPrice());
		System.out.println("Item #2\t"+two.getDescription()+"\t"+two.getUnitsOnHand()+"\t\t"+two.getPrice());
		System.out.println("Item #1\t"+three.getDescription()+"\t\t"+three.getUnitsOnHand()+"\t\t"+three.getPrice());


	}

}
