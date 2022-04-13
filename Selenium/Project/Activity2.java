package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
        WebElement pageHeading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
        String heading = pageHeading.getText();
        System.out.println("Heading : "+heading);

        if(heading.equals("Learn from Industry Experts")) {
            driver.close();
        }
    }

}
