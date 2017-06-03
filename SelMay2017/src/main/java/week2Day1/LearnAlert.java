package week2Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementById("loginbutton").click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		
		System.out.println(alt.getText());
		
		alt.accept();	
		
		
		driver.findElementById("usernameId").sendKeys("Nesa");
		
		
		
		
		
	}

}












