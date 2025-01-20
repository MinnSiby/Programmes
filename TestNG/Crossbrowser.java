package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crossbrowser 
{
	WebDriver driver;

@Parameters({"Browser"})
@BeforeTest
public void setup(String browser)
{
	if(browser.equals("Chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(browser.equals("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equals("Edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		System.out.println("Unsupported browser");
	}

	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
}

@Test
public void Search()
{
	driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title']")).sendKeys("Traffic light");
	driver.findElement(By.cssSelector("button.ytSearchboxComponentSearchButton")).click();
	
	//To select 1 st video suggestion
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement firstResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='contents']/ytd-video-renderer[1]")));
	String title= driver.findElement(By.xpath("//div[@id='contents']/ytd-video-renderer[1]//div[@id='title-wrapper']//a")).getText();
	System.out.println(title);
	firstResult.click();
	
}















	
@AfterTest
	public void teardownClass()
	{
		/*if (driver != null) 
		{
			driver.close();
		}*/
		System.out.println("done executing all methods in this test");
}

	

}
