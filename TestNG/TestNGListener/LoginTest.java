package TestNGListener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class LoginTest {
	
WebDriver driver;

@BeforeMethod
public void  setup()
{
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
}
	
@Test
public void validLogin()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement dashborad=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
	Assert.assertTrue(dashborad.isDisplayed(), "Login unsuccessful");
}

@Test
public void invalidLogin()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Adm");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1234");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement errormessage =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(string(.), 'Invalid credentials')]")));
	Assert.assertTrue(errormessage.isDisplayed(), "Login successful");
}

@Test
public void incorrectCredentials() // Fail Test
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin34");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin12378");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement dashborad=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
	Assert.assertTrue(dashborad.isDisplayed(), "Login unsuccessful");
}

}
