package stepsFolder.dashboard.content;

import PageObject.dashboard.content.CanvasPageObject;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Canvas {
    private WebDriver driver;
    private CanvasPageObject canvasPageObject;

    public Canvas() {
    }

    public Canvas(WebDriver driver, CanvasPageObject canvasPageObject) {
        this.driver = driver;
        this.canvasPageObject = canvasPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        this.driver = DriverManager.getDriver();
        Faker faker = new Faker();
        canvasPageObject = new CanvasPageObject(DriverManager.getDriver(), faker);
    }

    @Then("User redirect to canvas page")
    public void user_redirect_to_canvas_page() throws InterruptedException {
        canvasPageObject.clickOnCanvasBtn();
    }

    @Given("User on canvas page")
    public void userOnCanvasPage() {
        canvasPageObject.verifyUserOnCanvasPage();

    }

    @When("Click on create canvas")
    public void clickOnCreateCanvas() throws InterruptedException {
        canvasPageObject.clickCreateCanvasBtn();

    }

    @And("Click on Screen in Canvas page")
    public void clickOnScreenInCanvasPage() throws InterruptedException {
        canvasPageObject.clickOnScreen();
    }

    @And("Click on add to text button")
    public void clickOnAddToTextButton() {
        canvasPageObject.addToText();
    }


    @And("Click on Align to Left in align")
    public void clickOnAlignToLeftInAlign() throws InterruptedException {
        canvasPageObject.alignToLeft();
    }

    @And("Click on Center Horizontally in align")
    public void clickOnCenterHorizontallyInAlign() throws InterruptedException {
        canvasPageObject.centerHorizontally();
    }

    @And("Click on Align to Right in align")
    public void clickOnAlignToRightInAlign() throws InterruptedException {
        canvasPageObject.alignToRight();
    }

    @And("Click on Align to Top in align")
    public void clickOnAlignToTopInAlign() throws InterruptedException {
        canvasPageObject.alignToTop();
    }

    @And("Click on Center Vertically in align")
    public void clickOnCenterVerticallyInAlign() throws InterruptedException {
        canvasPageObject.centerVertically();
    }

    @And("Click on Align to Bottom in align")
    public void clickOnAlignToBottomInAlign() throws InterruptedException {
        canvasPageObject.alignToBottom();
    }

    @And("Click on Save and exit button")
    public void clickOnSaveAndExitButton() throws InterruptedException {

        canvasPageObject.clickOnSaveAndExit();
    }

    @And("Click on circle button")
    public void clickOnCircleButton() {
        canvasPageObject.clickOnCircle();
    }

    @And("Click on rectangle button")
    public void clickOnRectangleButton() {
        canvasPageObject.clickOnRectangle();
    }

    @And("Click on square button")
    public void clickOnSquareButton() {
        canvasPageObject.clickOnSquare();
    }

    @And("Click on triangle button")
    public void clickOnTriangleButton() {
        canvasPageObject.clickOnTriangle();
    }

    @And("Click on pentagon button")
    public void clickOnPentagonButton() {
        canvasPageObject.clickOnPentagon();
    }

    @And("Click on line button")
    public void clickOnLineButton() {
        canvasPageObject.clickOnLine();
    }

    @When("User click on sort and select By name")
    public void userClickOnSortAndSelectByName() throws InterruptedException {
        canvasPageObject.clickOnSortByName();
    }

    @Then("User visible canvas by name")
    public void userVisibleCanvasByName() {
        canvasPageObject.visibleOnFirstImg();
    }

    @When("Create blank template with name")
    public void createBlankTemplateWithName() {
        canvasPageObject.clickOnBlankTemplate();
        canvasPageObject.enterTemplateName();
    }

    @And("Click on save button")
    public void clickOnSaveButton() throws InterruptedException {
        canvasPageObject.clickOnSaveTemplate();
    }

    @And("Click on navigate back")
    public void clickOnNavigateBack() throws InterruptedException {
        canvasPageObject.clickOnNavigateBack();
    }

    @And("Select Option with yes")
    public void selectOptionWithYes() {
        canvasPageObject.clickOptionWithYes();
    }

    @And("Select Option with no")
    public void selectOptionWithNo() {
        canvasPageObject.clickOptionWithNo();
    }

    @Then("User on created canvas page")
    public void userOnCreatedCanvasPage() {
        canvasPageObject.userOnCreatedPage();
    }

    @And("Click on save button in canvas")
    public void clickOnSaveButtonInCanvas() throws InterruptedException {
        canvasPageObject.clickOnSaveCanvas();
    }
}
