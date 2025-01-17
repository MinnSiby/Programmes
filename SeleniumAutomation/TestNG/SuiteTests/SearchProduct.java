package TestNG.SuiteTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchProduct extends BaseTest{
	
	
@BeforeClass
public void classSetup()
{
	System.out.println("SearchProduct class test execution begins");
}
	
@Test(dependsOnMethods="TestNG.SuiteTests.LoginTest.login")
public void Search()
{
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("camera");
	action.sendKeys(Keys.ENTER).perform();
	String resultText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"))).getText();
	Assert.assertTrue(resultText.contains("camera"), "Incorrect search");
	
}

@AfterClass
public void tearDownClass()

{
	System.out.println("Done executing searchproduct class");
}	
	
	
	

}
