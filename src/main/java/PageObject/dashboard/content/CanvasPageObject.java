package PageObject.dashboard.content;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pathFolder.pathFile.*;

public class CanvasPageObject {
    public Faker faker;
    public WebDriver driver;
    public static String tempname;

    public CanvasPageObject(WebDriver driver, Faker faker) {
        this.driver = driver;
        this.faker = faker;
    }

    public void clickOnCanvasBtn() throws InterruptedException {
        WebElement contentBtn = driver.findElement(By.xpath(CONTENT_BTN));
        contentBtn.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(contentBtn).perform();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(CANVAS_BTN)).click();
    }

    public void verifyUserOnCanvasPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CANVAS_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(CANVAS_TEXT)).isDisplayed());
    }

    public void clickCreateCanvasBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(CREATE_CANVAS_BTN)).click();
    }

    public void clickOnScreen() throws InterruptedException {
        driver.findElement(By.xpath(CLICK_SCREEN)).click();
        Thread.sleep(2000);
    }

    public void addToText() {
        driver.findElement(By.xpath(ADD_TEXT)).click();
    }

    public void alignToLeft() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(ALIGN_TO_LEFT)).click();
    }

    public void centerHorizontally() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(CENTER_HORIZONTALIY)).click();
    }

    public void alignToRight() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(ALIGN_TO_RIGHT)).click();
    }

    public void alignToTop() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(ALIGN_TO_TOP)).click();
    }

    public void centerVertically() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(CENTER_VERTICALLY)).click();
    }

    public void alignToBottom() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(ALIGN_TO_BOTTOM)).click();

    }

    public void clickDropDownSaveAndExit() {
        driver.findElement(By.xpath(SAVE_AND_EXIT)).click();
    }

    public void clickOnSaveAndExit() throws InterruptedException {
        WebElement SaveAndExit = driver.findElement(By.xpath(SAVE_AND_EXIT));
        SaveAndExit.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(SaveAndExit).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement saveAndExitInside = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SAVE_AND_EXIT_INSIDE)));
        saveAndExitInside.click();
    }

    public void clickOnCircle() {
        driver.findElement(By.xpath(ADD_CIRCLE)).click();

    }

    public void clickOnRectangle() {
        driver.findElement(By.xpath(ADD_RECTANGLE)).click();
    }

    public void clickOnSquare() {
        driver.findElement(By.xpath(ADD_SQUARE)).click();
    }

    public void clickOnTriangle() {
        driver.findElement(By.xpath(ADD_TRIANGLE)).click();
    }

    public void clickOnPentagon() {
        driver.findElement(By.xpath(ADD_PENTAGON)).click();
    }

    public void clickOnLine() {
        driver.findElement(By.xpath(ADD_LINE)).click();
    }

    public void clickOnSortByName() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(SORT_CANVAS)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(SORT_BY_NAME_CANVAS)).click();
    }

    public void visibleOnFirstImg() {
        Assert.assertTrue(driver.findElement(By.xpath(FIRST_IMG_NAME)).isDisplayed());
    }

    public void clickOnBlankTemplate() {
        driver.findElement(By.xpath(BLANK_TEMPLATE)).click();
    }

    public void enterTemplateName() {
        tempname = faker.name().firstName();
        driver.findElement(By.xpath(TEMPLATE_NAME)).sendKeys(tempname);
    }

    public void clickOnSaveTemplate() throws InterruptedException {
        driver.findElement(By.xpath(SAVE_TEMPLATE)).click();
        Thread.sleep(2000);
    }

    public void clickOnNavigateBack() throws InterruptedException {
//        Thread.sleep(1000);
        driver.findElement(By.xpath(NAVIGATE_BACK)).click();
        Thread.sleep(1000);
    }

    public void clickOptionWithYes() {
        driver.findElement(By.xpath(NAVIGATE_BACK_WITH_YES)).click();
    }

    public void clickOptionWithNo() {
        driver.findElement(By.xpath(NAVIGATE_BACK_WITH_NO)).click();
    }

    public void userOnCreatedPage() {
        Assert.assertTrue(driver.findElement(By.xpath(ADD_TEXT)).isDisplayed());
    }

    public void clickOnSaveCanvas() throws InterruptedException {
        driver.findElement(By.xpath(SAVE_CANVAS)).click();
        Thread.sleep(2000);
    }
}
