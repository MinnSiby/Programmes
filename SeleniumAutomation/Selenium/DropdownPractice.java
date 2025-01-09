package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) {

		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		dr.manage().window().maximize();
		String text = dr.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println(text);
		dr.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		Select dropdown = new Select(dr.findElement(By.cssSelector("#dropdown-class-example")));
		dropdown.selectByVisibleText(text);

		dr.findElement(By.cssSelector("input#name.inputs")).sendKeys(text);
		dr.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String alerttext=dr.switchTo().alert().getText();
		dr.switchTo().alert().accept();
		if(alerttext.contains(text))
		{
			System.out.println("Yes option2 is present ");
		}
		else
		{
			System.out.println("No option2 is not present");
		}
		
	}

}
