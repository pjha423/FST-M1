package Activity;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MultipleElements {
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<Your device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void listElements() throws InterruptedException {
        // Open the page in browser
        driver.get("https://www.training-support.net/selenium/lists");
        // Wait for elements to load
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(MobileBy.xpath("//android.widget.ListView")));
        Thread.sleep(2000);

        // Find all text elements on the page
        List<MobileElement> textItems = driver.findElementsByClassName("android.widget.TextView");
        for(MobileElement textItem : textItems) {
            System.out.println(textItem.getText());
        }

        // Find the inner list items of unordered list
        List<MobileElement> uListItems = driver.findElementsByXPath("//android.widget.ListView//android.widget.ListView//android.view.View/android.widget.TextView");
        for(MobileElement uListItem : uListItems) {
            System.out.println(uListItem.getText());
        }
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}