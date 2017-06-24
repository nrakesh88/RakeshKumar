package wrappers;

import org.testng.annotations.DataProvider;

public class DataProv {

	@DataProvider(name="fetchData")
	public static String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0] = "Gopi";
		data[0][1] = "J";
		data[0][2] = "Qeagle";
		
		data[1][0] = "Lokesh";
		data[1][1] = "T";
		data[1][2] = "HCL";
		return data;
		
	}
	
}
