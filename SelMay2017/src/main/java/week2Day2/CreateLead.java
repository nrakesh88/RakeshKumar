package week2Day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLead {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		// Basic level
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/ // launch browser
		driver.get("http://leaftaps.com/control/main"); // enter url 
		driver.findElementById("username").sendKeys("DemoSalesManager"); // enter username
		driver.findElementById("password").sendKeys("crmsfa"); // enter username
		driver.findElementByClassName("decorativeSubmit").click(); // click login
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("***********Login clicked************");
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snap1.jpg");
		FileUtils.copyFile(source, dest);
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		System.out.println("***********Create Lead clicked************");
		
		source = driver.getScreenshotAs(OutputType.FILE);
		dest = new File("./snaps/snap2.jpg");
		FileUtils.copyFile(source, dest);
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopinath");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jayakumar");
		driver.findElementByName("submitButton").click(); // click create lead
		System.out.println("***********Create Lead created************");

		source = driver.getScreenshotAs(OutputType.FILE);
		dest = new File("./snaps/snap3.jpg");
		FileUtils.copyFile(source, dest);
		
		driver.close();

	}

}
