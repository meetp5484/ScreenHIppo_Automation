package PageObject.dashboard;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static pathFolder.pathFile.*;

public class FooterPageObject {
    public WebDriver driver;

    public FooterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void footerTextVisible() {
        WebElement footerText = driver.findElement(By.xpath(POWERED_BY_SCREENHPPO_TEXT));
        Assert.assertTrue(footerText.isDisplayed());
    }

    public void clickOnContacts() {
        driver.findElement(By.xpath(CONTACT_US)).click();
    }

    public void userOnContactUsPage() throws InterruptedException {
        Set<String> currentWndow = driver.getWindowHandles();
        Iterator<String> iterator = currentWndow.iterator();
        String thisPage = iterator.next();
        String nextPage = iterator.next();
        driver.switchTo().window(nextPage);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INSIDE_CONTACT_US_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(INSIDE_CONTACT_US_TEXT)).isDisplayed());
    }

    public void userOnPricacyPolicy() throws InterruptedException {
        Set<String> currentWndow = driver.getWindowHandles();
        Iterator<String> iterator = currentWndow.iterator();
        String thisPage = iterator.next();
        String nextPage = iterator.next();
        driver.switchTo().window(nextPage);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PRIVACY_POLICY_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(PRIVACY_POLICY_TEXT)).isDisplayed());
    }

    public void userClickOnPrivacyPolicy() {

        driver.findElement(By.xpath(PRIVACY_POLICY)).click();


    }

    public void userClickOnTermsAndConditions() {
        driver.findElement(By.xpath(TERMS_AND_CONDITIONS)).click();
    }

    public void userOnTermsAndConditions() throws InterruptedException {
        Set<String> currentWndow = driver.getWindowHandles();
        Iterator<String> iterator = currentWndow.iterator();
        String thisPage = iterator.next();
        String nextPage = iterator.next();
        driver.switchTo().window(nextPage);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TERMS_AND_CONDITIONS_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(TERMS_AND_CONDITIONS_TEXT)).isDisplayed());

    }
}
