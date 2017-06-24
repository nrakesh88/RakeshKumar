package testCases;

import org.testng.annotations.Test;

public class sample {
	
	/*@BeforeMethod
	public void beforeMethod(){
		System.out.println("BeforeMethod");
	}*/
	
	@Test(invocationCount = 6, invocationTimeOut  = 10000, timeOut = 10000)
	public void test(){
		System.out.println("Test");
	}
	
	
	
	/*@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod");
	}
*/
}
