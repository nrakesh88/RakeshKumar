package learnAnnotations;

import org.testng.annotations.Test;

public class LearnClass {
	
	@Test
	public void createLead(){
		System.out.println("CreateLead");
	}	

	@Test
	public void editLead(){
		System.out.println("EditLead");
	}

	@Test
	public void deleteLead(){
		System.out.println("DeleteLead");
	}

}
