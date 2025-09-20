package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectInReverseOrder {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement dropDown = driver.findElement(By.id("select-multiple-native"));
		Select s = new Select(dropDown);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--)
		{
			s.deselectByIndex(i);
		}
		driver.quit();
	}

}