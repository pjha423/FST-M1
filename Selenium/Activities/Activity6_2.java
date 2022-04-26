package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/ajax");

        String title = driver.getTitle();

        System.out.println("Title of the page: " + title);

        WebElement changeContent = driver.findElement(By.xpath("//button[@class='ui violet button']"));
        changeContent.click();


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1"))));

        String helloText = driver.findElement(By.xpath("//h1")).getText();

        System.out.println("Text displaying:"+helloText);

    }
}
