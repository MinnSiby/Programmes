package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoblazeSteps {
	
WebDriver driver;
	
@Given("User is on demoblaze website")
public void User_is_on_demoblaze_website()
{
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();
}

	
@When("user clicks on Mointors category")	
public void user_clicks_on_Mointors_category()
{
	
	driver.findElement(By.xpath("//a[text()='Monitors']")).click();
}


@And("user clicks on the product {string}")
public void user_clicks_on_the_product(String product) 
{
	driver.findElement(By.linkText(product)).click();
}


@And("user cliks on Add to cart button")
public void user_cliks_on_Addtocart_button() throws InterruptedException
{
	driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
	        driver.switchTo().alert().accept();
	    } else {
	        System.out.println("No alert present after adding to cart.");
	    }
}


@Then("product should be present in the cart option")
public void product_should_be_present_in_the_cart_option()
{
	driver.findElement(By.xpath("//a[@id='cartur']")).click();
	WebElement product = driver.findElement(By.xpath("//tr[@class='success']/td[2]"));
	Assert.assertEquals(product.getText(),"Apple monitor 24");
}


}
