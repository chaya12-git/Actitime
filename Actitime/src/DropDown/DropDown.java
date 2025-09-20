package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class DropDown {
    public static void main(String[] args) {

        // Get value from user using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year to check in dropdown: ");
        String value = scanner.nextLine();

        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open Facebook signup page
        driver.get("https://www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();

        // Locate dropdown and wrap with Select class
        WebElement dd = driver.findElement(By.id("year"));
        Select s = new Select(dd);
        List<WebElement> allOpts = s.getOptions();

        int count = 0;
        for (int i = 0; i < allOpts.size(); i++) {
            String text = allOpts.get(i).getText();
            if (text.equalsIgnoreCase(value)) {
                count++;
                break;
            }
        }

        if (count > 0) {
            System.out.println(value + " is present in the dropdown");
        } else {
            System.out.println(value + " is not present in the dropdown");
        }

        driver.quit();
        scanner.close();
    }
}
