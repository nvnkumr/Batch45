package com.mmb.main;

import com.mmb.application.MMBankFactory;
import com.mmb.application.MMCurrentAcc;
import com.mmb.application.MMSavingsAcc;
import com.mmb.framework.CurrentAcc;
import com.mmb.framework.SavingAcc;

public class MMBank {

	public static void main(String[] args) {
		MMBankFactory mmb=new MMBankFactory();
		
		SavingAcc sa=new MMSavingsAcc(100, "naveen", 50, true);
		sa.withdraw(60);
		sa.toString();
		
		CurrentAcc ca=new MMCurrentAcc(200, "kumar", 20, 30);
		ca.withdraw(33);
		ca.toString();
	}

}
