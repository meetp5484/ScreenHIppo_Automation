package PageObject.login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pathFolder.pathFile.*;

public class ForgotPageObject {
    public WebDriver driver;
    public Boolean isElementVisible;

    public ForgotPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void userGOForgotPage() {
        driver.findElement(By.xpath(FORGOT_PASSWORD)).click();
    }

    public void userOnForgotPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FORMGOT_PASSWORD_TEXT)));
    }

    public void enterEmail(String email) {
        driver.findElement(By.xpath(FORGOT_EMAILID)).sendKeys(email);
    }

    public void sendLinkBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(SEND_RESET_LINK)).click();
    }

    public void errorMsgShowForInvalidEamil() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath(FORGOT_ERROR_EMAIL)).isDisplayed());
    }

    public void errorMsgShowForNullEmail() throws InterruptedException {
Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath(FORGOT_ERROR_ENTER_EMAIL)).isDisplayed());
    }

}