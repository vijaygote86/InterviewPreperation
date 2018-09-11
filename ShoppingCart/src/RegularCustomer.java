import java.util.HashMap;


public class RegularCustomer implements Strategy{
	

	@Override
	public int calaculateFinalBill(int billAmount) {
		
		if(billAmount <= 5000)
		{
			return billAmount;
		}
		else if(billAmount >5000 && billAmount <=10000)
		{
			return billAmount - (billAmount*10/100);
		}
		else if(billAmount >10000)
		{
			return billAmount - (billAmount*20/100);
		}
		return 0;
	}

}
