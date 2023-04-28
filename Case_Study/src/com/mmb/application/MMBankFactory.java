package com.mmb.application;

import com.mmb.framework.BankFactory;

public class MMBankFactory extends BankFactory{
	public MMSavingsAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		MMSavingsAcc mms=new MMSavingsAcc(accNo, accNm, accBal, isSalaried);
		return mms;
		
	}
	
	public MMCurrentAcc CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		MMCurrentAcc mmc=new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return mmc;
		
	}
}
