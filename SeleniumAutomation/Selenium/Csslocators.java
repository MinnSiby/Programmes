package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocators {
	
	public static void main (String[] args) {
	
	WebDriver dr = new ChromeDriver();
	dr.get("https://rahulshettyacademy.com/AutomationPractice/");
	dr.manage().window().maximize();
	dr.findElement(By.cssSelector("input[value='radio1']")).click();
	dr.findElement(By.cssSelector("#checkBoxOption1")).click();
	dr.findElement(By.cssSelector("input#displayed-text.inputs.displayed-class")).sendKeys("mmm");
	dr.findElement(By.cssSelector("input#hide-textbox.btn-style.class2")).click();
	dr.findElement(By.cssSelector("#opentab")).click();

}
}
