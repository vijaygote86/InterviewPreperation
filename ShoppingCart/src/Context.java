
public class Context {
	
	private Strategy strategy;
	
	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}
	
	public int applyDiscount(int billAmount)
	{
		return strategy.calaculateFinalBill(billAmount);
	}

}
