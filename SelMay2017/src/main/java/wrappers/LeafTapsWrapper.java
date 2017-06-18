package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class LeafTapsWrapper extends GenericWrappers {
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod/*(groups={"common"})*/
	public void login(String browser,String url,String un,String pwd) throws Exception {
		invokeApp(browser, url);
		enterById("username", un);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}
	
	@AfterMethod/*(groups={"common"})*/
	public void closeBrowser(){
		quitBrowser();
	}
	
	
	
}
