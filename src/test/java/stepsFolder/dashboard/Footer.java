package stepsFolder.dashboard;

import PageObject.dashboard.FooterPageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Footer {
    private WebDriver driver;
    private FooterPageObject footerPageObject;

    public Footer() {
    }

    public Footer(WebDriver driver, FooterPageObject footerPageObject) {
        this.driver = driver;
        this.footerPageObject = footerPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        footerPageObject = new FooterPageObject(DriverManager.getDriver());
    }

    @Then("power by screen hippo visible at bottom")
    public void power_by_screen_hippo_visible_at_bottom() {
        footerPageObject.footerTextVisible();
    }

    @When("User click on contact us")
    public void userClickOnContactUs() {
        footerPageObject.clickOnContacts();
    }

    @Then("User on contact us page")
    public void userOnContactUsPage() throws InterruptedException {
        footerPageObject.userOnContactUsPage();
    }

    @When("User click on privacy policy")
    public void userClickOnPrivacyPolicy() {
        footerPageObject.userClickOnPrivacyPolicy();
    }

    @Then("User on privacy policy page")
    public void userOnPrivacyPolicyPage() throws InterruptedException {
        footerPageObject.userOnPricacyPolicy();
    }

    @When("User click on terms and conditions")
    public void userClickOnTermsAndConditions() {
        footerPageObject.userClickOnTermsAndConditions();
    }

    @Then("User on terms and conditions page")
    public void userOnTermsAndConditionsPage() throws InterruptedException {
        footerPageObject.userOnTermsAndConditions();
    }

}
