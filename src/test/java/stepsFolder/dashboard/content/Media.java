package stepsFolder.dashboard.content;


import PageObject.dashboard.content.MediaPageObject;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;


public class Media {
    private WebDriver driver;
    private MediaPageObject mediaPageObject;

    public Media() {
    }

    public Media(WebDriver driver, MediaPageObject mediaPageObject) {
        this.driver = driver;
        this.mediaPageObject = mediaPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        mediaPageObject = new MediaPageObject(DriverManager.getDriver());
    }


    @Then("User redirect to media page")
    public void user_redirect_to_media_page() throws InterruptedException {
        mediaPageObject.userRedirectToMediaPage();
    }

    @Given("User on media page")
    public void userOnMediaPage() {
        mediaPageObject.mediaPageVisible();
    }

    @When("User click on upload button")
    public void userClickOnUploadButton() throws InterruptedException {
        mediaPageObject.clickOnUploadBtn();
    }

    @And("Select file and upload file")
    public void selectFileAndUploadFile() throws InterruptedException {
        mediaPageObject.validImageUpload();
    }

    @And("User click to upload media")
    public void userClickToUploadMedia() throws InterruptedException {
        mediaPageObject.clickUploadMedia();
    }

    @And("Select invalid file and upload file")
    public void selectInvalidFileAndUploadFile() throws InterruptedException {
        mediaPageObject.uploadInvalidFile();

    }

    @And("User click on back button")
    public void userClickOnBackButton() {
        mediaPageObject.navigateBack();
    }


    @And("Select {string} and upload file")
    public void selectAndUploadFile(String files) throws InterruptedException {
        mediaPageObject.checkMaxCapOnItemWithPositive(files);
    }

    @And("User show error msg")
    public void userShowErrorMsg() {
        mediaPageObject.ShowErrorMsg();
    }

    @And("User show file not accepted msg")
    public void userShowFileNotAcceptedMsg() {
        mediaPageObject.notAcceptedFile();
    }
}
