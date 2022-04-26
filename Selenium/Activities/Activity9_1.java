package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects ");
        System.out.println("Title of the page : "+driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Option 2");
        System.out.println("Option selected : "+driver.findElement(By.id("single-value")).getText());

        select.selectByIndex(3);
        System.out.println("Option selected : "+driver.findElement(By.id("single-value")).getText());

        select.selectByValue("4");
        System.out.println("Option selected : "+driver.findElement(By.id("single-value")).getText());

        List<WebElement> options = select.getOptions();
        
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }



    }
}
