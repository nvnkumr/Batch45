package com.mmb.application;

import com.mmb.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	
	public void withdraw(float creditLimit) {
		System.out.println("Dear "+getAccNm()+"  your credit Limit is:" +creditLimit+"  and Account Balance is:"+getAccBal());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimt()=" + getCreditLimt() + ", toString()=" + super.toString()
				+ ", getAccBal()=" + getAccBal() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



}
