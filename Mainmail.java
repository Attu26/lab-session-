package com.utility.service;

import java.util.Scanner;

import com.greatelearning.model.Labassigment;

public class Mainmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] Password;
		String strGenerateEmailId;
		Scanner SC = new Scanner(System.in);
		String strFirstName;	
		String strLastName;
		
		System.out.println ("Harshit");
		strFirstName = SC.nextLine();
		System.out.println("Chaudary");
		strLastName = SC.nextLine();
		CredentialService credentialService = new CredentialService();
		
	
		Labassigment empDetails = new Labassigment("strFirstName","strLastName");
		
		System.out.println("Select Department from below options");
		
		System.out.println("1. Technical");
		
		System.out.println("2. Admin");
		
		System.out.println("3. HR");
		
		System.out.println("4. Legal");
		
		int options = SC.nextInt();
		
		if (options == 1) {
			
			strGenerateEmailId =credentialService.generateeMailid (empDetails.getStrFirstName(),empDetails.getStrLastName(),"technical");
			Password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, Password);
			
		}
		else if (options == 2)
		{
			strGenerateEmailId =credentialService.generateeMailid (empDetails.getStrFirstName(),empDetails.getStrLastName(),"Admin");
			Password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, Password);
		}
		else if (options == 3) {
			
			strGenerateEmailId =credentialService.generateeMailid (empDetails.getStrFirstName(),empDetails.getStrLastName(),"HR");
			Password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, Password);
		}
else if (options == 4) {
			
			strGenerateEmailId =credentialService.generateeMailid (empDetails.getStrFirstName(),empDetails.getStrLastName(),"Legal");
			Password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, Password);
}
else {
	System.out.println("Please enter the valid option");
	
}
SC.close();

				
			
	}

}
