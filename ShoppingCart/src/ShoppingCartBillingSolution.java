import java.util.Scanner;


public class ShoppingCartBillingSolution {
	
	public static void main(String[] args) {
		
		Context context = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for Premiun customer and 2 for Regular Customer :");
		int customerType = scanner.nextInt();
		System.out.println("Enter billing amount :");
		int billAmount = scanner.nextInt();
		
		if(customerType == 1)
		{
			context = new Context(new PremiumCustomer());
			int premiumCustfinalBill = context.applyDiscount(billAmount);
			System.out.println("Premium Customer Final bill is : " +premiumCustfinalBill);
		}
		 
		if(customerType == 2)
		{
			context = new Context(new RegularCustomer());
			int regCustFinalBill = context.applyDiscount(billAmount);
			System.out.println("Regular Customer final bill is : " +regCustFinalBill);
		}
		
	}

}
