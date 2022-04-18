package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://alchemy.hguy.co/lms");
        WebElement allCourses = driver.findElement(By.xpath("//a[text()='All Courses']"));
        allCourses.click();

        driver.findElement(By.xpath("//a[text()='All Courses']"));

        //Click on 'see more' link of social media marketing course
        driver.findElement(By.xpath("//a[contains(text(),'See more')]/ancestor::article[@id='post-69']")).click();

        //Check course details are displayed
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Social Media Marketing')]/ancestor::article[@id='post-69']"))));
        WebElement courseHeading = driver.findElement(By.xpath("//h1[contains(text(),'Social Media Marketing')]/ancestor::article[@id='post-69']"));

        if (courseHeading.isDisplayed()){
            driver.findElement(By.xpath("//div[contains(text(),'Developing Strategy')]")).click();
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'Complete')]"))));

            //Click on complete button
            driver.findElement(By.xpath("//span[contains(text(),'Complete')]")).click();

            driver.close();
        }





    }
}
