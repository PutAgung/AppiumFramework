package step_definitions;

import Automation.AppiumBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SampleSteps extends AppiumBase {

    @Before
    public void setUp(Scenario scenario) {
        // Add any setup steps needed before each scenario
        System.out.println("Running Scenario: " + scenario.getName());
    }


    @Given("^the app is open$")
    public void theAppIsOpen() {
        // Add your Appium code to open the app
        System.out.println("App is open");
    }

    @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterUsernameAndPassword(String username, String password) {
        // Add your Appium code to enter username and password
        System.out.println("Entering username: " + username + " and password: " + password);
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        // Add your assertions or verifications for successful login
        System.out.println("Logged in successfully");
    }

    @After
    public void tearDown(Scenario scenario) {
        // Add any teardown steps needed after each scenario
        if (scenario.isFailed()) {
            // Take screenshot or perform other actions on failure
            System.out.println("Scenario failed! Taking screenshot...");
        }
    }
}
