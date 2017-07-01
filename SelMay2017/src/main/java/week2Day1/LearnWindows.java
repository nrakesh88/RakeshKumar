package week2Day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnWindows {

	@Test
	public void windows() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new
				RemoteWebDriver(new URL(
						"http://192.168.1.73:4444/wd/hub"), dc);

		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();	*/	
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
























