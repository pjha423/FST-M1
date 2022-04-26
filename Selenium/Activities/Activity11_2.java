package Activity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        driver.findElement(By.cssSelector("button#prompt")).click();

        Alert confirm = driver.switchTo().alert();
        String AlertText = confirm.getText();
        System.out.println("Alert text is: " + AlertText);

        confirm.accept();

        driver.findElement(By.cssSelector("button#confirm")).click();
        driver.switchTo().alert();
        confirm.dismiss();


    }
}
