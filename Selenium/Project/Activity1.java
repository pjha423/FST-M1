package LMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
        String title = driver.getTitle();
        System.out.println("Title : "+title);

        if(title.equals("Alchemy LMS – An LMS Application")){
            driver.close();
        }
    }
}
