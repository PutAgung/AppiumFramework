package runners;

import Automation.AppiumBase;
import Automation.SlackReporting;
import com.slack.api.methods.SlackApiException;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.io.IOException;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "step_definitions",
        plugin = {"json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke"
)
public class TestRunner {

    @BeforeClass
    public static void setup() throws Exception {
        AppiumBase.setup();
    }

    @AfterClass
    public static void teardown() {
        AppiumBase.tearDown();
        try {
            SlackReporting.sendResultsToSlack("Test execution completed.");
        } catch (IOException | SlackApiException e) {
            e.printStackTrace();
        }
    }
}
