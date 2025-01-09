package Selenium.Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		dr.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		Set<String> windows = dr.getWindowHandles();
		
		
		Iterator <String>itr= windows.iterator();
		while(itr.hasNext())
		{
			dr.switchTo().window(itr.next());
			System.out.println(dr.getTitle());
		}
		
		
		for(String handle: windows)
		{
			dr.switchTo().window(handle);
			System.out.println(dr.getTitle());
		}
		
	}

}
