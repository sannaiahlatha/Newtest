package Crossbrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebook2 extends Login {
	
	@Test
	public void test1() throws Exception 
	{
		WebElement abc=driver.findElementByCssSelector("div[class='abs-left-logo']");
		if(abc.isDisplayed()) 
		{ System.out.println("logo pass");
			}
		else {System.out.println("logo fail");}
	}
}