package week2Day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnAlert {
	
	@Test
	public void alert() throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new
				RemoteWebDriver(new URL(
						"http://192.168.1.73:4444/wd/hub"), dc);
	
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	
		driver.findElement(By.id("loginbutton")).click();
		
		driver.findElementById("loginbutton").click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		
		System.out.println(alt.getText());
		
		alt.accept();	
		
		
		driver.findElementById("usernameId").sendKeys("Nesa");
		
		
		
		
		
	}

}












