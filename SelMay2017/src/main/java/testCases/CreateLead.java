package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class CreateLead extends GenericWrappers{

	@Test
	public void login() throws InterruptedException{
		//Launch the Browser
		invokeApp("chrome", "http://leaftaps.com");
		//Enter the userName
		enterById("username", "DemoSalesManager");
	//	driver.findElementById("username").sendKeys("DemoSalesManager");		
		//Enter the password
		enterById("password", "crmsfa");
	//	driver.findElementById("password").sendKeys("crmsfa");	
		//Click Login
		clickByClassName("decorativeSubmit");
	//	driver.findElementByClassName("decorativeSubmit").click();
		// Java Wait
		
		clickByLink("CRM/SFA");
		
	
		//closeBrowser();
	}
}











