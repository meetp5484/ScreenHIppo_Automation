package stepsFolder.dashboard;

import PageObject.dashboard.ScreensPageObject;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Screens {
    private WebDriver driver;
    private ScreensPageObject screensPageObject;

    public Screens() {
    }

    public Screens(WebDriver driver, ScreensPageObject screensPageObject) {
        this.driver = driver;
        this.screensPageObject = screensPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
//        this.driver = DriverManager.getDriver();
        screensPageObject = new ScreensPageObject(DriverManager.getDriver());
    }

    @When("User click on pair screen button")
    public void user_click_on_pair_screen_button() {
screensPageObject.clickOnPairScreens();

    }

    @When("Enter valid Pin Code {string}")
    public void enter_valid_pin_code(String pinCode) throws InterruptedException {
        screensPageObject.enterPinCode(pinCode);
    }

    @Then("screen is connected")
    public void screen_is_connected() {

    }

}
