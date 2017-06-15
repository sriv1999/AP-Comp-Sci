package paymentLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PaymentLab {

	public static void main(String[] args) {
		pay();
		//invest();
	}
	
	public static void pay(){
		DecimalFormat d = new DecimalFormat("$0.00");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Principal: ");
		double principal = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter your Annual Interest Rate (APR) as a decimal: ");
		double apr = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter your Monthly Payment: ");
		double monthPay = Double.parseDouble(input.nextLine());
		
		System.out.println("Month\tPrincipal\tInterest\tPayment\tNew Balance");
		
		double newBalance = principal;
		int month = 1;
		double interest = 0;
		while (newBalance > monthPay){
			interest = principal*(apr/12);
			newBalance = principal + interest - monthPay;
			System.out.println(month+"\t"+d.format(principal)+"\t\t"+d.format(interest)+"\t\t"+d.format(monthPay)
								+"\t"+d.format(newBalance)+"\t");
			System.out.println();
			principal = newBalance;
			month++;
		}
		System.exit(0);
	}
	
	public static void invest(){
		DecimalFormat d = new DecimalFormat("$0.00");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Principal: ");
		double principal = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter your Annual Rate of Return (ARR) as a decimal: ");
		double apr = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter your Monthly Addition to Principal: ");
		double investment = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter number of months to invest: ");
		int monthLimit = Integer.parseInt(input.nextLine());
		
		System.out.println("Month\tPrincipal\tInterest\t\tInvestment\t\tNew Balance");
		
		double newBalance = 0;
		int month = 1;
		double interest = 0;
		while (month < monthLimit){
			interest = principal*(apr/12);
			newBalance = principal + interest + investment;
			System.out.println(month+"\t"+d.format(principal)+"\t"+d.format(interest)+"\t\t"+d.format(investment)
								+"\t\t"+d.format(newBalance)+"\t");
			System.out.println();
			principal = newBalance;
			month++;
		}
		System.exit(0);
	}

}
