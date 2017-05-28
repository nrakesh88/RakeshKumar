package week1Day2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
	
		//Launch the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		//ClassName obj = new ClassName();		
		ChromeDriver driver = new ChromeDriver();		
		//Maximize		
		driver.manage().window().maximize();
		//Load d URL		
		driver.get("http://leaftaps.com");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter the userName
		driver.findElementById("username").sendKeys("DemoSalesManager");		
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");	
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		// Java Wait
		Thread.sleep(10000);
		//Click LogOut
		driver.findElementByClassName("decorativeSubmit").click();
	}
}











