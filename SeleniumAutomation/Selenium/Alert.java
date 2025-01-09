package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		dr.manage().window().maximize();
		dr.findElement(By.id("name")).sendKeys("Minnu");
		dr.findElement(By.id("confirmbtn")).click();
		String alerttext = dr.switchTo().alert().getText();
		System.out.println(alerttext);
		dr.switchTo().alert().accept();

	}

}
