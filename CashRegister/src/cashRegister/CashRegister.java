package cashRegister;

import java.util.*;
import javax.swing.JOptionPane;

public class CashRegister {
	
	private String cashierName;
	private double total;
	
	public CashRegister(){
		cashierName = "John";
		total = 100;
	}
	
	public CashRegister(String myName, double myTotal){
		cashierName = myName;
		total = myTotal;
	}
	
	public void addToRegister(double totalSale){
		total += totalSale;
	}
	
	public void changeName(String otherCashier){
		cashierName = otherCashier;
	}
	
	public void combineRegister(CashRegister other){
		total += other.total;
	}
	
	public String getName(){
		return cashierName;
	}
	
	public double getTotal(){
		return total;
	}
	
	public double makeChange(double totalSale, double amountTendered){
		this.addToRegister(totalSale);
		return amountTendered - totalSale;
	}
	
	public String toString(){
		return "Cashier Name: " + cashierName + "\nTotal Sales: $" + total;
	}

	public static void main(String[] args) {
		ScannerTester();
		DialogBox();

	}
	
	public static void ScannerTester(){
		Scanner input = new Scanner(System.in);
		System.out.println("What is the cashier's name? ");
		String cashierName = input.nextLine();
		
		System.out.println("What is the total? ");
		double total = Double.parseDouble(input.nextLine());
		
		CashRegister one = new CashRegister(cashierName, total);
		
		System.out.println("How much do you want to add? ");
		double addAmount = Double.parseDouble(input.nextLine());
		one.addToRegister(addAmount);
		
		System.out.println("Do you want to change cashier's name? (Yes or No) ");
		String answerName = input.nextLine();
		
		if (answerName.equalsIgnoreCase("Yes")){
			System.out.println("What is the new cashier name? ");
			String newCashierName = input.nextLine();
			one.changeName(newCashierName);
		}
		
		System.out.println("Do you have another cash register to add money? (Yes or No) ");
		String answerCash = input.nextLine();
		if (answerCash.equalsIgnoreCase("Yes")){
			System.out.println("What is the second cashier's name? ");
			String secondCashierName = input.nextLine();
			
			System.out.println("What is the second total? ");
			double secondTotal = Double.parseDouble(input.nextLine());
			
			CashRegister two = new CashRegister(secondCashierName, secondTotal);
			
			one.combineRegister(two);
		}
		
		System.out.println("What is the cost of the item the customer wants to buy? ");
		double cost = Double.parseDouble(input.nextLine());
		
		System.out.println("How much did the customer pay? ");
		double paid = Double.parseDouble(input.nextLine());
		
		System.out.println("This is your amount of change: $" + one.makeChange(cost, paid));
		
		System.out.println(one.toString());
		
		System.exit(0);
		
	}
	
	public static void DialogBox(){
		String cashierName = JOptionPane.showInputDialog("What is the cashier's name? ");
		
		String total = JOptionPane.showInputDialog("What is the total? ");
		double tot = Double.parseDouble(total);
		
		CashRegister one = new CashRegister(cashierName, tot);
		
		String addAmount = JOptionPane.showInputDialog("How much do you want to add? ");
		double addA = Double.parseDouble(addAmount);
		one.addToRegister(addA);
		
		String answerName = JOptionPane.showInputDialog("Do you want to change cashier's name? (Yes or No) ");
		if (answerName.equalsIgnoreCase("Yes")){
			String newCashierName = JOptionPane.showInputDialog("What is the new cashier name? ");
			one.changeName(newCashierName);
		}
		
		String answerCash = JOptionPane.showInputDialog("Do you have another cash register to add money? (Yes or No) ");
		if (answerCash.equalsIgnoreCase("Yes")){
			String secondCashierName = JOptionPane.showInputDialog("What is the second cashier's name? ");
			
			String secondTotal = JOptionPane.showInputDialog("What is the second total? ");
			double secTot = Double.parseDouble(secondTotal);
			
			CashRegister two = new CashRegister(secondCashierName, secTot);
			
			one.combineRegister(two);
		}
		
		String cost = JOptionPane.showInputDialog("What is the cost of the item the customer wants to buy? ");
		double c = Double.parseDouble(cost);
		
		String paid = JOptionPane.showInputDialog("How much did the customer pay? ");
		double pay = Double.parseDouble(paid);
		
		JOptionPane.showMessageDialog(null, "This is your amount of change: $" + one.makeChange(c, pay));
		
		JOptionPane.showMessageDialog(null, one.toString());
		
		System.exit(0);
	}

}
