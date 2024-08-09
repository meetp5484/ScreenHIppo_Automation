package stepsFolder.dashboard.content;

import PageObject.dashboard.content.LinkPageObject;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Link {
    private WebDriver driver;
    private LinkPageObject linkPageObject;

    public Link() {
    }

    public Link(WebDriver driver, LinkPageObject linkPageObject) {
        this.driver = driver;
        this.linkPageObject = linkPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        Faker faker = new Faker();
        linkPageObject = new LinkPageObject(DriverManager.getDriver(), faker);
    }


    @Then("User redirect to Link page")
    public void user_redirect_to_link_page() throws InterruptedException {
        linkPageObject.clickOnLinkBtn();

    }

    @Given("User on link page")
    public void user_on_link_page() {
        linkPageObject.verifyUserOnLinkPage();
    }

    @When("Click on sort by name")
    public void click_on_sort_by_name() {

    }

    @Then("verify sort by name")
    public void verify_sort_by_name() {
        linkPageObject.verifyByName();
    }

    @When("Use click on add link")
    public void useClickOnAddLink() {
        linkPageObject.clickOnAddLink();
    }

    @And("User enter valid {string}.")
    public void userEnterValid(String Link) {
        linkPageObject.addLinkIntoLinks(Link);
    }

//    @And("User edit link name")
//    public void userEditLinkName() throws InterruptedException {
//        linkPageObject.nameOfLink();
//    }

    @And("User click on add link")
    public void userClickOnAddLink() {
        linkPageObject.clickOnAddLinkBtn();
    }

    @Then("Show error msg.")
    public void showErrorMsg() throws InterruptedException {
        linkPageObject.errorMsgForLink();
    }


}
