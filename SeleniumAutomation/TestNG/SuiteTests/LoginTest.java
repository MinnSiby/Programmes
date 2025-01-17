package TestNG.SuiteTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest extends BaseTest{


@BeforeSuite
public void Suitesetup()
{
	System.out.println("Amazon login check");
}


	
@BeforeClass
public void classSetup()
{
	System.out.println("Login Test class execution :");
}
	
	
@Test
public void login() 
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	action.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).click().build().perform();	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#ap_email"))).sendKeys("minnusiby5@gmail.com");
	driver.findElement(By.cssSelector("input#continue")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_password']"))).sendKeys("Minnusiby@96");
	driver.findElement(By.cssSelector("input#signInSubmit")).click();
	String welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.nav-line-1-container>span"))).getText();
	Assert.assertEquals("Hello, Minnu", welcomeMessage);
}
		
@AfterClass
public void tearDownClass()

{
	System.out.println("Done executing login class");
}



}
