package com.capgemini.bankwallet.service;

import com.capgemini.bankwallet.bean.BankWalletDetails;
import com.capgemini.bankwallet.dao.BankWalletDao;

public class BankWalletService {

	
	
	BankWalletDao dao = new BankWalletDao();
	public Boolean addBankWalletDetails(BankWalletDetails bank) {
  		return dao.addBankWalletDetails(bank);
	}
	
	public BankWalletDetails showBalance(String phoneNumber)  {
		return dao.showBalance(phoneNumber);
	}
	public BankWalletDetails fundTransfer(String sourcephoneNumber,String targetphoneNumber, double amount){ 
		return dao.fundTransfer(sourcephoneNumber, targetphoneNumber, amount);
		
	}
		
	
	
	public BankWalletDetails depositAmount(String phoneNumber,double amount ) {
		return dao.depositAmount(phoneNumber, amount);
		
	}
		
		
		
	public BankWalletDetails withdrawAmount(String phoneNumber,double amount) {
		return dao.withdrawAmount(phoneNumber, amount);
		
	}
}
