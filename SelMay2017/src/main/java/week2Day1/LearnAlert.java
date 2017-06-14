package week2Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
		
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












