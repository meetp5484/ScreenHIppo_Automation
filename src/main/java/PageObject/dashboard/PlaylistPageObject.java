package PageObject.dashboard;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

import static pathFolder.pathFile.*;

public class PlaylistPageObject {
    public WebDriver driver;
    public Faker faker;
    public static String name;

    public PlaylistPageObject(WebDriver driver, Faker faker) {
        this.driver = driver;
        this.faker = faker;
    }

    public void clickOnPLaylist() {
        driver.findElement(By.xpath(PLAYLIST_BTN)).click();
    }

    public void clickToCreatePlaylist() {
        driver.findElement(By.xpath(CREATE_PLAYLIST)).click();
    }

    public void enterNewPLaylistName() {
        name = faker.name().firstName();
        driver.findElement(By.xpath(ENTER_PLAYLIST_NAME)).sendKeys(name);

    }

    public void selectThumbnail() {
        driver.findElement(By.xpath("//div[3]//figure[1]//img[1]")).click();
    }

    public void clickOnCreate() {
        driver.findElement(By.xpath(CREATE_BTN)).click();
    }

    public void clickNavigateBack() {
        driver.findElement(By.xpath(NaviGATE_BACK_PLAYLIST)).click();
    }

    public void addContentIsDisplay() {
        Assert.assertTrue(driver.findElement(By.xpath(ADD_CONTENT_TO_PLAYLIST_TEXT)).isDisplayed());
    }

    public void enterNameInSearchBox(String Name) {
        driver.findElement(By.xpath(SEARCH_BY_NAME)).sendKeys(Name);
    }
}
