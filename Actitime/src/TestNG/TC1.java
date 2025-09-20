package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Generic.actitime.BaseClass;

public class TC1 {

	@Test
	public void demoA() {
		String Expected_title = "Google";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String Actual_title = driver.getTitle();
		Assert.assertEquals(Actual_title, Expected_title);
		driver.quit();
	}
}
