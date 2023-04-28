package com.mmb.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}

	public void withdraw(float MINBAL) {
		System.out.println("MIN BAlance is" +MINBAL);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
