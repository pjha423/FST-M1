package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://alchemy.hguy.co/lms");
        WebElement myAccount = driver.findElement(By.xpath("//a[text()='My Account']"));
        myAccount.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'My Account')]"))));

        WebElement newPage = driver.findElement(By.xpath("//h1[contains(text(),'My Account')]"));
        String newPageHeading = newPage.getText();
        Boolean blnNewPage = newPage.isDisplayed();

        if(blnNewPage){
            driver.findElement(By.xpath("//a[contains(@class,'login')]")).click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user_login"))));

            //Enter username
            driver.findElement(By.id("user_login")).sendKeys("root");

            //Enter password
            driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
            //Click login button
            driver.findElement(By.xpath("//input[@value='Log In']")).click();

            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='ld-profile-edit-link']"))));
            Boolean blnLoggedIn = driver.findElement(By.xpath("//a[@class='ld-profile-edit-link']")).isDisplayed();

            if (blnLoggedIn){
                System.out.println("Logged In successfully");
                driver.close();
            }

        }

    }
}
