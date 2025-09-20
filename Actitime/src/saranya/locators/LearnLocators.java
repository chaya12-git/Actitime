package saranya.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//demo.html we have not created so this prg wont work.. we have to create html code for this
		driver.get("file:///C:/Users/saran/OneDrive/Desktop/demo.html");
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
		driver.navigate().back();
		WebElement ele1 = driver.findElement(By.id("D2"));
		ele1.click();
		driver.navigate().back();
		WebElement ele2 = driver.findElement(By.name("n1"));
		ele2.click();
		driver.navigate().back();
		driver.findElement(By.className("c2")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Qspiders")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Jsp")).click();

	}

}
