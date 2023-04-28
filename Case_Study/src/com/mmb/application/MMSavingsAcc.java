package com.mmb.application;

import com.mmb.framework.SavingAcc;

public class MMSavingsAcc extends SavingAcc{

	private static final float MINBAL = 0;
	public MMSavingsAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	
	public void withdraw(float MINBAL) {
		System.out.println("Dear "+getAccNm()+" , your minimum BAlance is:" +MINBAL);
	}

	@Override
	public String toString() {
		return "MMSavingsAcc [toString()=" + super.toString() + ", getAccBal()=" + getAccBal() + ", getAccNm()="
				+ getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
