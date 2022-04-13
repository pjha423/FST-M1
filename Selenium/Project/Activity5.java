package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity5 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://alchemy.hguy.co/lms");
        WebElement myAccount = driver.findElement(By.xpath("//a[text()='My Account']"));
        myAccount.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'My Account')]"))));

        WebElement newPage = driver.findElement(By.xpath("//h1[contains(text(),'My Account')]"));
        String newPageHeading = newPage.getText();
        if(newPageHeading.equals("My Account")){
            driver.close();
        }





    }
}
