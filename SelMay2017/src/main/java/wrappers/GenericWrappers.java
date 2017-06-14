package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrappers implements Wrappers{

	RemoteWebDriver driver;
	int i=1;

	public void invokeApp(String browser,String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
				driver = new ChromeDriver();	
			} else{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");	
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" Launched Successfully");
		} catch (WebDriverException e) {
			System.err.println("Unexpectedly Browser is closed");
		} finally {
			takeSnap();
			
		}
	}

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The Text field "+idValue+ " is entered with "+data);
		}catch (NoSuchElementException e) {
			//e.printStackTrace();
			System.err.println("The element "+idValue+ " is not found");
			throw new RuntimeException("Stop My Script");
		} catch (WebDriverException e) {
			System.err.println("Unexpectedly Browser is closed");
		} finally {
			takeSnap();			
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub

	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub

	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub

	}

	public void clickById(String id) throws InterruptedException {
		driver.findElementById(id).click();
		Thread.sleep(5000);
		System.out.println("The element with "+id+" is clicked");
		takeSnap();

	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The button "+classVal+" is clicked");
		} catch (NoSuchElementException e) {
			System.err.println("The element "+classVal+ " is not found");

		} catch (WebDriverException e) {
			System.err.println("Unexpectedly Browser is closed");
		} finally {
			takeSnap();			
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByLink(String name) {
		driver.findElementByLinkText(name).click();
		System.out.println("The Link "+name+ " is clicked");
		takeSnap();
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

	}

	public void selectIndexById(String id, String value) {
		// TODO Auto-generated method stub

	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub

	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	public void closeBrowser() {
		driver.close();
		// TODO Auto-generated method stub

	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest =  new File("./snap/snap"+i+".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}


	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

	}


	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}


	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

	}


	public void dismissAlert() {
		// TODO Auto-generated method stub

	}


	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}



	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}








