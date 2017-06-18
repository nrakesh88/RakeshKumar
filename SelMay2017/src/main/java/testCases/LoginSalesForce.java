package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class LoginSalesForce extends GenericWrappers{

	@Test
	public void login() throws Exception{
		invokeApp("chrome", "https://developer.salesforce.com/signup?d=70130000000td6N");
		enterById("first_name", "Gopi");
		enterById("last_name", "J");
		enterById("email", "gopi@testleaf.com");
//		clickById("eula");
	}
	
	
}
