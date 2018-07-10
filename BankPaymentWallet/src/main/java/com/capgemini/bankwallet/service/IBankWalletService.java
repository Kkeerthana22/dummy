package com.capgemini.bankwallet.service;


import com.capgemini.bankwallet.bean.BankWalletDetails;
import com.capgemini.bankwallet.exception.InvalidInputException;

public interface IBankWalletService {

	public Boolean addBankWalletDetails(BankWalletDetails bank) ;
	public BankWalletDetails showBalance(String phoneNumber) ;
	public BankWalletDetails fundTransfer(String sourcephoneNumber,String targetphoneNumber, double amount) ;
	public BankWalletDetails depositAmount(String phoneNumber,double amount ); 
	public BankWalletDetails withdrawAmount(String phoneNumber,double amount);
}

