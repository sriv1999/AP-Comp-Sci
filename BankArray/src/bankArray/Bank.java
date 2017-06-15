package bankArray;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bank {
	
	private ArrayList <BankAccount> accounts;

	public Bank(){
		accounts = new ArrayList <BankAccount> ();
	}
	
	public void addAccount (BankAccount a){
		accounts.add(a);
	}
	
	public int count(double atLeast){
		int count = 0;
		
		for (int i = 0; i < accounts.size(); i++){
			if (accounts.get(i).getBalance() >= atLeast){
				count++;
			}
		}
		
		return count;
	}
	
	public BankAccount find(int accountNumber){
		for (int i = 0; i < accounts.size(); i++){
			if (accounts.get(i).getAccountNumber() == accountNumber){
				return accounts.get(i);
			}
		}
		return null;
	}
	
	public BankAccount getMaximum(){
		int index = 0;
		double max = accounts.get(0).getBalance();
		for (int i = 1; i < accounts.size(); i++){
			if (accounts.get(i).getBalance() > max){
				max = accounts.get(i).getBalance();
				index = i;
			}
		}
		return accounts.get(index);
	}
	
	public double getTotalBalance(){
		double sum = 0;
		for (int i = 0; i < accounts.size(); i++){
			sum += accounts.get(i).getBalance();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("00.00");
		
		Bank firstBankOfJava = new Bank();
		
		firstBankOfJava.addAccount(new BankAccount(1001, 20000));
		firstBankOfJava.addAccount(new BankAccount(1015, 10000));
		firstBankOfJava.addAccount(new BankAccount(1729, 15000));

		System.out.println("Total of all Accounts: $" + d.format(firstBankOfJava.getTotalBalance()));
		System.out.println();

		double threshold = 15000;
		int c = firstBankOfJava.count(threshold);
		System.out.println(c + " accounts with balance >= $" + d.format(threshold));
		System.out.println();

		int accountNumber = 1015;
		BankAccount a = firstBankOfJava.find(accountNumber);

		if (a == null)
			System.out.println("No account with number " + accountNumber);
		else
			System.out.println("Account with number " + accountNumber + " has balance $" + d.format(a.getBalance()));
		System.out.println();

		BankAccount max = firstBankOfJava.getMaximum();
		System.out.println("Account with number " + max.getAccountNumber() + " has the largest balance.");
	}
}
