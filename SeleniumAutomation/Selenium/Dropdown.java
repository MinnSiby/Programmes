package Selenium.Practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select select = new Select(dr.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText("Option1");
		select.selectByValue("option2");
		select.selectByIndex(3);
		
		List<WebElement>values = dr.findElements(By.tagName("option"));
		System.out.println(values.size());
		for(WebElement dropdownvalues : values)
		{
			System.out.println(dropdownvalues.getText());
		}

	}

}
