package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(text(),'Send us a message')]"))));


        driver.findElement(By.id("//input[@id='wpforms-8-field_0']")).sendKeys("Preeti Jha");
        driver.findElement(By.id("//input[@id='wpforms-8-field_1']")).sendKeys("preetijha423@gmail.com");
        driver.findElement(By.id("//input[@id='wpforms-8-field_3']")).sendKeys("Text");
        driver.findElement(By.id("//textarea[@id='wpforms-8-field_2']")).sendKeys("Message");

        driver.findElement(By.id("//button[@data-submit-text='Send Message']']")).click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='wpforms-confirmation-container wpforms-confirmation-scroll']"))));

        WebElement message = driver.findElement(By.xpath("//div[@class='wpforms-confirmation-container wpforms-confirmation-scroll']"));

        String messageDisplayed = message.getText();

        System.out.println("Message displayed : "+messageDisplayed);

    }
}
