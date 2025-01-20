package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginSteps {
	
 WebDriver driver;

@Given("user is on login home page")
public void user_is_on_login_homepage()
{
	driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank");
	driver.manage().window().maximize();
}
	
@When("user enters the un {string}")
public void user_enters_the_username(String username)
{
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);

}

@And("user enters the pw {string}")
public void user_enters_the_password(String password)
{
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
}


@And("user cliks on login button")
public void user_cliks_on_login_button()
{
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
}

@Then("Accounts overview page is displayed")
public void Accountsoverview_page_is_displayed()
{
	WebElement logined = driver.findElement(By.xpath("//div[@id='showOverview']/h1"));
	Assert.assertEquals(logined.getText(), "Accounts Overview");

}

@After
public void tearDown() {
    // Close the browser after each scenario
    if (driver != null) {
        driver.quit();
    }
}

}
