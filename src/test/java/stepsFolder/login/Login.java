package stepsFolder.login;

import PageObject.login.LoginPageObject;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;


public class Login extends DriverManager {
    private WebDriver driver;
    private LoginPageObject loginPageObject;

    public Login() {
    }
    public Login(LoginPageObject loginPageObject, WebDriver driver) {
        this.driver = driver;
        this.loginPageObject = loginPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        this.driver = DriverManager.getDriver();
        loginPageObject = new LoginPageObject(DriverManager.getDriver());
    }

    @Given("User on login page")
    public void user_on_login_page()  {
        loginPageObject.userOnLoginPage();
    }

    @When("Enter {string} and {string}")
    public void enter_email_and_password(String email, String password) {
        loginPageObject.enterEmail(email);
        loginPageObject.enterPassword(password);
    }

    @When("Click submit button")
    public void click_submit_button() throws InterruptedException {
        loginPageObject.clickLogin();
    }

    @Then("User dashboard visible")
    public void user_dashboard_visible() throws InterruptedException {
        loginPageObject.successfullyLogin();
    }


    @Then("The check your box page is visible")
    public void theCheckboxPageIsVisible() throws InterruptedException {
        loginPageObject.checkYourBoxPage();
    }


    @Then("User not redirect to another page")
    public void userNotRedirectToAnotherPage() throws InterruptedException {
        loginPageObject.userOnLoginPage();
    }
}
