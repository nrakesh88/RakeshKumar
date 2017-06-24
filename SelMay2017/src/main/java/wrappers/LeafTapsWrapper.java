package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class LeafTapsWrapper extends GenericWrappers {
	
	/*@Parameters({"browser","url","username","password"})
	@BeforeMethod(groups={"common"})
	public void login(String browser,String url,String un,String pwd) throws Exception {
		invokeApp(browser, url);
		enterById("username", un);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}
	
	@AfterMethod(groups={"common"})
	public void closeBrowser(){
		quitBrowser();
	}*/
	
	@DataProvider(name="fetchData")
	public static String[][] getData() throws InvalidFormatException, IOException {
		/*String[][] data = new String[2][3];
		data[0][0] = "TestLeaf";
		data[0][1] = "Gopinath";
		data[0][2] = "J";
		
		data[1][0] = "HCL";
		data[1][1] = "Lokesh";
		data[1][2] = "M";*/
		
		return DataInputProvider.readExcel();		
		
		
	}
	
	
	
}
