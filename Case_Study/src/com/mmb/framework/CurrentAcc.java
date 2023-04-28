package com.mmb.framework;

public abstract class CurrentAcc extends BankAcc{

	private float creditLimt;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimt) {
		super(accNo, accNm, accBal);
		this.creditLimt=creditLimt;
	}
	
	public void withdraw(float creditLimit) {
		System.out.println("Credit BAlance is:" +creditLimit);
	}
	
	public float getCreditLimt() {
		return creditLimt;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimt=" + creditLimt + "]";
	}
	
	
}
