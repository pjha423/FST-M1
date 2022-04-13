package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
        WebElement firstInfoBoxTitle = driver.findElement(By.xpath("//h3[contains(text(),'Actionable')]"));

        String infoBoxTitle = firstInfoBoxTitle.getText();
        System.out.println("First Info Box title : "+infoBoxTitle);
        if(infoBoxTitle.equals("Actionable Training")) {
            driver.close();
        }

    }
}
