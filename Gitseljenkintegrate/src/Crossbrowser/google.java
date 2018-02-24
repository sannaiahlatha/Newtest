package Crossbrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class google extends Login {
	
@Test
public void test2() throws Exception {
{
	WebElement reportsmnu = driver.findElement(By.cssSelector("li[optionid='27'] a[class='k-link']"));
	String Text=reportsmnu.getText();
	((JavascriptExecutor) driver).executeScript("arguments[0].click()", reportsmnu);
	if(Text.equalsIgnoreCase("Welcome to Pivot")) 
	{ System.out.println("pass");
		}
	else {System.out.println("fail");}
	}

}


}