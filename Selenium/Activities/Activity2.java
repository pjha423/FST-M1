package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String [] args ){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Title of the page: "+title);

        WebElement idLoc = driver.findElement(By.id("about-link"));
        System.out.println("Text in element: " + idLoc.getText());

        WebElement classNameLoc = driver.findElement(By.className("green"));
        System.out.println("Text in element: " + classNameLoc.getText());

        WebElement linkTextLoc = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLoc.getText());

        WebElement cssSelectorLoc = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssSelectorLoc.getText());



    }

}
