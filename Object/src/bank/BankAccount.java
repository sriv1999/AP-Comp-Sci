package bank;

public class BankAccount {
	
	private String acctNumb;
	private double balance;
	
	public BankAccount(){
		acctNumb = "12345";
		balance = 100000;
	}
	
	public BankAccount(String a, double b){
		acctNumb = a;
		balance = b;
	}
	
	public String getAccount(){
		return acctNumb;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String toString(){
		return "This Bank Account has a balance of $" + getBalance() + ", and account number " + getAccount() + ".";
	}

	public void deposit(double a){
		balance += a;
	}
	
	public void withdraw(double a){
		balance -= a;
	}
	
	public void calculateMonthlyInterest(int r){
		this.deposit((r*balance)/12/100);
	}
	
	public static void main(String[] args) {
		BankAccount one = new BankAccount();
		BankAccount two = new BankAccount("111111111", 1000);
		
		one.deposit(100.10);
		one.calculateMonthlyInterest(4);
		
		two.calculateMonthlyInterest(3);
	
	    System.out.println(one.toString());
		System.out.println(two.toString());

	}

}
