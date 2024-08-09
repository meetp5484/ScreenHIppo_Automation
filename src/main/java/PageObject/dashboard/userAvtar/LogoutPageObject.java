package PageObject.dashboard.userAvtar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pathFolder.pathFile;

import static pathFolder.pathFile.*;

public class LogoutPageObject {
    public WebDriver driver;

    public LogoutPageObject(WebDriver driver) {
        this.driver = driver;
    }


    public void enterEmailForUser() {
        driver.findElement(By.xpath(pathFile.EMAIL)).sendKeys(EMAIL_FOR_USER);
    }

    public void enterPasswordForuser() {
        driver.findElement(By.xpath(pathFile.PASSWORD)).sendKeys(PASSWORD_FOR_USER);

    }

    public void clickOnUserAvtar() {
        driver.findElement(By.xpath(USERAVTAR)).click();
    }

    public void logout() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(LOGOUT_BTN)).click();
    }
}
