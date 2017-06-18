package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers{

	@Test
	public void login() throws Exception {
		//Launch the Browser
		invokeApp("chrome", "http://leaftaps.com");
		//Enter the userName
		enterById("username1", "DemoSalesManager");
	//	driver.findElementById("username").sendKeys("DemoSalesManager");		
		//Enter the password
		enterById("password", "crmsfa");
	//	driver.findElementById("password").sendKeys("crmsfa");	
		//Click Login
		clickByClassName("decorativeSubmit");
	//	driver.findElementByClassName("decorativeSubmit").click();
		// Java Wait

		//Click LogOut
		clickByClassName("decorativeSubmit");
	//	driver.findElementByClassName("decorativeSubmit").click();
	
		clickById("name");
		
		quitBrowser();
	}
}











