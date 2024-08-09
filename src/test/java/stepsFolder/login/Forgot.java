package stepsFolder.login;

import PageObject.login.ForgotPageObject;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Forgot {
    private WebDriver driver;
    private ForgotPageObject forgotPageObject;

    public Forgot() {
    }

    public Forgot(WebDriver driver, ForgotPageObject forgotPageObject) {
        this.driver = driver;
        this.forgotPageObject = forgotPageObject;
    }


    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        this.driver = DriverManager.getDriver();
        forgotPageObject = new ForgotPageObject(DriverManager.getDriver());
    }

    @Given("User redirect to Forgot page")
    public void user_redirect_to_forgot_page() {
        forgotPageObject.userGOForgotPage();
    }

    @Given("User is on forgot page")
    public void user_is_on_forgot_page() {
        forgotPageObject.userOnForgotPage();
    }

    @When("User enter valid {string}")
    public void user_enter_valid(String email) {
        forgotPageObject.enterEmail(email);
    }

    @When("Click Forgot Button")
    public void click_forgot_button() throws InterruptedException {
        forgotPageObject.sendLinkBtn();

    }

    @Then("User not redirect from forgot page")
    public void userNotRedirectFromForgotPage() {
        forgotPageObject.userOnForgotPage();
    }



    @And("Show invalid email error message")
    public void showInvalidEmailErrorMessage() throws InterruptedException {
        forgotPageObject.errorMsgShowForInvalidEamil();

    }

    @And("Show null error message")
    public void showNullErrorMessage() throws InterruptedException {
     forgotPageObject.errorMsgShowForNullEmail();
    }
}
