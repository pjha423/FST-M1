package LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity7 {
    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://alchemy.hguy.co/lms");
        WebElement allCourses = driver.findElement(By.xpath("//a[text()='All Courses']"));
        allCourses.click();


        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'All Courses')]"))));
        List<WebElement> findAllCourses = driver.findElements(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 ']"));
        int numberOfCoursesAvailable = findAllCourses.size();

        System.out.println("Number of courses on the page : " + numberOfCoursesAvailable);

    }
}
