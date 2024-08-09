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

public class LinkPageObject {
    public WebDriver driver;
    public Faker faker;
    public static String tempname;

    public LinkPageObject(WebDriver driver, Faker faker) {
        this.driver = driver;
        this.faker = faker;
    }

    public void clickOnLinkBtn() throws InterruptedException {
        WebElement contentBtn = driver.findElement(By.xpath(CONTENT_BTN));
        contentBtn.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(contentBtn).perform();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(LINK_BTN)).click();
    }

    public void verifyUserOnLinkPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LINK_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(LINK_TEXT)).isDisplayed());
    }

    public void verifyByName() {
        Assert.assertTrue(driver.findElement(By.xpath(LINK_NAME_TEMP)).isDisplayed());
    }

    public void clickOnAddLink() {
        driver.findElement(By.xpath(ADD_LINK)).click();
    }

    public void addLinkIntoLinks(String Link) {
        driver.findElement(By.xpath(ENTER_URL)).sendKeys(Link);
        driver.findElement(By.xpath(URL_TEXT)).click();
    }

//    public void nameOfLink() throws InterruptedException {
//        Thread.sleep(2000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TWENTY_SECOND));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NAME_TEXT)));
//        Assert.assertTrue(driver.findElement(By.xpath(NAME_TEXT)).isDisplayed());
//        tempname = faker.name().firstName();
//        WebElement enterName = driver.findElement(By.xpath(NAME_EDIT_TEXT));
//        enterName.clear();
//        enterName.sendKeys(tempname);
//
//    }

    public void clickOnAddLinkBtn() {
        driver.findElement(By.xpath(ADD_BTN)).click();
    }

    public void errorMsgForLink() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath(ERROR_MSG)).isDisplayed());
    }
}
