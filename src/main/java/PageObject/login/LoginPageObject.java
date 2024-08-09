package PageObject.login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pathFolder.pathFile;

import java.time.Duration;

import static pathFolder.pathFile.*;

public class LoginPageObject {
    public WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void userOnLoginPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LOGIN_TEXT)));
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath(pathFile.EMAIL)).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath(pathFile.PASSWORD)).sendKeys(password);
    }

    public void clickLogin() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(pathFile.LOGIN_BTN)).click();
    }

    public void successfullyLogin()  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SCREEN_TEXT_HOMEPAGE)));
        Assert.assertTrue(driver.findElement(By.xpath(SCREEN_TEXT_HOMEPAGE)).isDisplayed());
    }

    public void checkYourBoxPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGNUP_LOGIN_CHECKYUORBOX_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(SIGNUP_LOGIN_CHECKYUORBOX_TEXT)).isDisplayed());
    }
}
