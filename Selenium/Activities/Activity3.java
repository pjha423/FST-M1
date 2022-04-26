package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String [] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);

        driver.findElement(By.id("firstName")).sendKeys("Preeti");
        driver.findElement(By.id("lastName")).sendKeys("Raj");

        driver.findElement(By.id("email")).sendKeys("preetijha423@gmail.com");
        driver.findElement(By.id("number")).sendKeys("123456789");

        driver.findElement(By.cssSelector(".ui.green.button")).click();

        Thread.sleep(2000);
        driver.close();





    }
}
