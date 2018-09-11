package com.dmart.solution;

public interface PaymentStrategy {
	
	public abstract int calculateFinalBill(int billingAmount);

}
