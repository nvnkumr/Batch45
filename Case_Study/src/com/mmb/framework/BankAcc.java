package com.mmb.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.setAccNm(accNm);
		this.setAccBal(accBal);
	}
	
	public void withdraw(float accBal) {
		System.out.println("Account BAlance is:" +accBal);
	}
	
	public void deposite(float accBal) {
		System.out.println("deposite Amount is:"+accBal);
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", accBal=" + getAccBal() + "]";
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

}
