package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);


        driver.get("https://www.training-support.net/selenium/input-events");

        String title = driver.getTitle();
        System.out.println("Title of the page " + title);

        WebElement we = driver.findElement(By.id("keyPressed"));

        action.sendKeys("P").build().perform();
        String keyText = we.getText();
        System.out.println("Pressed key text "+keyText);

        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        keyText = we.getText();
        System.out.println("text "+keyText);



    }
}
