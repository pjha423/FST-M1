package Activity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.google.com");

        driver.close();
    }
}

