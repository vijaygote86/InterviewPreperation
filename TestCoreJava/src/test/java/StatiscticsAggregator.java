package src.test.java;

public interface StatiscticsAggregator {
	
	public void putNewPrice(String symbol, double price);
	
	public double getAveragePrice(String symbol);
	
	public int getTickCount(String symbol);

}
