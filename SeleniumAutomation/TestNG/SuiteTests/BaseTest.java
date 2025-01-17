package TestNG.SuiteTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Actions action;
	
@BeforeTest
	public void testSetup()
	{
		
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		action = new Actions(driver);
		
	}
	
@AfterTest
	public void tearDown() 
	{
		driver.close();
		System.out.println("Done amazon check test");
	}

}
