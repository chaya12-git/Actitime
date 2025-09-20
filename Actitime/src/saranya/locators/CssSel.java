package saranya.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSel {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/saran/OneDrive/Desktop/demo.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[name='n2']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		Thread.sleep(1000);
		// Exception it is throwing for below : ElementNotInteractableException
		//driver.findElement(By.cssSelector("span[class='inline-block']")).click();
		driver.quit();

	}

}
