package Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        String title = driver.getTitle();

        System.out.println("Title of the page is "+title);

        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        System.out.println("Number of columns:"+cols.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows:"+rows.size());

        WebElement secondRow = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column text before sorting: "+secondRow.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();

        WebElement secondRowValAfter = driver.findElement(By.xpath("//table[@class='ui sortable celled table']/tbody/tr[2]/td[2]"));
        System.out.println("Second row second column text before sorting: "+secondRowValAfter.getText());


    }
}
