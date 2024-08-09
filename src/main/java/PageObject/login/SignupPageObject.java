package PageObject.login;


import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pathFolder.pathFile.*;

public class SignupPageObject {
    public WebDriver driver;
    public Faker faker;

    public String emailWithSpecialSymbol;
    public String email;

    public String phoneNumber;

    public int firstDigit;
    public String remainingDigits;


    public SignupPageObject(WebDriver driver, Faker faker) {
        this.driver = driver;
        this.faker = faker;
    }

    public void userOnSignupPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGNUP_CREATEACCOUNT_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(SIGNUP_CREATEACCOUNT_TEXT)).isDisplayed());
    }

    public void enterName(String Name) throws InterruptedException {
        driver.findElement(By.xpath(SIGNUP_NAME)).sendKeys(Name);
    }

    public void enterOrganization(String Organization) {
        driver.findElement(By.xpath(SIGNUP_ORGANIZATION)).sendKeys(Organization);

    }

    public void enterEmailWithSpecialSymbol() {
        email = faker.internet().emailAddress();
        emailWithSpecialSymbol = "#$%" + email;
        driver.findElement(By.xpath(EMAIL)).sendKeys(emailWithSpecialSymbol);

    }

    public void enterEmail() {
        email = faker.internet().emailAddress();
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void enterPhoneNo() {
        firstDigit = faker.number().numberBetween(1, 10);
        remainingDigits = faker.number().digits(9);
        phoneNumber = firstDigit + remainingDigits;
        driver.findElement(By.xpath(SIGNUP_PHONE)).sendKeys(phoneNumber);
    }

    public void enterPassword(String Password) {
        driver.findElement(By.xpath(PASSWORD)).sendKeys(Password);
    }

    public void clickSignupBtn() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(SUBMIT)).click();

    }

    public void createUser() {
        driver.findElement(By.xpath(GO_SIGNUP_PAGE)).click();
    }


    public void waitForNotRedirectSignupPage() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TEN_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SIGNUP_LOGIN_CHECKYUORBOX_TEXT)));
        Assert.assertFalse(driver.findElement(By.xpath(SIGNUP_LOGIN_CHECKYUORBOX_TEXT)).isDisplayed());
    }

    public void enterPhoneNoWithNull(String PhoneNo) {
        driver.findElement(By.xpath(SIGNUP_PHONE)).sendKeys(PhoneNo);
    }
}
