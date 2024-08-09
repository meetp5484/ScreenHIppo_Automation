package stepsFolder.dashboard;

import PageObject.dashboard.PlaylistPageObject;
import PageObject.dashboard.userAvtar.LogoutPageObject;
import com.beust.ah.A;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import stepsFolder.driverManager.DriverManager;

import java.io.IOException;

public class Playlist {
    private WebDriver driver;
    private PlaylistPageObject playlistPageObject;

    public Playlist() {
    }

    public Playlist(WebDriver driver, PlaylistPageObject playlistPageObject) {
        this.driver = driver;
        this.playlistPageObject = playlistPageObject;
    }

    @Before
    public void setUp() throws IOException, InterruptedException {
        DriverManager.setupBrowser();
        this.driver = DriverManager.getDriver();
        Faker faker = new Faker();
        playlistPageObject = new PlaylistPageObject(DriverManager.getDriver(), faker);
    }



    @Given("User redirect to playlist page")
    public void user_redirect_to_playlist_page() {
        playlistPageObject.clickOnPLaylist();
    }

    @When("User click on Create Playlist")
    public void user_click_on_create_playlist() {
        playlistPageObject.clickToCreatePlaylist();
    }

    @When("User enter name, select thumbnail and click on Create")
    public void user_enter_name_select_thumbnail_and_click_on_create() {
        playlistPageObject.enterNewPLaylistName();
        playlistPageObject.selectThumbnail();
        playlistPageObject.clickOnCreate();
    }

    @Then("Check if the playlist has been created")
    public void check_if_the_playlist_has_been_created() {
playlistPageObject.addContentIsDisplay();
    }


    @When("Search playlist By {string}")
    public void searchPlaylistBy(String Name) {
        playlistPageObject.enterNameInSearchBox(Name);
    }

    @Then("Searched playlist visible")
    public void searchedPlaylistVisible() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'New Playlist (2)')]")).isDisplayed());
    }
}
