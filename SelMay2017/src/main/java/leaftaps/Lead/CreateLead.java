package leaftaps.Lead;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{
	
	@Test(dataProvider="fetchData")
	/*(groups={"smoke"})*/
	public void createLead(String FN,String LN,String CN) throws Exception{		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",CN);
		enterById("createLeadForm_firstName", FN);
		enterById("createLeadForm_lastName", LN);		
		/*enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");*/
		clickByName("submitButton");		
	}
	
	
	@DataProvider(name="fetchData")
	public static String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0] = "Gopi";
		data[0][1] = "J";
		data[0][2] = "Facebook";
		
		data[1][0] = "Lokesh";
		data[1][1] = "T";
		data[1][2] = "LinkedIn";
		
		return data;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









