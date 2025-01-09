package Selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/");
		dr.manage().window().maximize();
		dr.findElement(By.linkText("Nested Frames")).click();
		
		
		dr.switchTo().frame("frame-top");
		WebElement frameset = dr.findElement(By.name("frameset-middle"));
		dr.switchTo().frame(frameset.findElement(By.name("frame-middle"))); 
		String frametext=dr.findElement(By.xpath("//div[@id='content']")).getText();
		System.out.println(frametext);
	}

}
