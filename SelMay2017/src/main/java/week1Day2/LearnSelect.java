package week1Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class LearnSelect {

	public static void main(String[] args) throws InterruptedException {

		//Launch the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ClassName obj = new ClassName();	
		ChromeDriver driver = new ChromeDriver();		
		//Maximize		
		driver.manage().window().maximize();
		//Load URL		
		driver.get("http://leaftaps.com");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		//Enter the userName
		driver.findElementById("username").sendKeys("DemoSalesManager");		
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");		
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();		
		driver.findElementByLinkText("CRM/SFA").click();		
		driver.findElementByLinkText("Create Lead").click();		
		WebElement source = driver.findElementById("createLeadForm_industryEnumId");

		Select dropdown = new Select(source);		
		//	dropdown.selectByIndex(2);		
		//	dropdown.selectByValue("LEAD_EMPLOYEE");		
		//	dropdown.selectByVisibleText("Public Relations");

		List<WebElement> allOptions = dropdown.getOptions();

		/*int count = allOptions.size();		
		System.out.println(count);		
		dropdown.selectByIndex(count-1);
		 */

		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());			
		}
	}
}











