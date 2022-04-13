package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
        WebElement mostPopCourse = driver.findElement(By.xpath("//h3[contains(text(),'mail')]"));

        String courseTitle = mostPopCourse.getText();
        System.out.println("First Info Box title : "+courseTitle);
        if(courseTitle.equals("Email Marketing Strategies")) {
            driver.close();
        }

    }
}
