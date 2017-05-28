package week1Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
	
		//Launch the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//sys
		//ClassName obj = new ClassName();	
		FirefoxDriver driver = new FirefoxDriver();
//		ChromeDriver driver = new ChromeDriver();		
		//Maximize
		driver.manage().window().maximize();
		//Load d URL
		driver.get("http://leaftaps.com");
		
		//Enter the userName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByCssSelector("").getText();
		
		//Click LogOut
		driver.findElementByClassName("decorativeSubmit").click();
		

	}

}











