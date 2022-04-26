package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");

        String title = driver.getTitle();

        System.out.println("Title of the page: " + title);

       WebElement checkbox =  driver.findElement(By.name("toggled"));

       System.out.println("Checkbox displayed :"+checkbox.isDisplayed());

       driver.findElement(By.id("toggleCheckbox")).click();

       System.out.println("Checkbox displayed :"+checkbox.isDisplayed());


    }
}
