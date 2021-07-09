package com.kapilsharma.exeptionhandling;

class Amount {
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount other) throws Exception{
		if(!this.currency.equals(other.currency)) {
			throw new Exception("Currencies dont matched");
		}
		this.amount = this.amount + other.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws Exception{
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("INR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
