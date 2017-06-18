package week1Day2;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class AlertSnap {

	@Test
	public void takeSnap() throws HeadlessException, AWTException, IOException, InterruptedException{
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("firefox");		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);
		
		
		/*//Step 1: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");


		//Step2: Call Java Class to another Class
		//ClassName obj = new ClassName();		
		ChromeDriver driver = new ChromeDriver();*/	

		// Maximize
		driver.manage().window().maximize();

		//Step 3: Load URL		
		driver.get("https://www.irctc.co.in/eticketing/forgotPassword.jsf");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement ele = driver.findElementById("forgot_passwrd:checkDetails1");
		int w = ele.getSize().getWidth();
		int h = ele.getSize().getHeight();
		
		driver.findElementById("forgot_passwrd:checkDetails1").click();
		Thread.sleep(1000);
		

		// take snap
		//BufferedImage image = new Robot().createScreenCapture(new Rectangle(new Dimension(w,h)));
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("./snaps/Alert.png"));
		
		//driver.getScreenshotAs(OutputType.FILE);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
