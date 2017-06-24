package week1Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void sample() throws InterruptedException{

	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://www.firstcry.com/");
		driver.switchTo().frame("iframe_Login");
		driver.findElementByXPath("//a[text()='Close']/following-sibling::div").click();

	}

}











