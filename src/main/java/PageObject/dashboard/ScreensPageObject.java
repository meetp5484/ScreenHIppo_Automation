package PageObject.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static pathFolder.pathFile.*;

public class ScreensPageObject {
    public WebDriver driver;

    public ScreensPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnPairScreens() {
        driver.findElement(By.xpath(PAIR_SCREEN)).click();
    }

    public void enterPinCode(String pinCode) throws InterruptedException {
        List<WebElement> codeInputs = driver.findElements(By.tagName(ENTER_DIGIT));
        if (codeInputs.size() == 6) {

            for (int i = 0; i < 6; i++) {
                codeInputs.get(i).sendKeys(String.valueOf(pinCode.charAt(i)));
            }
        } else {
            System.out.println("Error: Expected 6 input fields, found " + codeInputs.size());
        }
        Thread.sleep(1000);

    }
}
