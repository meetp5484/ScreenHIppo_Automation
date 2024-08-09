package PageObject.dashboard.content;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static pathFolder.pathFile.*;

public class MediaPageObject {
    public WebDriver driver;

    public MediaPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void userRedirectToMediaPage() throws InterruptedException {
        WebElement contentBtn = driver.findElement(By.xpath(CONTENT_BTN));
        contentBtn.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(contentBtn).perform();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(MEDIA_BTN)).click();
    }

    public void mediaPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_TWENTY_SECOND));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MEDIA_TEXT)));
        Assert.assertTrue(driver.findElement(By.xpath(MEDIA_TEXT)).isDisplayed());
    }

    public void clickOnUploadBtn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(UPLOAD_BTN)).click();
    }

    public void validImageUpload() throws InterruptedException {
        WebElement fileInput = driver.findElement(By.xpath(INPUT_FILE));
        fileInput.sendKeys(INPUT_FILE_PATH + "/image/Untitled.jpeg");
        Thread.sleep(2000);

    }

    public void clickUploadMedia() throws InterruptedException {
        driver.findElement(By.xpath(UPLOAD_MEDIA)).click();
    }


    public void uploadInvalidFile() throws InterruptedException {
        WebElement fileInput = driver.findElement(By.xpath(INPUT_FILE));
        fileInput.sendKeys(INVALID_FILE);
        Thread.sleep(2000);


    }

    public void navigateBack() {
        driver.findElement(By.xpath(NAVIGATE_BACK_UPLOAD)).click();
    }

    public void checkMaxCapOnItemWithPositive(String file) throws InterruptedException {
//        List<String> fileNames = List.of(file.split(","));
//        WebElement fileInput = driver.findElement(By.xpath(INPUT_FILE));
//        StringBuilder allFilePaths = new StringBuilder();
//        for (String filePath : fileNames) {
//            allFilePaths.append(filePath).append("\n");
//        }
//        String allfile = INPUT_FILE_PATH +allFilePaths.toString().trim();
//        fileInput.sendKeys(allfile);

        List<String> fileNames = List.of(file.split(","));
        WebElement fileInput;
//

        for (String fileName : fileNames) {
            fileInput = driver.findElement(By.xpath(INPUT_FILE));
            String filePath = INPUT_FILE_PATH + fileName.trim();
            fileInput.sendKeys(filePath);
            Thread.sleep(1000); // Add a delay if needed to allow each file to upload before adding the next one
        }
    }

    public void uploadMediaNotShow() {
        Assert.assertFalse(driver.findElement(By.xpath(UPLOAD_MEDIA)).isDisplayed());
    }


    public void ShowErrorMsg() {
        Assert.assertTrue(driver.findElement(By.xpath(POPUP_MAX_CAP_ON_ITEM_TEXT)).isDisplayed());    }

    public void notAcceptedFile() {
        Assert.assertTrue(driver.findElement(By.xpath(POPUP_INVALID_FORMAT_ITEM_TEXT)).isDisplayed());
    }
}
