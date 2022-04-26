package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");

        String title = driver.getTitle();
        System.out.println("Title of the page "+title);

        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        //left click
        action.click(cube);
        WebElement valueNow = driver.findElement(By.className("active"));
        System.out.println("Left click: "+valueNow.getText());

        //double click
        action.doubleClick(cube).perform();
        valueNow = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + valueNow.getText());

        //Right click
        action.contextClick(cube).perform();
        valueNow = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + valueNow.getText());



    }
}
