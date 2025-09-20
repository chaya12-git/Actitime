package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastBeforeOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement dropDown = driver.findElement(By.id("month"));
		Select s = new Select(dropDown);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		if(count>=0)
		{
			s.selectByIndex(count-2);
			System.out.println("is selected");
		}
		else
		{
			System.out.println("Not selected");
		}
		driver.quit();	}

}