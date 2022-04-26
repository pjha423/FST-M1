package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");

        String title = driver.getTitle();

        System.out.println("Title of the page: "+title);

        WebElement weThirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']"));
        String strThirdHeaderText = weThirdHeader.getText();

        System.out.println("Third header text: "+strThirdHeaderText);

        String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fifth header's colour is: " + fifthHeaderColour);

        String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println("Violet button's classes are: " + violetButtonClasses);


        String greyButton = driver.findElement(By.xpath("//button[@class='ui grey button']")).getText();

        System.out.println("Grey button text: "+greyButton);

    }

}
