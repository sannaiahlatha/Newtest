package Crossbrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	RemoteWebDriver driver;
	
	@Parameters({ "Browser" })
	@BeforeTest
	public void invoke(String Browser) throws Exception {
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-infobars");
		cap.setCapability(	ChromeOptions.CAPABILITY, options);
		
		if(Browser.equalsIgnoreCase("chrome")) {
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
			driver = new ChromeDriver();}
		else if(Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:/SeleniumDrivers/IEDriverServer64.exe");
			driver = new InternetExplorerDriver();
		}
		else {
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);}
		driver.navigate().to("https://ha.stagepivot.rrd.com");
		Thread.sleep(5000);
			driver.findElementByName("UserName").sendKeys("Manohar");
			driver.findElementByName("Password").sendKeys("Spring*5");
			WebElement abc=driver.findElementByName("btnLogin");
			abc.click();
			Thread.sleep(6000);
			}
	
	@AfterTest
	public void close() throws Exception {
		driver.quit();
	}
}