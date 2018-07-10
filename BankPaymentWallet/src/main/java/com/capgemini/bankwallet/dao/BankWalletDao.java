package com.capgemini.bankwallet.dao;

import com.capgemini.bankwallet.bean.BankWalletDetails;

public class BankWalletDao implements IBankWalletDao {


	public Boolean addBankWalletDetails(BankWalletDetails bank) {
		 return null;
	}
	
	public BankWalletDetails showBalance(String phoneNumber) {
		return null;
		
	}
	public BankWalletDetails fundTransfer(String sourcephoneNumber,String targetphoneNumber, double amount) 
	{
		return null;
		
	}
	public BankWalletDetails depositAmount(String phoneNumber,double amount ) {
		return null;
	}
	public BankWalletDetails withdrawAmount(String phoneNumber,double amount) {
		return null;
	}

	public boolean save(BankWalletDetails bank) {
		// TODO Auto-generated method stub
		return false;
	}

	public BankWalletDetails findOne(String phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
