package Selenium.Practice;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebdriverscope {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		dr.manage().window().maximize();
		
		System.out.println(dr.findElements(By.tagName("a")).size());
		WebElement footerdriver = dr.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement column1 = dr.findElement(By.xpath("//div[@id='gf-BIG']//ul"));
		System.out.println(column1.findElements(By.tagName("a")).size());
		
		
		List<WebElement> links = column1.findElements(By.tagName("a"));
		int count= links.size();
		for(int i=1;i<count;i++)
		{
			String clickmethod =Keys.chord(Keys.CONTROL,Keys.ENTER); //opens the link in a new browser tab 
			column1.findElements(By.tagName("a")).get(i).sendKeys(clickmethod);
			Thread.sleep(5000);

		}
		
		Set<String> handles = dr.getWindowHandles();
		Iterator<String>itr = handles.iterator();
		while(itr.hasNext())
		{
			dr.switchTo().window(itr.next());
			System.out.println(dr.getTitle());
			
		}
		
		
		dr.close();
		

	}
}

