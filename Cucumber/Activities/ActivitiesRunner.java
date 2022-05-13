package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature",
        glue = {"src/test/java/stepDefinitions"},
        tags = "@activity4",
        plugin = {"json: test-reports/json-report.json"},
        monochrome = true

)

public class ActivitiesRunner {
    //empty
}