package com.capgemini.bankwallet.service;

import java.util.regex.Pattern;

public class BankWalletValidate {

		public boolean ValidateAge(int age) {
			if( age >= 18){
				return true;
			}
			else
			return false;
		}
		
	public boolean validatePhoneNumber(String phoneNumber) {
		if(phoneNumber.matches("[1-9][0-9]{9}")) 
		{
			return true;
		}		
		else 
			return false;
	}
	
	
	
	
	
	public boolean validateAadharNumber(String aadharNumber) {
			if(aadharNumber.length() == 12)
			{
			return true;
			}
		else
			return false;
			
		}
		

		public boolean validateEmail(String email) {
			if(Pattern.matches("(.+)_gmail.com$",email))
			return true;
			
			else
			
				return false;
				
			
			
			
		}


}
