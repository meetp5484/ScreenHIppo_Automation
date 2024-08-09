package stepsFolder.login;

import PageObject.login.SignupPageObject;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Signup extends DriverManager {
    private WebDriver driver;
    private SignupPageObject signupPageObject;

    public Signup() {
    }

    public Signup(WebDriver driver, SignupPageObject signupPageObject) {
        this.driver = driver;
        this.signupPageObject = signupPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        Faker faker = new Faker();
        signupPageObject = new SignupPageObject(DriverManager.getDriver(), faker);
    }


    @Given("User redirect to Signup page")
    public void user_redirect_to_Signup_page() {
        signupPageObject.createUser();
    }

    @Given("User is on SignUp Page")
    public void user_is_on_signup_page() {
        signupPageObject.userOnSignupPage();

    }

    @When("Enter {string}, {string} and Email with Special symbol")
    public void enterAndEmailWithSpecialSymbol(String Name, String Organization) throws InterruptedException {
        signupPageObject.enterName(Name);
        signupPageObject.enterOrganization(Organization);
        signupPageObject.enterEmailWithSpecialSymbol();

    }

    @And("Enter Phone No. with only digit")
    public void enterPhoneNoWithOnlyDigit() {
        signupPageObject.enterPhoneNo();
    }

    @And("Enter {string} with min character")
    public void enterWithMinCharacter(String Password) {
        signupPageObject.enterPassword(Password);

    }

    @And("Click Sign up button")
    public void clickSignUpButton() throws InterruptedException {
        signupPageObject.clickSignupBtn();
    }


    @When("Enter {string}, {string} and Email with Thirty characters")
    public void enterAndEmailWithThirtyCharacters(String Name, String Organization) throws InterruptedException {
        signupPageObject.enterName(Name);
        signupPageObject.enterOrganization(Organization);
        signupPageObject.enterEmail();
    }

    @And("Enter {string} with containing Seventy characters")
    public void enterWithContainingThirtyCharacters(String Password) {
        signupPageObject.enterPassword(Password);
    }

    @When("Enter {string}, {string} and Email with Thirty and more characters")
    public void enterAndEmailWithThirtyAndMoreCharacters(String Name, String Organization) throws InterruptedException {
        signupPageObject.enterName(Name);
        signupPageObject.enterOrganization(Organization);
        signupPageObject.enterEmail();
    }

    @And("Enter {string} with containing Thirty or more chracters")
    public void enterWithContainingThirtyOrMoreChracters(String Password) {
        signupPageObject.enterPassword(Password);
    }

    @Then("User not redirect from signupPage")
    public void userNotRedirectFromSignupPage() throws InterruptedException {
        signupPageObject.userOnSignupPage();
    }


    @When("Enter {string}, {string} and Email with Thirty or less characters")
    public void enterAndEmailWithThirtyOrLessCharacters(String Name, String Organization) throws InterruptedException {
        signupPageObject.enterName(Name);
        signupPageObject.enterOrganization(Organization);
        signupPageObject.enterEmail();
    }

    @And("Enter {string} with containing null")
    public void enterWithContainingNull(String Password) throws InterruptedException {
        signupPageObject.enterPassword(Password);

    }

    @When("Enter {string}, {string} and Email with null")
    public void enterAndEmailWithNull(String Name, String Organization) throws InterruptedException {
        signupPageObject.enterName(Name);
        signupPageObject.enterOrganization(Organization);
        signupPageObject.enterEmail();
    }

    @And("Enter {string} with null")
    public void enterWithNull(String PhoneNo) {
        signupPageObject.enterPhoneNoWithNull(PhoneNo);
    }

}
