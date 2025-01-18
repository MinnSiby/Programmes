package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelTest {
	
WebDriver driver;

@Parameters({"browser"})
@BeforeMethod
public void browserSetup(String browser)
{
	if (browser.equals("Chrome"))
	{
		driver = new ChromeDriver();
	}	
	else if(browser.equals("Firefox"))
	{
		driver = new FirefoxDriver();
	}	
	else if(browser.equals("Edge"))
	{
		driver = new EdgeDriver();
	}	
	else
	{
		System.out.println("Browser not supported");
	}
	driver.manage().window().maximize();
}
	

@Test
public void search()
{
	driver.get("https://www.wikipedia.org/");
	driver.findElement(By.cssSelector("input#searchInput")).sendKeys("Automation");
	//select 1 st option
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.suggestions-dropdown>a"))).click();
	WebElement resultPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Contents']")));
	Assert.assertTrue(resultPage.isDisplayed(), "search result page not displayed");
	
}
	
@AfterMethod
public void tearDown()
{
	if (driver != null) {
        driver.quit();
    }
}

}
