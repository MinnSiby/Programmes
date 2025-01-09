package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProvider {
	
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












	
@Test
public void searchWeather() 
{
	WebElement searchCity = driver.findElement(By.xpath("//div[@class='search-container']/input"));
	searchCity.sendKeys("London");
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	WebElement firstOption = driver.findElement(By.xpath("//div[@class='search-container']/ul/li[1]"));
	String title = firstOption.getText();
	System.out.println("first option details is " +title);
	firstOption.click();
	WebElement displayResult = driver.findElement(By.xpath("//div[@class='current-container mobile-padding']/div/h2"));
	String city = displayResult.getText();
	System.out.println("current search city is " +city);
	Assert.assertTrue(title.contains(city), " searched incorrect city");
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
