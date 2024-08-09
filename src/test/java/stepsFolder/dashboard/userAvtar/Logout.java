package stepsFolder.dashboard.userAvtar;

import PageObject.dashboard.userAvtar.LogoutPageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Logout {
    private WebDriver driver;
    private LogoutPageObject logoutPageObject;

    public Logout() {
    }

    public Logout(WebDriver driver, LogoutPageObject logoutPageObject) {
        this.driver = driver;
        this.logoutPageObject = logoutPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        this.driver = DriverManager.getDriver();
        logoutPageObject = new LogoutPageObject(DriverManager.getDriver());
    }

    @Given("user on home page")
    public void userOnHomePage() {
    }

    @When("user click on user-avtar")
    public void user_click_on_user_avtar() {
logoutPageObject.clickOnUserAvtar();
    }


    @When("user click logout option")
    public void user_click_logout_option() throws InterruptedException {
logoutPageObject.logout();
    }

    @When("Enter valid email and password")
    public void enterValidEmailAndPassword() {
      logoutPageObject.enterEmailForUser();
      logoutPageObject.enterPasswordForuser();
    }
    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
