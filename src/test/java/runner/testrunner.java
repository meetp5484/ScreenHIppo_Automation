package runner;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepsFolder.driverManager.DriverManager;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue= {"stepsFolder"},
        plugin = {"pretty","html:target/htmlreports/index.html"}
)
public class testrunner extends AbstractTestNGCucumberTests {


    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
