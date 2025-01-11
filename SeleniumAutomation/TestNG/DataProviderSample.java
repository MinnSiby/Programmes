package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderSample {
	
	WebDriver driver;
	
@BeforeTest
public void testSetup()
{
	driver = new ChromeDriver();
	System.out.println("driver initialization");
}
	
@BeforeClass
public void classSetup()
{
	driver.get("https://openweathermap.org");
	driver.manage().window().maximize();
	System.out.println("Before executing class methods");
}


@DataProvider(name="cityData")
public Object[][] getCityData()
{
	return new Object[][] {
	{"Germany"},
	{"New York"},
	{"Delhi"}
			
	};
}

	
@Test(dataProvider="cityData")
public void searchWeather(String city) throws InterruptedException 
{
	WebElement searchCity = driver.findElement(By.xpath("//div[@class='search-container']/input"));
	
	searchCity.clear();
	searchCity.sendKeys(city);
	
	
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement firstOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='search-container']/ul/li[1]")));
	String firstOptionCity = firstOption.getText();
	System.out.println("first option details is " +firstOptionCity);
	firstOption.click();
	
	
	By correctCity = By.xpath("//h2[contains(text(),'"+ city +"')]");
	WebElement displayResult = wait.until(ExpectedConditions.visibilityOfElementLocated(correctCity));
	String cityname = displayResult.getText();
	System.out.println("current search city is " +cityname);
	Assert.assertTrue(firstOptionCity.contains(cityname), " searched incorrect city");
}
	
@AfterClass
public void teardownClass()
{
driver.manage().deleteAllCookies();
System.out.println("done executing all methods");
}
	
	
@AfterTest
public void teardownTest()
{
	driver.quit();
	
}

}
