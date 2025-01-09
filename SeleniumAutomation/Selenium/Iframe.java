package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframe {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");	
		dr.switchTo().frame(dr.findElement(By.linkText("Courses")));
		dr.findElement(By.linkText("Courses")).click();
		dr.switchTo().defaultContent();
		
		

	}

}
