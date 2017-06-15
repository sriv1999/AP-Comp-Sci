package salesTax;
import java.text.DecimalFormat;

public class SalesTax {

	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("$0.00");
		for (int i = 10; i <= 100; i += 10){
			for (double j = 0.05; j <= 0.09; j += 0.01){
				System.out.print(d.format(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
