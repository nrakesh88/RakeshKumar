package week2Day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnFrame {

	@Test
	public void frame() throws InterruptedException, MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver = new
				RemoteWebDriver(new URL(
						"http://192.168.1.73:4444/wd/hub"), dc);

		driver.manage().window().maximize();

		driver.navigate().to("http://jqueryui.com/selectable/");
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		
		Thread.sleep(5000);
			
		driver.switchTo().frame(demo);
			
		driver.findElementByXPath("//*[@id='selectable']/li[3]").click();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		

	}

}









