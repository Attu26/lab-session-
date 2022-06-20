package com.utility.service;

import java.util.Random;

import com.greatelearning.model.Labassigment;

public class CredentialService {
	
	public char[] generatePassword() {
		
	String strCapitalLetters = 	"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String strSmallLetters = "abcdefghijklmnopqrstuvwxyz";
	String strNumbers = "0123456789";
	String strSpcharcaters = "!@#$%^&()-+=";
	
	String strValues = strCapitalLetters+strSmallLetters+strNumbers+strSpcharcaters;
	
	Random rd = new Random ();
	
	char [] password = new char[8];
	for(int i=0;i<8;i++) { // from 62 it will generate one number 5, 11
		password[i] = strValues.charAt(rd.nextInt(strValues.length()));
		//value capital H // store in zero position, value capital M , store in 1 position password [HMa!!]
		
		}
	                      	                     	                    
	return password;
	
	}
	
	public String generateeMailid(String strFirstName,String strLastName,String strDepartment) 
	{
	String strEmailId = strFirstName + strLastName +  "@"+ strDepartment+ ".abc.com";
	

	return strEmailId;
}	
	
		
    public void showCredentials(Labassigment empDetails, String strEmailId,char[] password) {
    	
    System.out.println("dear" + empDetails.getStrFirstName()+ " "+ empDetails.getStrLastName() +"Dear Harshit your generated creditals are as follows ");
    
    System.out.println("email id +strEmailId");
    
    System.out.println("Password>>>");
    
    System.out.println(password);
   
    
    
    
    }

	

	}


