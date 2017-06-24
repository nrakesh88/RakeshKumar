package prop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperty {
	
	@Test
	public void readProperty() throws IOException{
		
		Properties prop = new Properties();
		File fl = new File("./src/main/resources/config.properties");
		FileInputStream fis = new FileInputStream(fl);
		prop.load(fis);		
		System.out.println(prop.getProperty("url"));
		
		
	}

}














