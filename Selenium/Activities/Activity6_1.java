package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();

        System.out.println("Title of the page: " + title);
        WebElement checkbox =  driver.findElement(By.name("toggled"));

        System.out.println("Checkbox displayed :"+checkbox.isDisplayed());

        //Click on Remove Checkbox button
        driver.findElement(By.id("toggleCheckbox")).click();

        wait.until(ExpectedConditions.invisibilityOf(checkbox));

        //Click on Add Checkbox button
        driver.findElement(By.id("toggleCheckbox")).click();

        wait.until(ExpectedConditions.visibilityOf(checkbox));



    }
}
