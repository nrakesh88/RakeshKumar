package learnAttributes;

import org.testng.annotations.Test;

public class LearnDepondsOnMethod {
	
	@Test
	public void createLead(){		
		System.out.println("createLead");
		throw new RuntimeException();
	}
	
	@Test
	public void deleteLead(){
		System.out.println("deleteLead");
	}
	
	@Test(dependsOnMethods = {"createLead"}, alwaysRun = true)
	public void editLead(){
		System.out.println("editLead");
	}
	
	@Test(enabled = false)
	public void mergeLead(){
		System.out.println("mergeLead");
	}

	

}
