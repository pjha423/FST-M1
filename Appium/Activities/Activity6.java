package Activity;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity6 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);


        // Navigate to the page
        driver.get("https://www.training-support.net/selenium/lazy-loading");
    }

    @Test
    public void scrollTest() throws InterruptedException {
        MobileElement pageTitle = driver.findElementByClassName("android.widget.TextView");
        //wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));
        Thread.sleep(5000);

        List<MobileElement> noOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");

        System.out.println("Number of image shown currently: " + noOfImages.size());

        // Assertion before scrolling
        Assert.assertEquals(noOfImages.size(), 4);

        // Scroll to Helen's post
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).scrollTextIntoView(\"helen\")"));

        // Find the number of images shown after scrolling
        noOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
        System.out.println("Number of image shown currently: " + noOfImages.size());

        // Assertion after scrolling
        Assert.assertEquals(noOfImages.size(), 4);

    }

    @AfterClass
    public void afterClass() {
        //driver.quit();
    }
}
