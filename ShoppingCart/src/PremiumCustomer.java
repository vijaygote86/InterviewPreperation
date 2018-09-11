
public class PremiumCustomer implements Strategy{

	@Override
	public int calaculateFinalBill(int billAmount) {
		if(billAmount <= 4000)
		{
			return billAmount - (billAmount*10/100);
		}
		else if(billAmount >4000 && billAmount <=8000)
		{
			return billAmount - (billAmount*15/100);
		}
		else if(billAmount >8000 && billAmount <=12000)
		{
			return billAmount - (billAmount*20/100);
		}
		else if(billAmount >12000)
		{
			return billAmount - (billAmount*30/100);
		}
		return 0;
	}

}
