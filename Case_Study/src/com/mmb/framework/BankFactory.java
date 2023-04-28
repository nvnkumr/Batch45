package com.mmb.framework;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried);
	public abstract CurrentAcc CurrentAcc(int accNo, String accNm, float accBal,float creditLimit);
}
