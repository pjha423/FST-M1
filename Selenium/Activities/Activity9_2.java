package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects ");
        System.out.println("Title of the page : " + driver.getTitle());

        WebElement selectedValues = driver.findElement(By.id("multi-value"));
        WebElement multiSelect = driver.findElement(By.id("multi-select"));

        Select mulSelect = new Select(multiSelect);


        mulSelect.selectByVisibleText("Javascript");
        System.out.println(selectedValues.getText());

        mulSelect.selectByValue("node");
        System.out.println(selectedValues.getText());

        for(int i=4; i<=6; i++) {
            mulSelect.selectByIndex(i);
        }
        System.out.println(selectedValues.getText());


        mulSelect.deselectByValue("node");
        System.out.println(selectedValues.getText());

        mulSelect.deselectByIndex(6);
        System.out.println(selectedValues.getText());

        List<WebElement> selectedOptions = mulSelect.getAllSelectedOptions();

        for(WebElement option: selectedOptions){
            System.out.println("Selected options : "+option.getText());
        }

        mulSelect.deselectAll();
        System.out.println("Deselect all : "+selectedValues.getText());
    }
}
