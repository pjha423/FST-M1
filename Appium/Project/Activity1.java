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
import java.util.List;

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void createActivities() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement createNewTaskElement = driver.findElement(MobileBy.AndroidUIAutomator("description(\"Create new task\")"));

        createNewTaskElement.click();
        Thread.sleep(2000);
        MobileElement newTaskEdit = driver.findElementById("add_task_title");
        newTaskEdit.sendKeys("Complete Activity with Google Tasks");

        MobileElement saveTask = driver.findElementById("add_task_done");
        saveTask.click();
        Thread.sleep(2000);

        createNewTaskElement.click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_done\")")).click();
        //newTaskEdit.sendKeys("Complete Activity with Google Keep");
        //saveTask.click();
        Thread.sleep(2000);

        createNewTaskElement.click();
        Thread.sleep(2000);
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_title\")")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"com.google.android.apps.tasks:id/add_task_done\")")).click();
        //newTaskEdit.sendKeys("Complete the second Activity Google Keep");
        //saveTask.click();

        Thread.sleep(2000);

        MobileElement task1 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Complete Activity with Google Tasks\")"));
        Assert.assertEquals(task1.getText(),"Complete Activity with Google Tasks");

        MobileElement task2 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Complete Activity with Google Keep\")"));
        Assert.assertEquals(task2.getText(),"Complete Activity with Google Keep");

        MobileElement task3 = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Complete the second Activity Google Keep\")"));
        Assert.assertEquals(task3.getText(),"Complete the second Activity Google Keep");

    }
    @AfterClass
    public void afterClass() {
        //driver.quit();
    }
}
