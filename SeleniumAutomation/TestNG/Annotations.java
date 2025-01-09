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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	
	WebDriver driver ;
	
@BeforeClass
public void setup()
{
	driver = new ChromeDriver();
	System.out.println("Driver initialization");
}


@BeforeMethod 
public void siteLaunch()
{
	driver.get("https://www.google.co.in/");
}

@Test(priority=1)
public void verifyTitle()
{
	String title = driver.getTitle();
	Assert.assertTrue(title.contains("Google"), "launched incorrect website");
	System.out.println("Test1 completed");
}

@Test(priority =2)
public void search()
{
	WebElement searchbox = driver.findElement(By.name("q"));
	searchbox.sendKeys("TestNG automation");
	driver.findElement(By.name("btnK"));
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement searchresult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='q']")));
	Assert.assertTrue(searchresult.isDisplayed(),"element not present and serach result not displayed");
	System.out.println("Test2 completed");
}

@AfterMethod
public void teardownMethod()
{
	driver.manage().deleteAllCookies();
	System.out.println("done executing method");
}

@AfterClass
public void teardownClass()
{
	driver.quit();
	  System.out.println("Driver closed");
}






}
