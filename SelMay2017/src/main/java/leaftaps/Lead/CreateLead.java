package leaftaps.Lead;

import org.testng.annotations.Test;

import wrappers.DataProv;
import wrappers.LeafTapsWrapper;

public class CreateLead extends LeafTapsWrapper{
	
	@Test(dataProvider="fetchData",dataProviderClass=DataProv.class)
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









