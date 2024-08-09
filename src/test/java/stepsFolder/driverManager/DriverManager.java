package stepsFolder.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverManager {
//    private static WebDriver driver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
//
    }

    public static void setupBrowser() throws IOException, InterruptedException {
        if (driver.get() == null) {
//            loginpageObject = new LoginPageObject(driver);
            Properties prop = new Properties();
            prop.load(new FileInputStream("C:\\Users\\meet.patel\\Desktop\\chromedriver_screenhippo\\ScreenHIppo_BDD\\src\\main\\resources\\config\\application.properties"));
            String baseurl = prop.getProperty("baseurl");
            String chromedriver = prop.getProperty("chromedriver");
            System.setProperty("webdriver.chrome.driver", chromedriver); // need to change you path
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver webdriver = new ChromeDriver(options);
            webdriver.manage().window().maximize();
            webdriver.get(baseurl);
            Thread.sleep(1000);
            driver.set(webdriver);
        }
    }

    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//        }
        if (driver.get() != null) {
            driver.get().close();
            driver.remove();
        }
    }
}
