package DropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionsInAlphabeticOrder {
	public static void main(String[] args) throws InterruptedException {
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
		ArrayList<String> elements = new ArrayList<>();
		for(WebElement Options : allOptions)
		{
			elements.add(Options.getText());
		}
		Collections.sort(elements);
		for(String element:elements)
		{
			System.out.println(element);
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}