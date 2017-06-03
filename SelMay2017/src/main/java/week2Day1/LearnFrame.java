package week2Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("http://jqueryui.com/selectable/");
		
		WebElement demo = driver.findElementByClassName("demo-frame");
			
		driver.switchTo().frame(demo);
			
		driver.findElementByXPath("//*[@id='selectable']/li[3]").click();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		

	}

}









