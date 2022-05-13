package AppiumProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void googleKeep() throws InterruptedException {
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/new_note_button\")")).click();
        Thread.sleep(2000);

        //Enter title and description
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/editable_title\")")).sendKeys("Note1");
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/edit_note_text\")")).sendKeys("This is my note 1");

        //click on back button
        driver.findElement(MobileBy.AndroidUIAutomator("description(\"Open navigation drawer\")")).click();

        Thread.sleep(2000);
        String noteTitle = driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.keep:id/index_note_title\")")).getText();

        Assert.assertEquals(noteTitle,"Note1","Add Note");
    }
    @AfterClass
    public void afterClass() {
        //driver.quit();
    }
}
