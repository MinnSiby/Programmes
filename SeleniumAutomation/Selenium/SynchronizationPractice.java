package Selenium.Practice;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SynchronizationPractice {

	public static void main(String[] args) {
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/loginpagePractise/");
		dr.manage().window().maximize();
		dr.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		dr.findElement(By.id("password")).sendKeys("learning");
		dr.findElement(By.xpath("//input[@value='user']/following-sibling::span[@class='checkmark']")).click();
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#okayBtn.btn.btn-success"))).click();
		Select dropdown = new Select(dr.findElement(By.xpath("//select[@class='form-control']")));
		dropdown.selectByVisibleText("Consultant");
		dr.findElement(By.cssSelector("#terms")).click();
		dr.findElement(By.xpath("//input[@id ='signInBtn']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-card-list[@class='row']")));
		WebElement cartadd = dr.findElement(By.xpath("//app-card-list[@class='row']"));
		List<WebElement> add = cartadd.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(int i=0; i<add.size();i++)
		{
			cartadd.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
		}
		
		
		dr.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}

}
