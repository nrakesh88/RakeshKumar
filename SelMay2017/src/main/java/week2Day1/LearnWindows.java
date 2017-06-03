package week2Day1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.navigate().to("http://legacy.crystalcruises.com/");
	//	String parentWindow = driver.getWindowHandle();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("GUEST CHECK-IN").click();

		//Window Handle - Last Window
		Set<String> allWin = driver.getWindowHandles();		
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);
			System.out.println(eachWin);
		}

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		allWin = driver.getWindowHandles();		
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);
			break;
		}
		
	//	driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}
























